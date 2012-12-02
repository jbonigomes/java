import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how much money you would like to pay in: ");
		double money = sc.nextDouble();
		
		System.out.println("Choose the bank account type:");
		System.out.println("[A] 1.5% AIR");
		System.out.println("[B] 2% AIR");
		System.out.println("[C] 1.5% AIR");
		System.out.println("[X] 5% AIR");
		System.out.println("Enter your choice (A, B, C, X): ");
		char choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case 'a': case 'A': case 'c': case 'C':
				System.out.println("You could earn " + ((1.5 * money) / 100) + " in one year as interest");
			break;
			
			case 'b': case 'B':
				System.out.println("You could earn " + ((2 * money) / 100) + " in one year as interest");
			break;
			
			case 'x': case 'X':
				System.out.println("You could earn " + ((5 * money) / 100) + " in one year as interest");
			break;
			
			default:
				System.out.println("No such option, try running the program again!");
		}
		
		System.out.println("Thank you for using our bank, good bye!");
	}
}