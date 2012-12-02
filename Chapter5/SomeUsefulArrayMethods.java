import java.util.*;

public class SomeUsefulArrayMethods
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] someArray;

		char choice;
		int size;

		System.out.print("How many elements to store? ");
		size = sc.nextInt();

		someArray = new int[size];

		do
		{
			System.out.println();
			System.out.println("[1] Enter values");
			System.out.println("[2] Array maximum");
			System.out.println("[3] Array sum");
			System.out.println("[4] Array membership");
			System.out.println("[5] Array search");
			System.out.println("[6] Display values");
			System.out.println("[7] Array average");
			System.out.println("[8] Display values greater or equal to the average");
			System.out.println("[9] Quit");
			System.out.print("Enter choice [1-9]: ");
			choice = sc.next().charAt(0);
			System.out.println();

			switch(choice)
			{
				case '1':
					fillArray(someArray);
				break;

				case '2':
					int max = max(someArray);
					System.out.println("Maximum array value = " + max);
				break;

				case '3':
					int total = sum(someArray);
					System.out.println("Sum of array values = " + total);
				break;

				case '4':
					System.out.print("Enter value to find: ");
					int value = sc.nextInt();
					boolean found = contains(someArray, value);
					if(found)
					{
						System.out.println(value + " is in the array");
					}
					else
					{
						System.out.println(value + " is not in the array");
					}
				break;

				case '5':
					System.out.print("Enter value to find: ");
					int item = sc.nextInt();
					int index = search(someArray, item);
					if(index == -999)
					{
						System.out.println(item + " is not in the array");
					}
					else
					{
						System.out.println(item + " is at the array index " + index);
					}
				break;

				case '6':
					System.out.println("Array values");
					displayArray(someArray);
				break;

				case '7':
					System.out.println("Array average is " + arrayAverage(someArray));
				break;

				case '8':
					System.out.println("Values bigger or equal to the array average");
					displayBiggerOrEqualToArrayAverage(someArray);
				break;

				default:
					System.out.println("Options from 1 to 9 only!");
			}

		} while(choice != '9');

		System.out.println("Goodbye!");
	}

	public static void fillArray(int[] arrayIn)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arrayIn.length; i++)
		{
			System.out.print("Enter value: ");
			arrayIn[i] = sc.nextInt();
		}
	}

	private static int sum(int[] arrayIn)
	{
		int total = 0;
		for(int currentElement : arrayIn)
		{
			total = total + currentElement;
		}
		return total;
	}

	private static int max(int[] arrayIn)
	{
		int result = arrayIn[0];
		for(int currentElement : arrayIn)
		{
			if(currentElement > result)
			{
				result = currentElement;
			}
		}
		return result;
	}

	private static boolean contains(int[] arrayIn, int valueIn)
	{
		for(int currentElement : arrayIn)
		{
			if(currentElement == valueIn)
			{
				return true;
			}
		}
		return false;
	}

	private static int search(int[] arrayIn, int valueIn)
	{
		for(int i = 0; i < arrayIn.length; i++)
		{
			if(arrayIn[i] == valueIn)
			{
				return i;
			}
		}
		return -999;
	}

	public static void displayArray(int[] arrayIn)
	{
		System.out.println();
		for(int i = 0; i < arrayIn.length; i++)
		{
			System.out.println("array[" + i + "] = " + arrayIn[i]);
		}
	}

	private static int arrayAverage(int[] arrayIn)
	{
		return sum(arrayIn) / arrayIn.length;
	}

	private static void displayBiggerOrEqualToArrayAverage(int[] arrayIn)
	{
		for(int i = 0; i < arrayIn.length; i++)
		{
			if(arrayIn[i] >= arrayAverage(arrayIn))
			{
				System.out.println(arrayIn[i]);
			}
		}
	}
}