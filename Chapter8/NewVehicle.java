public class NewVehicle extends Vehicle
{
	public NewVehicle(String regNoIn, String makeIn, int yearIn, double valueIn)
	{
		super(regNoIn, makeIn, yearIn, valueIn);
	}

	public String getType()
	{
		return "New";
	}
}