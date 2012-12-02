public class BankAccountTester2
{
	public static void main(String[] args)
	{
		BankAccount2 account1 = new BankAccount2("99786754", "Varinder Singh");
		BankAccount2 account2 = new BankAccount2("99887776", "Lenny Roberts");

		account1.deposit(1000);
		account2.deposit(2000);

		BankAccount2.setInterestRate(10);

		account1.addInterest();

		System.out.println("Account number: " + account1.getAccountNumber());
		System.out.println("Account name: " + account1.getAccountName());
		System.out.println("Interest Rate: " + account1.getInterestRate());
		System.out.println("Current balance: " + account1.getBalance());
		System.out.println();
		System.out.println("Account number: " + account2.getAccountNumber());
		System.out.println("Account name: " + account2.getAccountName());
		System.out.println("Interest Rate: " + account2.getInterestRate());
		System.out.println("Current balance: " + account2.getBalance());
	}
}