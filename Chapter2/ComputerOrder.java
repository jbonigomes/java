import java.util.*;

public class ComputerOrder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double basicSystem = 375.99;
		double smallScreen = 75.99;
		double bigScreen = 99.99;
		double dvdCdWriter = 65.99;
		double printer = 125.00;
		double totalPrice;
		int choice;

		System.out.println("*** Buy a computer ***");
		System.out.println("The base cost is " + basicSystem);
		System.out.println("Please choose your screen:");
		System.out.println("1. 38cm Screen");
		System.out.println("2. 43cm Screen");
		
		System.out.print("Please enter your choice [1, 2]: ");
		choice = sc.nextInt();
		
		if(choice == 1)
		{
			totalPrice = basicSystem + smallScreen;	
		}
		else
		{
			totalPrice = basicSystem + bigScreen;
		}

		System.out.println("Thanks for choosing your screen, the total price so far is " + totalPrice);
		System.out.println("Would you like to add any extras:");
		System.out.println("1. DVD/CD Writer (" + dvdCdWriter + ")");
		System.out.println("2. Printer (" + printer + ")");
		System.out.println("3. Both (" + (printer + dvdCdWriter) + ")");
		System.out.println("4. No, thanks");

		System.out.print("Please enter your choice [1, 2, 3, 4]: ");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				totalPrice = totalPrice + dvdCdWriter;
				System.out.println("You have added a DVD/CD Writer");
			break;
			
			case 2:
				totalPrice = totalPrice + printer;
				System.out.println("You have added a printer");
			break;
			
			case 3:
				totalPrice = totalPrice + printer + dvdCdWriter;
				System.out.println("You have added a Printer and a DVD/CD Writer");
			break;
			
			default:
				System.out.println("No items added");
		}

		System.out.println("A total amount of " + totalPrice + " has now been debited from your account");
		System.out.println("Thanks for shopping with us");
	}
}