import java.text.*;

/** A program to input the initial price of a product
 *  and then calculate and display its cost after tax has been added
 */
public class FindCost
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.00");

		double price, tax;

		System.out.println("\n\t\t *** Product Price Check *** \n");

		System.out.print("\n\t Enter initial price: \t");
		price = EasyScanner.nextDouble();

		System.out.print("\n\t Enter tax rate: \t");
		tax = EasyScanner.nextDouble();

		price = price * (1 + tax/100);
		System.out.println("\n\t Cost after tax: \t" + df.format(price) + "\n\n");
	}
}