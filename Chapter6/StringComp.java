import java.util.*;

public class StringComp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String string1, string2;
		int comparison;

		System.out.print("Enter a string: ");
		string1 = sc.next();
		System.out.print("Enter another string: ");
		string2 = sc.next();

		comparison = string1.compareTo(string2);

		if(comparison < 0)
		{
			System.out.println(string1 + "comes before " + string2 + " in the alphabet");
		}
		else if(comparison > 0)
		{
			System.out.println(string2 + "comes before " + string1 + " in the alphabet");
		}
		else
		{
			System.out.println("The strings are identical");
		}
	}
}