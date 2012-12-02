import java.util.*;

public class Pi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double circleArea;
		double radius;

		System.out.print("Enter radius of circle: ");
		radius = sc.nextDouble();

		circleArea = calculateAreaPi(radius);

		System.out.println("The area of a circle with radius of " + radius + " is " + circleArea);
	}

	private static double calculateAreaPi(double radiusIn)
	{
		final double pi = 3.142;
		return pi * (radiusIn * radiusIn);
	}
}