import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int gum = 0;
		int choc = 0;
		int pop = 0;
		int juice = 0;
		int choice;
		
		do
		{
			System.out.println("[1] Get gum");
			System.out.println("[2] Get chocolate");
			System.out.println("[3] Get popcorn");
			System.out.println("[4] Get juice");
			System.out.println("[5] Display total sold so far");
			System.out.println("[6] Quit");
			System.out.print("Enter option (1-6): ");
			choice = sc.nextInt();

			switch(choice)
			{

				case 1:
					System.out.println("Here is your gum");
					gum++;
				break;

				case 2:
					System.out.println("Here is your chocolate");
					choc++;
				break;

				case 3:
					System.out.println("Here is your popcorn");
					pop++;
				break;

				case 4:
					System.out.println("Here is your juice");
					juice++;
				break;

				case 5:
					System.out.println(gum + " items of gum sold");
					System.out.println(choc + " items of chocolate sold");
					System.out.println(pop + " items of popcorn sold");
					System.out.println(juice + " items of juice sold");
				break;
				
				case 6:
					System.out.println("Goodbye!");
				break;

				default:
					System.out.println("Error, options 1-6 only!");

			}
			
		} while(choice != 6);
		
	}
}