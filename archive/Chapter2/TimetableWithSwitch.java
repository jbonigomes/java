import java.util.Scanner;

public class TimetableWithSwitch
{
	public static void main(String[] args)
	{
		char group;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B, C)");
		group = sc.next().charAt(0);
		
		switch(group)
		{
			case 'A':	System.out.println("10.00 a.m");
						break;
			case 'B':	System.out.println("1.00 p.m");
						break;
			case 'C':	System.out.println("11.00 a.m");
						break;
			default:	System.out.println("No such group");
		}
	}
}