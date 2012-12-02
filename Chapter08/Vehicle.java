public abstract class Vehicle
{
	private String regNo;
	private String make;
	private int year;
	private double value;

	public Vehicle(String regNoIn, String makeIn, int yearIn, double valueIn)
	{
		regNo = regNoIn;
		make = makeIn;
		year = yearIn;
		value = valueIn;
	}

	public String getRegNo()
	{
		return regNo;
	}

	public String getMake()
	{
		return make;
	}

	public int getYear()
	{
		return year;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double valueIn)
	{
		value = valueIn;
	}

	public int calculateAge(int yearIn)
	{
		return yearIn - year;
	}

	abstract public String getType();
}