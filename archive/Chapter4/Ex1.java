import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the circle's radius: ");
		double radius = sc.nextDouble();
		
		double area = getArea(radius);
		
		System.out.println("The area of the circle is " + area);
	}
	
	private static double getArea(double radiusIn)
	{
		double areaOut =  (radiusIn * radiusIn) * 3.142;
		
		return areaOut;
	}
}