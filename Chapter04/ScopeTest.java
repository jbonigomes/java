public class ScopeTest
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 2;
		method1(x, y);
	}

	private static void method1(int xIn, int yIn)
	{
		int z;
		z = xIn + yIn;
		System.out.println(z);
	}
}