import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Math Star ***");
		System.out.println();
		
		System.out.print("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();
		
		System.out.print("Enter the sum of those numbers: ");
		sum = sc.nextInt();
		
		System.out.println();
		
		if(sum == (num1 + num2))
		{
			System.out.println("Congratulations, you are a Math Star");
		}
		else
		{
			System.out.println("You may be a star, but not on Maths, the sum of " + num1 + " + " + num2 + " = " + (num1 + num2));
		}
		
		System.out.println();
		System.out.println("Good bye!");
		System.out.println();
	}
}