import java.util.*;

public class VendingMachine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int gum = 0;
		int chocolate = 0;
		int popcorn = 0;
		int juice = 0;
		int userChoice;

		do
		{
			System.out.println("*** Vending Machine ***");
			System.out.println("[1] Get gum");
			System.out.println("[2] Get chocolate");
			System.out.println("[3] Get popcorn");
			System.out.println("[4] Get juice");
			System.out.println("[5] Display total sold so far");
			System.out.println("[6] Quit");
			System.out.print("Enter your choice [1-6]: ");
			userChoice = sc.nextInt();

			switch(userChoice)
			{
				case 1:
					gum++;
					System.out.println("Here is your gum");
				break;

				case 2:
					chocolate++;
					System.out.println("Here is your chocolate");
				break;

				case 3:
					popcorn++;
					System.out.println("Here is your popcorn");
				break;

				case 4:
					juice++;
					System.out.println("Here is your juice");
				break;

				case 5:
					System.out.println(gum + " item(s) of gum sold");
					System.out.println(chocolate + " item(s) of chocolate sold");
					System.out.println(popcorn + " item(s) of popcorn sold");
					System.out.println(juice + " item(s) of juice sold");
				break;

				case 6:
					System.out.println("Thanks for using our system. Goodbye!");
				break;

				default:
					System.out.println("Error, options 1-6 only!");
			}
		} while(userChoice != 6);
	}
}