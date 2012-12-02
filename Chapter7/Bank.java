public class Bank
{
	private BankAccount[] list;
	private int total;

	public Bank(int sizeIn)
	{
		list = new BankAccount[sizeIn];
		total = 0;
	}

	private int search(String accountNumberIn)
	{
		for(int i = 0; i < total; i++)
		{
			BankAccount tempAccount = list[i];
			String tempNumber = tempAccount.getAccountNumber();
			
			if(tempNumber.equals(accountNumberIn))
			{
				return i;
			}
		}

		return -999;
	}

	public int getTotal()
	{
		return total;
	}

	public boolean isEmpty()
	{
		if(total == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isFull()
	{
		if(total == list.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean add(BankAccount accountIn)
	{
		if(!isFull())
		{
			list[total] = accountIn;
			total++;
			return true;
		}
		else
		{
			return false;
		}
	}

	public BankAccount getItems(String accountNumberIn)
	{
		int index;
		index = search(accountNumberIn);

		if(index == -999)
		{
			return null;
		}
		else
		{
			return list[index];
		}
	}

	public boolean depositMoney(String accountNumberIn, double amountIn)
	{
		int index = search(accountNumberIn);

		if(index == -999)
		{
			return false;
		}
		else
		{
			list[index].deposit(amountIn);
			return true;
		}
	}

	public boolean withdrawMoney(String accountNumberIn, double amountIn)
	{
		int index = search(accountNumberIn);

		if(index == -999)
		{
			return false;
		}
		else
		{
			list[index].withdraw(amountIn);
			return true;
		}
	}

	public boolean remove(String numberIn)
	{
		int index = search(numberIn);

		if(index == -999)
		{
			return false;
		}
		else
		{
			for(int i = index; i <= total - 2; i++)
			{
				list[i] = list[i+1];
			}

			total--;
			return true;
		}
	}
}