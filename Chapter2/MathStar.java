import java.util.*;

public class MathStar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int number1, number2, sum, userResult;
		String cont;

		System.out.println("*** MathStar ***");
		
		System.out.print("Enter first number: ");
		number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		number2 = sc.nextInt();

		System.out.println("Can you guess the sum?");
		System.out.print("Press enter your answer: ");
		userResult = sc.nextInt();

		sum = number1 + number2;

		if(sum == userResult)
		{
			System.out.println("Congratulations, you are a MathStar");
		}
		else
		{
			System.out.println("Sorry, you got it all wrong, the sum of " + number1 + " + " + number2 + " = " + sum);
		}

		System.out.println("*** See you later, aligator ***");
	}
}