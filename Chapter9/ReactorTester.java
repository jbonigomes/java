public class ReactorTester
{
	public static void main(String[] args)
	{
		char reply;
		boolean error;
		Reactor b = new Reactor();

		System.out.println("\n\t\t *** REACTOR TESTER *** \n\n");

		do
		{
			
			System.out.println("\t [1] Increase temperature \n");
			System.out.println("\t [2] Decrease temperature \n");
			System.out.println("\t [3] Display current temperature \n");
			System.out.println("\t [4] Help \n");
			System.out.println("\t [5] Quit \n");
			System.out.print("\t Enter option [1-5]: \t");
			reply = EasyScanner.nextChar();

			switch(reply)
			{
				case '1':
					error = b.increaseTemp();

					System.out.println("\n");

					if(error)
					{
						System.out.println("\t Warning: Alarm Raised!");
						System.out.println("\t MAXIMUM temperature: " + Reactor.MAX);
					}

					System.out.println("\t Temperature after increase is " + b.getTemperature() + "\n\n");
				break;

				case '2':
					error = b.decreaseTemp();

					System.out.println("\n");

					if(error)
					{
						System.out.println("\t Warning: Alarm Raised!");
						System.out.println("\t MINIMUM temperature: " + Reactor.MIN);
					}

					System.out.println("\t Temperature after decrease is " + b.getTemperature() + "\n\n");
				break;

				case '3':
					System.out.println("\n\n\t Current temperature is " + b.getTemperature() + "\n\n");
				break;

				case '5':
					System.out.println("\n\n\t Goodbye \n\n");
				break;

				case '4': default:
					System.out.println("\n\n\t Choose an option from 1 to 5 then press <ENTER> \n\n");
				break;
			}

		} while(reply != '5');
	}
}