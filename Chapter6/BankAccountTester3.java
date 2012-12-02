import java.util.*;

public class BankAccountTester3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String userAccountNumber;
		double userAmount;
		char choice;

		BankAccount[] accountList = new BankAccount[2];

		accountList[0] = new BankAccount("99786754", "Susan Richards");
		accountList[1] = new BankAccount("44567109", "Delroy Jacobs");

		do
		{
			System.out.print("Enter an account number: ");
			userAccountNumber = sc.next();
			System.out.print("Enter the amount to deposit: ");
			userAmount = sc.nextDouble();

			if(deposit(accountList, userAccountNumber, userAmount))
			{
				System.out.println("The amount has been deposited");
			}
			else
			{
				System.out.println("There has been an error, amount could not be deposited, you may have entered the wrong account number, please try again");
			}

			System.out.print("Would you like to make more deposits? [Y/N]: ");
			choice = sc.next().charAt(0);

		} while(choice == 'y' || choice == 'Y');

		for(int i = 0; i < accountList.length; i++)
		{
			System.out.println("Account Number: " + accountList[i].getAccountNumber());
			System.out.println("Account Name: " + accountList[i].getAccountName());
			System.out.println("Balance: " + accountList[i].getBalance());
			System.out.println();
		}
	}

	private static boolean deposit(BankAccount[] accounIn, String accountNumberIn, double amountIn)
	{
		for(int i = 0; i < accounIn.length; i++)
		{
			if(accountNumberIn.equals(accounIn[i].getAccountNumber()))
			{
				accounIn[i].deposit(amountIn);
				return true;
			}
		}

		return false;
	}
}