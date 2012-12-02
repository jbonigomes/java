public class SalesStaff
{
	public static final int MAX = 2;
	private int[] staff;
	private double bonus;

	public SalesStaff(double bonusIn)
	{
		staff = new int[MAX];

		for(int i = 0; i < staff.length; i++)
		{
			staff[i] = 0;
		}

		bonus = bonusIn;
	}

	public void setFigure(int numberIn, int valueIn)
	{
		staff[numberIn - 1] = valueIn;
	}

	public double getBonus(int numberIn)
	{
		return (staff[numberIn - 1] * bonus);
	}
}