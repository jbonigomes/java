import java.util.*;

public class FindCost4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double price, tax;
		char reply;

		do
		{
			System.out.println("*** Product Price Check ***");
			System.out.print("Enter initial price: ");
			price = sc.nextDouble();
			System.out.print("Enter tax rate: ");
			tax = sc.nextDouble();

			price = price * (1 + tax/100);

			System.out.println("Cost after tax = " + price);
			System.out.println();
			System.out.print("Would you like to enter another product(y/n)? ");
			reply = sc.next().charAt(0);
			System.out.println();
		} while(reply == 'y' || reply == 'Y');
	}
}