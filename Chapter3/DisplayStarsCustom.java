import java.util.*;

public class DisplayStarsCustom
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num;
		char again;
		
		do
		{
			System.out.print("Size of square: ");
			num = sc.nextInt();
			while(num < 2 || num > 100)
			{
				System.out.print("Size must be between 2 and 100, please re-enter: ");
				num = sc.nextInt();
			}

			for (int i = 1; i <= num; i++)
			{
				for (int j = 1; j <= num; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.print("Would you like to try again (y/n)? ");
			again = sc.next().charAt(0);

		} while(again == 'y' || again == 'Y');
	}
}