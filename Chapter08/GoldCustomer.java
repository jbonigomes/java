public class GoldCustomer extends Customer
{
	private double creditLimit;

	public GoldCustomer(String nameIn, double limitIn)
	{
		super(nameIn);
		creditLimit = limitIn;
	}

	public void setCreditLimit(double limitIn)
	{
		creditLimit = limitIn;
	}

	public double getCreditLimit()
	{
		return creditLimit;
	}

	public boolean dispatchGoods(double goodsIn)
	{
		if((calculateBalance() + creditLimit) >= goodsIn)
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