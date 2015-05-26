// this method demonstrates variable scope, it will not compile!!!!
public class ScopeTest2
{
	public static void main(String[] args)
	{	
		int x = 1;
		int y = 2;
		method1(x, y);
		System.out.println(z); // the first compiler error
	}
	
	private static void method1(int xIn, int yIn)
	{
		int z;
		z = x + y; // the second compiler error
		System.out.println(z);
	}
}