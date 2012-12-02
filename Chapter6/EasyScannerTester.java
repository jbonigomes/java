public class EasyScannerTester
{
	public static void main(String[] args)
	{
		System.out.print("Enter a double: ");
		double d = EasyScanner.nextDouble();
		System.out.println("You entered: " + d);
		System.out.println();

		System.out.print("Enter an integer: ");
		int i = EasyScanner.nextInt();
		System.out.println("You entered: " + i);
		System.out.println();

		System.out.print("Enter a string: ");
		String s = EasyScanner.nextString();
		System.out.println("You entered: " + s);
		System.out.println();

		System.out.print("Enter a character: ");
		double c = EasyScanner.nextChar();
		System.out.println("You entered: " + c);
		System.out.println();
	}
}