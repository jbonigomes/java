import java.util.*;

public class TemperatureReadings2
{
	public static void main(String[] args)
	{
		double[] temperature = new double[7];
		enterTemps(temperature);
		displayTemps(temperature);
	}

	private static void enterTemps(double[] temperatureIn)
	{
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("Enter max temperature for day " + (i + 1) + ": ");
			temperatureIn[i] = sc.nextDouble();
		}
	}

	private static void displayTemps(double[] temperatureIn)
	{
		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED ***");

		for(int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("day " + (i + 1) + " = " + temperatureIn[i]);
		}
	}
}