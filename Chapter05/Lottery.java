import java.util.*;

public class Lottery
{
	public static void main(String[] args)
	{
		int[] winningNumbers = new int[6];
		int[] userNumbers = new int[6];

		winningNumbers = fillWinningNumbers(winningNumbers);
		userNumbers = fillUserNumbers(userNumbers);

		if(isWinner(winningNumbers, userNumbers))
		{
			System.out.println("Congratulations, you are a millionaire");
		}
		else
		{
			System.out.println("Sorry buddy, better luck next time");
		}

		displayNumbers(winningNumbers, userNumbers);
	}

	private static int[] fillWinningNumbers(int[] winningNumbers)
	{
		Random generator = new Random();
		int[] tempNumbers = new int[5];

		for(int i = 0; i < winningNumbers.length; i++)
		{
			do
			{
				winningNumbers[i] = generator.nextInt(50) + 1;

				if(i > 0)
				{
					tempNumbers[i -1] = winningNumbers[i - 1];
				}
		
			} while(contains(tempNumbers, winningNumbers[i]));
		}

		return winningNumbers;
	}

	private static int[] fillUserNumbers(int[] userNumbers)
	{
		Scanner sc = new Scanner(System.in);
		String[] sequence = {"first", "second", "third", "fourth", "fifth", "sixth"};
		int[] tempNumbers = new int[5];

		for(int i = 0; i < userNumbers.length; i++)
		{
			if(i > 0)
			{
				tempNumbers[i -1] = userNumbers[i -1];
			}

			do
			{
				System.out.print("Enter " + sequence[i] + " number: ");
				userNumbers[i] = sc.nextInt();

				if(userNumbers[i] < 0 || userNumbers[i] > 50 || contains(tempNumbers, userNumbers[i]))
				{
					System.out.println("Numbers from 1 to 50 only and only unique entries allowed");
				}

			} while(userNumbers[i] < 0 || userNumbers[i] > 50 || contains(tempNumbers, userNumbers[i]));
		}

		return userNumbers;
	}

	private static boolean isWinner(int[]winningNumbers, int[]userNumbers)
	{
		for(int i = 0; i < userNumbers.length; i++)
		{
			if(!contains(winningNumbers, userNumbers[i]))
			{
				return false;
			}
		}

		return true;
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

	private static void displayNumbers(int[] winningNumbers, int[] userNumbers)
	{
		String winnerString = "";
		String userString = "";

		for(int i = 0; i < winningNumbers.length; i++)
		{
			winnerString = winnerString + winningNumbers[i];
			if(i != (winningNumbers.length - 1))
			{
				winnerString = winnerString + ", ";
			}
		}

		for (int i = 0; i < userNumbers.length; i++)
		{
			userString = userString + userNumbers[i];
			if(i != (userNumbers.length - 1))
			{
				userString = userString + ", ";
			}
		}

		System.out.println("Draw numbers: " + winnerString);
		System.out.println("Your numbers: " + userString);
	}
}