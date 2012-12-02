public class OverloadingDemo
{
	public static void main(String[] args)
	{
		int maxOfTwo, maxOfThree;
		
		maxOfTwo = max(2, 10);
		maxOfThree = max(-5, 5, 3);
		
		System.out.println(maxOfTwo);
		System.out.println(maxOfThree);
	}
	
	private static int max(int firstIn, int secondIn)
	{
		if(firstIn > secondIn)
		{
			return firstIn;
		}
		else
		{
			return secondIn;
		}
	}
	
	private static int max(int firstIn, int secondIn, int thirdIn)
	{
		int result;
		
		result = firstIn;
		
		if(secondIn > result)
		{
			result = secondIn;
		}
		
		if(thirdIn > result)
		{
			result = thirdIn;
		}
		
		return result;
	}
}