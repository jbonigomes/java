public class ParameterTest
{
	public static void main(String[] args)
	{
		BankAccount testAccount = new BankAccount("1", "Samsun Okoyo");
		
		test(testAccount);
		
		System.out.println("Account Number: " + testAccount.getAccountNumber());
		System.out.println("Account Name: " + testAccount.getAccountName());
		System.out.println("Balance: " + testAccount.getBalance());
	}

	private static void test(BankAccount accountIn)
	{
		accountIn.deposit(2500);
	}
}