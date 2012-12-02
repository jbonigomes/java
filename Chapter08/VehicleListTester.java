import java.util.Calendar;

public class VehicleListTester
{
	public static void main(String[] args)
	{
		VehicleList myCars;
		int total;
		char choice;

		System.out.println("*** VEHICLE LIST TESTER ***");
		System.out.print("Enter how many vehicles to store: ");
		total = EasyScanner.nextInt();

		myCars = new VehicleList(total);

		do
		{
			System.out.println();
			System.out.println("1. Add a vehicle");
			System.out.println("2. Display a list of vehicle details");
			System.out.println("3. Delete a vehicle");
			System.out.println("4. Quit");
			System.out.print("Enter choice [1-4]: ");
			choice = EasyScanner.nextChar();

			System.out.println();

			switch(choice)
			{
				case '1':
					if(addVehicleToList(myCars))
					{
						System.out.println("Vehicle added!");
					}
					else
					{
						System.out.println("The list is full");
					}
				break;

				case '2':
					System.out.println("Vehicle details:");
					displayVehiclesDetails(myCars);
				break;

				case '3':
					if(deleteVehicleFromList(myCars))
					{
						System.out.println("Vehicle removed");
					}
					else
					{
						System.out.println("Vehicle not found");
					}
				break;

				case '4':
					System.out.println("Goodbye");
				break;

				default:
					System.out.println("Options from 1-4 only! Try again");
			}

			System.out.println();

		} while(choice != '4');
	}

	private static boolean addVehicleToList(VehicleList myCarsIn)
	{
		Vehicle tempCar;
		String regNo, make;
		int year;
		double value;
		char isSecondHand;
		int numberOfOwners = 0;

		System.out.print("Enter Reg Number: ");
		regNo = EasyScanner.nextString();
		System.out.print("Enter make: ");
		make = EasyScanner.nextString();
		System.out.print("Enter year: ");
		year = EasyScanner.nextInt();
		System.out.print("Enter value: ");
		value = EasyScanner.nextDouble();
		System.out.print("Is second hand [Y/N]: ");
		isSecondHand = EasyScanner.nextChar();

		if(isSecondHand == 'Y' || isSecondHand == 'y')
		{
			System.out.print("How many owners: ");
			numberOfOwners = EasyScanner.nextInt();

			tempCar = new SecondHandVehicle(regNo, make, year, value, numberOfOwners);
		}
		else
		{
			tempCar = new NewVehicle(regNo, make, year, value);
		}

		if(myCarsIn.addVehicle(tempCar))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static void displayVehiclesDetails(VehicleList myCarsIn)
	{
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		Vehicle tempCar;

		for(int i = 0; i < myCarsIn.getTotal(); i++)
		{
			tempCar = myCarsIn.getVehicle(i);

			System.out.println("Reg number: " + tempCar.getRegNo());
			System.out.println("Make: " + tempCar.getMake());
			System.out.println("Year: " + tempCar.getYear());
			System.out.println("Value: " + tempCar.getValue());
			System.out.println("Age: " + tempCar.calculateAge(thisYear));

			if(tempCar.getType().equals("New"))
			{
				System.out.println("This is a brand new car");
			}
			else
			{
				SecondHandVehicle tempSecondHandCar = (SecondHandVehicle)tempCar;
				
				if(tempSecondHandCar.hasMultipleOwners())
				{
					System.out.println("One owner only");
				}
				else
				{
					System.out.println("Number of owners: " + tempSecondHandCar.getNumberOfOwners());
				}
			}

			System.out.println();
		}
	}

	private static boolean deleteVehicleFromList(VehicleList myCarsIn)
	{
		String regNo;
		Vehicle tempCar;

		System.out.print("Enter reg number to delete: ");
		regNo = EasyScanner.nextString();

		for(int i = 0; i < myCarsIn.getTotal(); i++)
		{
			tempCar = myCarsIn.getVehicle(i);

			if(regNo.equals(tempCar.getRegNo()))
			{
				myCarsIn.deleteVehicle(i);
				return true;
			}
		}

		return false;
	}
}