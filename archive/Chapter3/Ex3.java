import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
		int num;
		char again;
		Scanner sc = new Scanner(System.in);
		do
		{
			do
			{

				System.out.print("Enter size of square: ");
				num = sc.nextInt();

			} while(num < 2 || num > 100);

			for(int i = 1; i <= num; i++)
			{
				for(int j = 1; j <= num; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.print("Would you like to try again?(y/n): ");
			again = sc.next().charAt(0);
			
		} while(again == 'y' || again == 'Y');

	}
}