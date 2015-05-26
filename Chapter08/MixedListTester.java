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
			System.out.print("Enter the employee's name: ");
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
				employeeList[i] = new PartTimeEmployee(num, name, pay);
			}

			System.out.println();
		}

		for(Employee item : employeeList)
		{
			System.out.println("Employee number: " + item.getNumber());
			System.out.println("Employee name: " + item.getName());
			System.out.println("Status: " + item.getStatus());

			if(item.getStatus().equals("Full-Time"))
			{
				FullTimeEmployee tempEmployee = (FullTimeEmployee)item;
				System.out.println("Annual Salary: " + (tempEmployee.getAnnualSalary()));
			}
			else
			{
				PartTimeEmployee tempEmployee = (PartTimeEmployee)item;
				System.out.println("Hourly Pay: " + tempEmployee.getHourlyPay());
			}

			System.out.println();
		}
	}
}