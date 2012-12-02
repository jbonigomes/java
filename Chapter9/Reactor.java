 /** This class controls a reactors temperature
  *  ensuring it does not go over some maximum
  *  @author Jose B. Gomes
  *  @version 25th November 2012
  */
public class Reactor
{
	public static final int MAX = 10;	// set maximum temperature
	public static final int MIN = 0;	// set minimum temperature
	private int temperature;

	/** Constructor initializes temperature to zero */
	public Reactor()
	{
		temperature = 0;
	}

	/** Reads the current temperature
	 *  @return Returns the value of the reactor's current temperature
	 */
	public int getTemperature()
	{
		return temperature;
	}

	/** Increase temperature if safe to do so
	 *  drop to zero and raise alarm if not
	 *  @return Returns true if an attempt is made to raise temperature above MAX and false otherwise
	 */
	public boolean increaseTemp()
	{
		boolean alarm;

		if(temperature < MAX)
		{
			temperature++;
			alarm = false;
		}
		else
		{
			temperature = 0;
			alarm = true;
		}

		return alarm;
	}

	/** Decrease temperature if temperature stays above zero
	 *  set to zero and raise alarm if not
	 *  @return Returns true if an attempt is made to adjust temperature above zero and false otherwise
	 */
	public boolean decreaseTemp()
	{
		boolean alarm;

		if(temperature > MIN)
		{
			temperature--;
			alarm = false;
		}
		else
		{
			temperature = 0;
			alarm = true;
		}

		return alarm;
	}
}