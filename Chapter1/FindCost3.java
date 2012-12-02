import java.util.Scanner;

/* a program to input the initial price of a product and then calculate and display its cost after tax has been added */

public class FindCost3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double price, tax;
		System.out.println("*** Product Price Check ***");
		System.out.print("Enter initial price: ");
		price = sc.nextDouble();
		System.out.print("Enter tax rate: ");
		tax = sc.nextDouble();
		price = price * (1 + tax/100);
		System.out.println("Cost after tax = " + price);
	}
}