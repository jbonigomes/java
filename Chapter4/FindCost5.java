import java.util.*;

public class FindCost5
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

		price = addTax(price, tax);

		System.out.println("Cost after tax = " + price);
	}

	private static double addTax(double priceIn, double taxIn)
	{
		return priceIn * (1 + taxIn/100);
	}
}