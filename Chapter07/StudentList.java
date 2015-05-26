public class StudentList
{
	Student[] list;
	int total;
	
	public StudentList(int init)
	{
		list = new Student[init];
		total = 0;
	}

	public boolean add(Student studentIn)
	{
		if(!isFull())
		{
			list[total] = studentIn;
			total++;
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean remove(int indexIn)
	{
		for(int i = indexIn; i < total - 1; i++)
		{
			list[i] = list[i+1];
		}

		total--;

		return true;
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

	public Student getItem(int indexIn)
	{
		return list[indexIn];
	}

	public int getTotal()
	{
		return total;
	}
}