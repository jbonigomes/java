public class RunStatusTester
{
	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee("100", "Patel", 30000);
		PartTimeEmployee pte = new PartTimeEmployee("100", "Jones", 12);

		StatusTester.tester(fte);
		StatusTester.tester(pte);
	}
}