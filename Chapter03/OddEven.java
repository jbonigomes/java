import java.util.*;

public class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int userNumber;

		System.out.print("Please enter the number to cout to: ");
		userNumber = sc.nextInt();

		for(int i = 1; i <= userNumber; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i + " is even");
			}
			else
			{
				System.out.println(i + " is odd");
			}
		}
	}
}