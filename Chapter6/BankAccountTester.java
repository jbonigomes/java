public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount account1 = new BankAccount("99786754", "Susan Richards");
		account1.deposit(1000);

		System.out.println("Account number: " + account1.getAccountNumber());
		System.out.println("Account name: " + account1.getAccountName());
		System.out.println("Current balance: " + account1.getBalance());
	}
}