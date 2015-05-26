import java.util.*;

public class TemperatureReadings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double[] temperature = new double[7];

		for(int i = 0; i < temperature.length; i++)
		{
			System.out.print("Enter max temperature for day " + (i + 1) + ": ");
			temperature[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED ***");

		for(int i = 0; i < temperature.length; i++)
		{
			System.out.println("day " + (i + 1) + " = " +temperature[i]);
		}
	}
}