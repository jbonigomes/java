import java.util.Scanner;

public class FindCostWithDiscount
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
		
		if(price > 100)
		{
			System.out.println("Special Promotion: Your tax will be halved!");
			tax = tax * 0.5;
		}
		
		price = price * (1 + tax/100);
		System.out.println("Cost after tax = " + price);
	}
}