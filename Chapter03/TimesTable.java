import java.util.*;

public class TimesTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int userNumber;
		int i = 1;

		System.out.print("Enter the times table to display: ");
		userNumber = sc.nextInt();

		while(i <= 12)
		{
			System.out.println(i + " X " + userNumber + " = " + (userNumber * i));
			i++;
		}
	}
}