import java.util.*;

public class Ex5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double kilo;
		
		System.out.println("Enter value in pounds to be converted to kilos: ");
		kilo = sc.nextDouble();
		
		kilo = kilo / 2.2;
		
		System.out.println("The value in kilos is: " + kilo);
	}
}