public class ExtendedOblong extends Oblong
{
	private char symbol;

	public ExtendedOblong(double lenghtIn, double heightIn, char symbolIn)
	{
		super(lenghtIn, heightIn);
		symbol = symbolIn;
	}

	public void setSymbol(char symbolIn)
	{
		symbol = symbolIn;
	}

	public String draw()
	{
		String s = new String();
		int l, h;

		l = (int)getLength();
		h = (int)getHeight();

		for(int i = 0; i <= h; i++)
		{
			for(int j = 1; j <= l; j++)
			{
				s = s + symbol;
			}

			s = s + '\n';
		}

		return s;
	}
}