public class MixedListTester
{
	public static void main(String[] args)
	{
		Employee[] employeeList = new Employee[3];

		String num, name;
		double pay;
		char status;

		for(int i = 0; i < employeeList.length; i++)
		{
			System.out.print("Enter the employee number: ");
			num = EasyScanner.nextString();

			System.out.print("Enter the emplyee name: ");
			name = EasyScanner.nextString();

			System.out.print("<F>ull-time or <P>art-time: ");
			status = EasyScanner.nextChar();

			if(status == 'f' || status == 'F')
			{
				System.out.print("Enter the annual salary: ");
			}
			else
			{
				System.out.print("Enter the hourly pay: ");
			}
			pay = EasyScanner.nextDouble();

			if(status == 'f' || status == 'F')
			{
				employeeList[i] = new FullTimeEmployee(num, name, pay);
			}
			else
			{
				employeeList[i] = new PartTimeEmloyee(num, name, pay);
			}
			System.out.println();
		}

		for(int i = 0; i < employeeList.length; i++)
		{
			System.out.println("Employee number: " + employeeList[i].getNumber());
			System.out.println("Employee name: " + employeeList[i].getName());
			System.out.println("Status: " + employeeList[i].getStatus());
			System.out.println();
		}
	}
}