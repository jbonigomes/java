public class ParametersDemo
{
	public static void main(String[] args)
	{
		int x = 10;
		demoMethod(x);
		System.out.println(x);
	}

	public static void demoMethod(int xIn)
	{
		xIn = 25;
		System.out.println(xIn);
	}
}