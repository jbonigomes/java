 /** Calculates the Hypotenuse squared
  *  based on Pythagoras Theorem
  *  @author Jose B. Gomes
  *  @version 25th November 2012
  */
public class Quality
{
	/** Hypotenuse Squared Program's entry point */
	public static void main(String[] args)
	{
		double side1, side2;

		System.out.println("Pythagoras Calculator");

		System.out.print("Enter value for side 1 of the triangle: ");
		side1 = EasyScanner.nextDouble();

		System.out.print("Enter value for side 2 of the triangle: ");
		side2 = EasyScanner.nextDouble();

		System.out.println("Hypotenuse squared = " + calcHypotenuseSquared(side1, side2));
	}

	/** Helper method to calculate the Hypotenuse Squared of given two sides of a triangle
	 *  @return the Hypotenuse Squared of given two sides of a triangle
	 */
	private static double calcHypotenuseSquared(double s1In, double s2In)
	{
		return square(s1In) + square(s2In);
	}

	/** Helper method to calculate the square of a given number
	 *  @return the square of the number input
	 */
	private static double square(double sIn)
	{
		return sIn * sIn;
	}
}