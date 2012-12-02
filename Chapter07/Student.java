public class Student
{
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;

	public Student(String studentNumberIn, String studentNameIn)
	{
		studentNumber = studentNumberIn;
		studentName = studentNameIn;
		markForMaths = -99;
		markForEnglish = -99;
		markForScience = -99;
	}

	public String getNumber()
	{
		return studentNumber;
	}

	public String getName()
	{
		return studentName;
	}

	public void enterMarks(int markForMathsIn, int markForEnglishIn, int markForScienceIn)
	{
		markForMaths = markForMathsIn;
		markForEnglish = markForEnglishIn;
		markForScience = markForScienceIn;
	}

	public int getMathsMark()
	{
		return markForMaths;
	}

	public int getEnglishMark()
	{
		return markForEnglish;
	}

	public int getScienceMark()
	{
		return markForScience;
	}

	public double calculateAverageMark()
	{
		return (markForMaths + markForEnglish + markForScience) / 3.0;
	}
}