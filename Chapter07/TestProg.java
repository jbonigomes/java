public class TestProg
{
	public static void main(String[] args)
	{
		String tempNumber;
		String tempName;
		double tempPrice;

		System.out.print("Enter the stock number: ");
		tempNumber = EasyScanner.nextString();
		System.out.print("Enter the name of the item: ");
		tempName = EasyScanner.nextString();
		System.out.print("Enter the price of the item: ");
		tempPrice = EasyScanner.nextDouble();

		StockItem tempStock = new StockItem(tempNumber, tempName, tempPrice);

		tempStock.increaseTotalStock(5);
		
		System.out.println("*** Before Tax ***");
		System.out.println("Stock Number: " + tempStock.getStockNumber());
		System.out.println("Total value in stock: " + tempStock.calculateTotalPrice());

		StockItem.setSalesTax(17.5);
		tempStock.addSalesTax();

		System.out.println("*** After Tax ***");
		System.out.println("Stock Number: " + tempStock.getStockNumber());
		System.out.println("Total value in stock: " + tempStock.calculateTotalPrice());
	}
}