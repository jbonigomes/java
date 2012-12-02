public class BankAccount2
{
	private String accountNumber;
	private String accountName;
	private double balance;
	private static double interestRate;

	public BankAccount2(String numberIn, String nameIn)
	{
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}

	public String getAccountName()
	{
		return accountName;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void deposit(double amountIn)
	{
		balance = balance + amountIn;
	}

	public void withdraw(double amountIn)
	{
		balance = balance - amountIn;
	}

	public static void setInterestRate(double rateIn)
	{
		interestRate = rateIn;
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public void addInterest()
	{
		balance = balance + (balance * interestRate) / 100;
	}
}