public class PartTimeEmployeeTester
{
	public static void main(String[] args)
	{
		String number, name;
		double pay;
		int hours;
		PartTimeEmployee emp;

		System.out.print("Employee Number? ");
		number = EasyScanner.nextString();
		System.out.print("Employee's Name? ");
		name = EasyScanner.nextString();
		System.out.print("Hourly Pay? ");
		pay = EasyScanner.nextDouble();
		System.out.print("Hours worked this week? ");
		hours = EasyScanner.nextInt();

		emp = new PartTimeEmployee(number, name, pay);

		System.out.println();
		System.out.println(emp.getName());
		System.out.println(emp.getNumber());
		System.out.println(emp.calculateWeeklyPay(hours));
	}
}