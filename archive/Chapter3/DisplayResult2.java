import java.util.Scanner;

public class DisplayResult2
{
	public static void main(String[] args)
	{
		int mark;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What exam mark did you get?: ");
		mark = sc.nextInt();
		
		while(mark < 0 || mark > 100)
		{
			System.out.println("Invalid mark, please re-enter: ");
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