import java.util.*;

public class StringTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String str = new String();

		System.out.print("Enter a string: ");
		str = sc.next();

		System.out.println("The length of the string is " + str.length());
		System.out.println("The character at position 3 is " + str.charAt(2));
		System.out.println("Characters 2 to 4 are " + str.substring(1, 4));
		System.out.println(str.concat(" was the string entered"));
		System.out.println("This is upper case: " + str.toUpperCase());
		System.out.println("This is lower case: " + str.toLowerCase());
	}
}