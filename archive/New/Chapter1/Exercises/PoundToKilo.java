import java.util.Scanner;

public class PoundToKilo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double pounds, kilos;
		
		System.out.println("*** Pound To Kilo ***");
		System.out.print("Enter value in pounds to be converted into kilos: ");
		pounds = sc.nextDouble();
		
		kilos = pounds / 2.2;
		
		System.out.println(pounds + " Pounds = " + kilos + " Kilos");
	}
}