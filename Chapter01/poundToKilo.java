import java.util.Scanner;

public class poundToKilo
{
	public static void main(String[] args)
	{
		double pound, kilo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value to be converted from pound(s) to kil(o): ");
		pound = sc.nextInt();

		kilo = pound / 2.2;

		System.out.println("The value in kilo(s) is: " + kilo);
	}
}