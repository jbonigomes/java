import java.util.Scanner;

public class StringTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("What is your name? ");
		name = sc.next();
		
		System.out.print("What is your age? ");
		age = sc.nextInt();
		
		System.out.println();
		System.out.println("Hello " + name);
		System.out.println("When I was your age I was " + (age + 1));
	}
}