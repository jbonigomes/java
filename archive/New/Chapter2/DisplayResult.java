import java.util.Scanner;

public class DisplayResult
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int mark;
		
		System.out.print("What exam mark did you get? ");
		mark = sc.nextInt();
		
		if(mark >= 40)
		{
			System.out.println("Congratulations, you passed");
		}
		else
		{
			System.out.println("I'm sorry but you failed");
		}
		
		System.out.println("Good luck with your other exams");
	}
}