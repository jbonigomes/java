import java.util.*;

public class Ex2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double kilo;
		
		System.out.println("Enter value in pounds to be converted to kilos: ");
		kilo = sc.nextDouble();
		
		kilo = convert(kilo);
		
		System.out.println("The value in kilos is: " + kilo);
	}
	
	private static double convert(double kiloIn)
	{
		kiloIn = kiloIn / 2.2;
		
		return kiloIn;
	}
}