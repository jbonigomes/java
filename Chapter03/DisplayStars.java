import java.util.*;

public class DisplayStars
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Size of square: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}