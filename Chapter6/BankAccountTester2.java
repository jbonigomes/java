public class BankAccountTester2
{
	public static void main(String[] args)
	{
		BankAccount[] accountList = new BankAccount[3];

		accountList[0] = new BankAccount("99786754", "Susan Richards");
		accountList[1] = new BankAccount("44567109", "Delroy Jacobs");
		accountList[2] = new BankAccount("46376205", "Sumana Khan");

		accountList[0].deposit(1000);
		accountList[1].deposit(150);
		accountList[2].deposit(500);

		for(BankAccount item : accountList)
		{
			System.out.println("Account number: " + item.getAccountNumber());
			System.out.println("Account name: " + item.getAccountName());
			System.out.println("Current balance: " + item.getBalance());
			System.out.println();
		}
	}
}