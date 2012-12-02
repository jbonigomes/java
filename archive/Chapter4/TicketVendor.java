import java.util.Scanner;

public class TicketVendor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		final double PRICE = 30;
		double total = 0;
		double cost;
		char choice;
		
		do
		{
			
			System.out.println("*** ACME TICKET VENDING SOFTWARE ***");
			System.out.println();			
			System.out.println("1. Get cost of tickets");
			System.out.println("2. Record purchase of tickets");
			System.out.println("3. View total money received so far");
			System.out.println("4. Quit");
			System.out.println();
			System.out.println("Enter a number from 1 - 4");
			System.out.println();
			
			choice = sc.next().charAt(0);
			
			switch(choice)
			{
				case '1':
					option1(PRICE);
				break;
					
				case '2':
					cost = option2(PRICE);
					total = total + cost;
				break;
				
				case '3':
					option3(total);
				break;
				
				case '4':
				break;
				
				default:
					System.out.println("Enter only numbers from 1 - 4");
					System.out.println();
			}
			
		} while(choice != '4');
		
		System.out.println();
	}
	
	private static void option1(double priceIn)
	{
		Scanner sc = new Scanner(System.in);
		
		int adult, child;
		double cost;
		
		System.out.print("How many adult tickets are required? ");
		adult = sc.nextInt();
		
		System.out.print("How many child tickets are required? ");
		child = sc.nextInt();
		
		cost = adult * priceIn + 0.5 * child * priceIn;
		
		System.out.println();
		System.out.println("The total cost of these tickets will be " + cost);
		System.out.println();
	}
	
	private static double option2(double priceIn)
	{
		Scanner sc = new Scanner(System.in);
		
		int adult, child;
		double cost;
		
		System.out.println("How many adult tickets were purchased? ");
		adult = sc.nextInt();
		
		System.out.println("How many child tickets were purchased? ");
		child = sc.nextInt();
		
		cost = adult * priceIn + 0.5 * child * priceIn;
		
		System.out.println();
		System.out.println("The amount received was " + cost);
		System.out.println();
		
		return cost;
	}
	
	private static void option3(double totalIn)
	{
		System.out.println();
		System.out.println("Total received " + totalIn);
		System.out.println();
	}
}