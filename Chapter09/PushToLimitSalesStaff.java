import java.text.*;

public class PushToLimitSalesStaff
{
	public static void main(String[] args)
	{	
		int value;
		double bonus;
		char reply;

		SalesStaff cars4U;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("\n\t\t *** BONUS CALCULATOR *** \n\n");
		System.out.print("\t Bonus paid for each car sold? \t");
		bonus = EasyScanner.nextDouble();

		cars4U = new SalesStaff(bonus);

		System.out.println("\n\n\t Enter sales figures \n");

		int i = 0;
		do
		{
			i++;

			if(i <= SalesStaff.MAX)
			{
				System.out.print("\n\t employee " + i + ": \t");
				value = EasyScanner.nextInt();

				cars4U.setFigure(i, value);

				System.out.print("\n\t Enter more? (y/n): ");
				reply = EasyScanner.nextChar();
			}
			else
			{
				System.out.println("\n\n\t ERROR: There are only " + SalesStaff.MAX + " sales staff \n");
				reply = 'n';
			}

		} while(reply == 'y' || reply == 'Y');

		System.out.println("\n\n\t Bonus payments\n\n");
		for(int j = 1; j <= SalesStaff.MAX; j++)
		{
			System.out.println("\t Employee " + j + " = \t" + df.format(cars4U.getBonus(j)));
		}
	}
}