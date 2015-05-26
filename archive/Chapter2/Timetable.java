import java.util.Scanner;

public class Timetable
{
	public static void main(String[] args)
	{
		char group;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B, C)");
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