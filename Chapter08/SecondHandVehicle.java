public class SecondHandVehicle extends Vehicle
{
	private int numberOfOwners;

	public SecondHandVehicle(String regNoIn, String makeIn, int yearIn, double valueIn, int numberOfOwnersIn)
	{
		super(regNoIn, makeIn, yearIn, valueIn);
		numberOfOwners = numberOfOwnersIn;
	}

	public int getNumberOfOwners()
	{
		return numberOfOwners;
	}

	public boolean hasMultipleOwners()
	{
		if(numberOfOwners > 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getType()
	{
		return "SecondHand";
	}
}