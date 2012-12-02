import java.util.*;

public class TimeTableWithSwitch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		char group;

		System.out.println("*** Lab Times ***");
		System.out.print("Enter your group (A, B, C): ");
		group = sc.next().charAt(0);

		switch(group)
		{
			case 'A':
				System.out.println("10.00 a.m");
				break;
			case 'B':
				System.out.println("1.00 p.m");
				break;
			case 'C':
				System.out.println("11.00 a.m");
				break;
			default:
				System.out.println("No such group");
		}
	}
}