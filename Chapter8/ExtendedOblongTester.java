public class ExtendedOblongTester
{
	public static void main(String[] args)
	{
		ExtendedOblong extOblong = new ExtendedOblong(10, 5, '*');
		
		System.out.println(extOblong.draw());
		extOblong.setSymbol('+');
		System.out.println(extOblong.draw());
	}
}