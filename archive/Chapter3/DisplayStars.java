import java.util.Scanner;

public class DisplayStars
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of square: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}