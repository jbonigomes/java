import java.util.*;

public class DisplayResultUsingFor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int mark;

		System.out.print("What exam mark did you get? ");
		mark = sc.nextInt();

		for ( ; mark < 0 || mark > 100; )
		{
			System.out.print("Invalid mark: please re-enter: ");
			mark = sc.nextInt();	
		}

		if(mark >= 40)
		{
			System.out.println("Congratulations, you passed");
		}
		else
		{
			System.out.println("I'm sorry, but you failed");
		}
		System.out.println("Good luck with your other exams");
	}
}