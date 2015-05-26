public class FindCost2
{
	public static void main(String[] args)
	{
		double price, tax;
		price = 500;
		tax = 17.5;
		price = price * (1 + tax/100);
		System.out.println("*** Product Price Check ***");
		System.out.println("Cost after tax = " + price);
	}
}