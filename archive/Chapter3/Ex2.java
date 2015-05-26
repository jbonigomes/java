import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		System.out.print("Enter the multiplication table you would like to see: ");
		int times = sc.nextInt();
		
		while(i <= 12)
		{
			System.out.println(i + " x " + times + " = " + (i * times));
			i++;
		}
	}
}