public class Customer
{
	protected String name;
	protected double totalMoneyPaid;
	protected double totalGoodsReceived;

	public Customer(String nameIn)
	{
		name = nameIn;
		totalMoneyPaid = 0;
		totalGoodsReceived = 0;
	}

	public String getName()
	{
		return name;
	}

	public double getTotalMoneyPaid()
	{
		return totalMoneyPaid;
	}

	public double getTotalGoodsReceived()
	{
		return totalGoodsReceived;
	}

	public double calculateBalance()
	{
		return totalMoneyPaid - totalGoodsReceived;
	}

	public void recordPayment(double paymentIn)
	{
		totalMoneyPaid = totalMoneyPaid + paymentIn;
	}

	public boolean dispatchGoods(double goodsIn)
	{
		if(calculateBalance() >= goodsIn)
		{
			totalGoodsReceived = totalGoodsReceived + goodsIn;
			return true;
		}
		else
		{
			return false;
		}
	}
}