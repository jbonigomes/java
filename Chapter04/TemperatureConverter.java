import java.util.*;

public class TemperatureConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		char choice;
		double temperature;

		do
		{
			System.out.println("*** TEMPERATURE CONVERTER ***");
			System.out.println("1. Convert Celsius to Fahrenheit");
			System.out.println("2. Convert Fahrenheit to Celsius");
			System.out.println("3. Quit");
			System.out.print("Enter choice [1-3]: ");
			choice = sc.next().charAt(0);

			switch(choice)
			{
				case '1':
					System.out.print("Enter temperature in Celsius: ");
					temperature = sc.nextDouble();
					if(temperature < -273.15)
					{
						System.out.println("You have entered a value below the absolute zero (-273.15C), please try again!");
					}
					else
					{
						System.out.println("The temperature converted into Fahrenheit is " + CelsiusToFahrenheit(temperature));
					}
				break;

				case '2':
					System.out.print("Enter temperature in Fahrenheit: ");
					temperature = sc.nextDouble();
					if(temperature < -459.67)
					{
						System.out.println("You have entered a value below the absolute zero (-459.67F), please try again!");
					}
					else
					{
						System.out.println("The temperature converted into Celsius is " + FahrenheitToCelsius(temperature));
					}
				break;

				case '3':
					System.out.println("Goodbye!");
				break;

				default:
					System.out.println("Only options from 1 to 3 allowed!");
			}

		} while(choice != '3');
	}

	private static double CelsiusToFahrenheit(double temperatureIn)
	{
		return ((9 * temperatureIn) / 5) + 32;
	}

	private static double FahrenheitToCelsius(double temperatureIn)
	{
		return (5 * (temperatureIn - 32)) / 9;
	}
}