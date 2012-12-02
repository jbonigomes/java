import java.util.Scanner;

public class TimetableWithLoop
{
	public static void main(String[] args)
	{
		char group, response;
		Scanner sc = new Scanner(System.in);

		System.out.println("*** Lab Times ***");
		
		do
		{
			System.out.println();
			System.out.println("[1] TIME FOR GROUP A");
			System.out.println("[2] TIME FOR GROUP B");
			System.out.println("[3] TIME FOR GROUP C");
			System.out.println("[4] QUIT PROGRAM");
			System.out.print("Enter choice [1, 2, 3, 4]: ");
			response = sc.next().charAt(0);
			System.out.println();
			switch(response)
			{
				case '1':
					System.out.println("10.00 a.m");
				break;
				
				case '2':
					System.out.println("1.00 p.m");
				break;
				
				case '3':
					System.out.println("11.00 a.m");
				break;
				
				case '4':
					System.out.println("Goodbye");
				break;
				
				default:
					System.out.println("Options 1-4 only!");
			}
		} while(response != '4');
			
	}
}