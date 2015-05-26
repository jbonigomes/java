import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to count down: ");
		int j = sc.nextInt();
		
		for(int i = 1; i <= j; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i + " is even");
			}
			else
			{
				System.out.println(i + " is odd");
			}
		}	
	}
}