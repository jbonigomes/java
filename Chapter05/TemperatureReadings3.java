import java.util.*;

public class TemperatureReadings3
{
	public static void main(String[] args)
	{	
		double[] temperature;
		temperature = enterTemps();
		displayTemps(temperature);
	}

	private static double[] enterTemps()
	{
		Scanner sc = new Scanner(System.in);
		double[] temperatureOut = new double[7];
		for(int i = 0; i < temperatureOut.length; i++)
		{
			System.out.print("Enter max temperature for day " + (i + 1) + ": ");
			temperatureOut[i] = sc.nextDouble();
		}
		return temperatureOut;
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