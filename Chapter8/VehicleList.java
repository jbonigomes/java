public class VehicleList
{
	Vehicle[] list;
	int total;

	public VehicleList(int listSize)
	{
		list = new Vehicle[listSize];
		total = 0;
	}

	public boolean addVehicle(Vehicle vehicleIn)
	{
		if(!isFull())
		{
			list[total] = vehicleIn;
			total++;
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean deleteVehicle(int indexIn)
	{
		for(int i = indexIn; i < total - 1; i++)
		{
			list[i] = list[i+1];
		}

		total--;

		return true;
	}

	public Vehicle getVehicle(int indexIn)
	{
		return list[indexIn];
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

	public int getTotal()
	{
		return total;
	}
}