import java.util.*;

public class DataEntry
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String firstName, familyName, town;

		System.out.println("Please enter your first name");
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any thrid party");
		firstName = sc.next();

		System.out.println("Please enter your family name");
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any thrid party");
		familyName = sc.next();

		System.out.println("Please enter your town");
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any thrid party");
		town = sc.next();
	}
}