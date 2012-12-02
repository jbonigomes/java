import java.util.Calendar;

public class VehicleTester
{
	public static void main(String[] args)
	{
  		int thisYear = Calendar.getInstance().get(Calendar.YEAR);

		SecondHandVehicle car = new SecondHandVehicle("555", "Nissan", 2000, 800.0, 2);

		System.out.println("Reg Number: " + car.getRegNo());
		System.out.println("Make: " + car.getMake());
		System.out.println("Year: " + car.getYear());
		System.out.println("Value: " + car.getValue());
		System.out.println("Age: " + car.calculateAge(thisYear));
		System.out.println("Number of owners: " + car.getNumberOfOwners());
		System.out.println("Had multiple owners: " + car.hasMultipleOwners());

		System.out.println();

		System.out.println("Setting new value...");
		car.setValue(500.0);

		System.out.println();

		System.out.println("New Value: " + car.getValue());
	}
}