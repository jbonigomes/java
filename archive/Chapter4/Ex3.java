import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char choice, again;
		double temp;
		
		do
		{
			System.out.println();
			System.out.println("*** Converter ***");
			System.out.println();
			System.out.print("Enter the temperature to be converted: ");

			temp = sc.nextDouble();

			System.out.println();
			System.out.println("[1] to Fahrenheit");
			System.out.println("[2] to Celsius");
			System.out.println("[3] Quit");
			System.out.println();
			System.out.print("Enter your choice [1-3]: ");
			
			choice = sc.next().charAt(0);
			
			System.out.println();

			switch(choice)
			{
				case '1':
					if(celIsValid(temp))
					{
						temp = celsFahr(temp);
						System.out.println("The converted value is " + temp + "F");
					}
					else
					{
						System.out.println("The value entered is below the absolute zero!");
					}	
				break;

				case '2':
					if(fahrIsValid(temp))
					{
						temp = fahrCels(temp);
						System.out.println("The converted value is " + temp + "C");
					}
					else
					{
						System.out.println("The value entered is below the absolute zero!");
					}	
				break;
				
				case '3':
				break;

				default:
					System.out.println("Options 1 or 2 only!");
			}
			
			System.out.println();
			System.out.print("Try again? (Y/N): ");

			again = sc.next().charAt(0);
			
		} while(again == 'y' || again == 'Y');
		
		System.out.println();
		System.out.println("Good Bye!");
		System.out.println();
	}
	
	private static double celsFahr(double tempIn)
	{
		tempIn = ((9 * tempIn) / 5) + 32;
		
		return tempIn;
	}
	
	private static double fahrCels(double tempIn)
	{
		tempIn = (5 * (tempIn - 32)) / 9;
		
		return tempIn;
	}
	
	private static boolean celIsValid(double tempIn)
	{
		if(tempIn >= -273.15)
		{
			return true;
		}
		
		return false;
	}
	
	private static boolean fahrIsValid(double tempIn)
	{
		if(tempIn >= -459.67)
		{
			return true;
		}
		
		return false;
	}
}