import java.util.*;

public class StringComp3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s;
		char c;
		boolean startsWith;

		System.out.print("Enter a string: ");
		s = sc.next();
		System.out.print("Enter a character: ");
		c = sc.next().charAt(0);

		startsWith = s.substring(0,1).equalsIgnoreCase(Character.toString(c));

		if(startsWith)
		{
			System.out.println("String " + s + " starts with character " + c);
		}
		else
		{
			System.out.println("String " + s + " does not start with character " + c);
		}
	}
}