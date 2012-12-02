import java.util.Scanner;

public class DataEntry2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String firstName, familyName, town;
		
		System.out.println();
		displayMessage();
		firstName = sc.next();
		
		System.out.println();
		displayMessage();
		familyName = sc.next();
		
		System.out.println();
		displayMessage();
		town = sc.next();
	}
	
	private static void displayMessage()
	{
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any third party");
	}
}