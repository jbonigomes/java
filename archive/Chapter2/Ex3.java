import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
		double cost = 375.99;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your total price is " + cost + " so far, please choose from the following screens:");
		System.out.println("[A] 38cm (75.99)");
		System.out.println("[B] 43cm (99.99)");
		System.out.print("Enter your choice(A, B): ");
		char choice = sc.next().charAt(0);
		
		if(choice == 'A' || choice == 'a')
		{
			cost = cost + 75.99;
		}
		else
		{
			cost = cost + 99.99;
		}
		
		System.out.println("You can now add optional extras:");
		System.out.println("[A] DVD/CD Writer (65.99)");
		System.out.println("[B] Printer (125.00)");
		System.out.println("[C] Both A and B (" + (65.99 + 125.00) + ")");
		System.out.println("[D] None (0.00)");
		System.out.print("Enter your choice(A, B, C, D): ");
		choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case 'a': case 'A':
				cost = cost + 65.99;
			break;
			case 'b': case 'B':
				cost = cost + 125.00;
			break;
			case 'c': case 'C':
				cost = cost + (65.99 + 125.00);
			break;
			default:
				System.out.println("No extras have been added!");
		}
		
		System.out.println("The total for your order is " + cost);
	}
}