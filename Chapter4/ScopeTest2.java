public class ScopeTest2
{
	public static void main(String[] args)
	{	
		int x = 1;
		int y = 2;
		method1(x, y);
		System.out.println(z);
	}

	public static void method1(int xIn, int yIn)
	{
		int z;
		z = x + y;
		System.out.println(z);
	}
}