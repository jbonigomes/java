import java.util.*;

public class OblongTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double oblongLength, oblongHeight;

		Oblong myOblong;

		System.out.print("Please enter the length of your oblong: ");
		oblongLength = sc.nextDouble();
		System.out.print("Please enter the height of your oblong: ");
		oblongHeight = sc.nextDouble();

		myOblong = new Oblong(oblongLength, oblongHeight);

		System.out.println("Oblong length is " + myOblong.getLength());
		System.out.println("Oblong height is " + myOblong.getHeight());
		System.out.println("Oblong area is " + myOblong.calculateArea());
		System.out.println("Oblong perimeter is " + myOblong.calculatePerimeter());
	}
}