import java.util.*;

public class DataEntry2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String firstName, familyName, town;

		System.out.println("Please enter your first name");
		displayMessage();
		firstName = sc.next();

		System.out.println("Please enter your family name");
		displayMessage();
		familyName = sc.next();

		System.out.println("Please enter your town");
		displayMessage();
		town = sc.next();
	}

	private static void displayMessage()
	{
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any third party");
	}
}