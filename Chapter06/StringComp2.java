import java.util.*;

public class StringComp2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String string1, string2;
		int comparison;
		boolean comp;

		System.out.print("Enter a string: ");
		string1 = sc.next();
		System.out.print("Enter another string: ");
		string2 = sc.next();

		// ignoring case
		comparison = string1.toLowerCase().compareTo(string2.toLowerCase());

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

		// using the equals method
		comp = string1.equals(string2);

		if(comp)
		{
			System.out.println("The strings are identical");
		}
		else
		{
			System.out.println("The strings are not identical");
		}

		// using the equalsIgnorCase method
		comp = string1.equalsIgnoreCase(string2);

		if(comp)
		{
			System.out.println("The strings are identical (ignoring case)");
		}
		else
		{
			System.out.println("The strings are not identical even ignoring case");
		}

		// using the trim method
		comp = string1.trim().equalsIgnoreCase(string2.trim());

		if(comp)
		{
			System.out.println("The strings are identical (ignoring case and trimming)");
		}
		else
		{
			System.out.println("The strings are not identical even after ignoring case and trimming");
		}
	}
}