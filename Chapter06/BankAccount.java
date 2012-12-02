public class BankAccount
{
	private String accountNumber;
	private String accountName;
	private double balance;

	public BankAccount(String numberIn, String nameIn)
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
}