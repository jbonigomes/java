public class StockItem
{
	private String stockNumber;
	private String stockName;
	private double price;
	private int totalStock;
	private static double salesTax;

	public StockItem(String stockNumberIn, String stockNameIn, double priceIn)
	{
		stockNumber = stockNumberIn;
		stockName = stockNameIn;
		price = priceIn;
		totalStock = 0;
	}

	public void setPrice(double priceIn)
	{
		price = priceIn;
	}

	public void increaseTotalStock(int totalStockIn)
	{
		totalStock = totalStock + totalStockIn;
	}

	public String getStockNumber()
	{
		return stockNumber;
	}

	public String getStockName()
	{
		return stockName;
	}

	public int getTotalStock()
	{
		return totalStock;
	}

	public double getPrice()
	{
		return price;
	}

	public double calculateTotalPrice()
	{
		return price * totalStock;
	}

	public static void setSalesTax(double salesTaxIn)
	{
		salesTax = salesTaxIn;
	}

	public void addSalesTax()
	{
		price = price * (1 + salesTax/100);
	}
}