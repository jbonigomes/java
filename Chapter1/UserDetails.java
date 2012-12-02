import java.util.Scanner;

public class UserDetails
{
	public static void main(String[] args)
	{
		String name, address, phoneNumber;

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		name = sc.next();
		System.out.print("Please enter your address: ");
		address = sc.next();
		System.out.print("Please enter your telephone number: ");
		phoneNumber = sc.next();

		System.out.println("*** Your details ***");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println();
		System.out.println("Telephone number: " + phoneNumber);
	}
}