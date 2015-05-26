import java.util.*;

public class CheckBankAccount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double accA = 1.5;
		double accB = 2;
		double accC = 1.5;
		double accX = 5;
		double output = 0;
		double userMoney;
		char choice;

		System.out.println("*** Check Bank Account ***");

		System.out.print("Please enter the amount of money to deposit: ");
		userMoney = sc.nextDouble();

		System.out.println("Please choose a Bank Account Type:");
		System.out.println("A. Annual rate of interest: " + accA);
		System.out.println("B. Annual rate of interest: " + accB);
		System.out.println("C. Annual rate of interest: " + accC);
		System.out.println("X. Annual rate of interest: " + accX);

		System.out.print("Enter your choice [A, B, C, X]: ");
		choice = sc.next().charAt(0);

		switch(choice)
		{
			case 'A': case 'a':
				if(userMoney >= 250)
				{
					output = userMoney * (1 + accA/100) - userMoney;
				}
				else
				{
					System.out.println("You must pay in at least 250 to apply for this Bank Account Type");
				}
			break;

			case 'B': case 'b':
				if(userMoney >= 1000)
				{
					output = userMoney * (1 + accB/100) - userMoney;
				}
				else
				{
					System.out.println("You must pay in at least 1000 to apply for this Bank Account Type");
				}
			break;

			case 'C': case 'c':
				if(userMoney >= 250)
				{
					output = userMoney * (1 + accC/100) - userMoney;
				}
				else
				{
					System.out.println("You must pay in at least 250 to apply for this Bank Account Type");
				}
			break;

			case 'X': case 'x':
				if(userMoney >= 5000)
				{
					output = userMoney * (1 + accX/100) - userMoney;
				}
				else
				{
					System.out.println("You must pay in at least 5000 to apply for this Bank Account Type");
				}
			break;

			default:
				System.out.println("No such option");
		}
		
		System.out.println("You will make " + output + " in a year time");
	}
}