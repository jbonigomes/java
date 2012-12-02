import java.util.*;

public class StudentTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Student[] myStudents = new Student[3];

		String number, name;
		int markForMaths, markForEnglish, markForScience;

		System.out.println("*** Student test ***");

		for(int i = 0; i < myStudents.length; i++)
		{
			number = (i + 1) + "" + (i + 1) + "" + (i + 1);
			name = "Student" + (i + 1);
			markForMaths = (5 + i) * 10;
			markForEnglish = (6 + i) * 10;
			markForScience = (7 + i) * 10;

			myStudents[i] = new Student(number, name);

			myStudents[i].enterMarks(markForMaths, markForEnglish, markForScience);
		}

		for(int i = 0; i < myStudents.length; i++)
		{
			System.out.println();
			System.out.println("Student number: " + myStudents[i].getNumber());
			System.out.println("Student name: " + myStudents[i].getName());
			System.out.println("Mark for Maths: " + myStudents[i].getMathsMark());
			System.out.println("Mark for English: " + myStudents[i].getEnglishMark());
			System.out.println("Mark for Science: " + myStudents[i].getScienceMark());
			System.out.println("Overall mark: " + myStudents[i].calculateAverageMark());
		}
	}
}