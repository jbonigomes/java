import java.util.Scanner;

public class TimeTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char group;
		
		System.out.println("*** Lab Times ***");
		System.out.print("Enter your group (A,B,C): ");
		group = sc.next().charAt(0);
		
		if(group == 'A')
		{
			System.out.println("10.00 a.m");
		}
		else
		{
			if(group == 'B')
			{
				System.out.println("1.00 p.m");
			}
			else
			{
				if(group == 'C')
				{
					System.out.println("11.00 a.m");
				}
				else
				{
					System.out.println("No such group");
				}
			}
		}
		
	}
}