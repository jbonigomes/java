import java.util.*;

public class CurrencyConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int size = enterSize();
		double exchangeRate = enterExchangeRate();

		double[] poundArray = new double[size];
		double[] dollarArray = new double[size];

		poundArray = fillPoundArray(poundArray);
		dollarArray = fillDollarArray(poundArray, exchangeRate);

		System.out.println("*** Prices in Pounds ***");
		displayArray(poundArray);
		System.out.println("*** Prices in Dollars ***");
		displayArray(dollarArray);
		System.out.println("*** Total price in pounds ***");
		System.out.println(sum(poundArray));
		System.out.println("*** Total price in dollars ***");
		System.out.println(sum(dollarArray));
	}

	private static double[] fillPoundArray(double[] poundArray)
	{
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < poundArray.length; i++)
		{
			System.out.print("Enter price of product " + (i + 1) + " in pounds: ");
			poundArray[i] = sc.nextDouble();
		}
		return poundArray;
	}

	private static double[] fillDollarArray(double[] dollarArray, double exchangeRate)
	{
		double[] dollarArrayOut = new double[dollarArray.length];

		for(int i = 0; i < dollarArray.length; i++)
		{
			dollarArrayOut[i] = dollarArray[i] * exchangeRate;
		}

		return dollarArrayOut;
	}

	private static void displayArray(double[] arrayIn)
	{
		String totalPrices = "";

		for(int i = 0; i < arrayIn.length; i++)
		{
			totalPrices = totalPrices + arrayIn[i];

			if(i != (arrayIn.length - 1))
			{
				totalPrices = totalPrices + "; ";
			}
		}

		System.out.println(totalPrices);
	}

	private static int enterSize()
	{
		Scanner sc = new Scanner(System.in);
		int size;

		do
		{
			System.out.print("Enter the number of products to compare: ");
			size = sc.nextInt();

			if(size < 0 || size > 100)
			{
				System.out.println("You must enter a positive integer between 1 and 100!");
			}

		} while(size < 0 || size > 100);

		return size;
	}

	private static double enterExchangeRate()
	{
		Scanner sc = new Scanner(System.in);
		double exchangeRate;

		do
		{
			System.out.println("Enter the exchange rate between pounds and dollars: ");
			exchangeRate = sc.nextDouble();

			if(exchangeRate < 0)
			{
				System.out.println("You must enter a positive number!");
			}

		} while(exchangeRate < 0);

		return exchangeRate;
	}

	private static double sum(double[] arrayIn)
	{
		double total = 0;
		for(double currentElement : arrayIn)
		{
			total = total + currentElement;
		}
		return total;
	}
}