public class StudentListTester
{
	public static void main(String[] args)
	{
		int total = 3;
		int markForMaths, markForEnglish, markForScience;
		String number, name;

		StudentList myStudentList = new StudentList(total);

		System.out.println("*** Begin Student List Test ***");
		System.out.println();

		System.out.println("StudentList is empty: " + myStudentList.isEmpty());
		System.out.println("StudentList is full: " + myStudentList.isFull());

		System.out.println();
		System.out.println("Adding students...");
		System.out.println();

		for(int i = 0; i < total; i++)
		{
			Student tempStudent;

			number = (i + 1) + "" + (i + 1) + "" + (i + 1);
			name = "Student" + (i + 1);
			markForMaths = (5 + i) * 10;
			markForEnglish = (6 + i) * 10;
			markForScience = (7 + i) * 10;

			tempStudent = new Student(number, name);

			tempStudent.enterMarks(markForMaths, markForEnglish, markForScience);

			myStudentList.add(tempStudent);
		}

		System.out.println("StudentList is empty: " + myStudentList.isEmpty());
		System.out.println("StudentList is full: " + myStudentList.isFull());

		System.out.println();
		System.out.println("Removing Student 2");
		System.out.println();

		myStudentList.remove(1);

		System.out.println("StudentList is empty: " + myStudentList.isEmpty());
		System.out.println("StudentList is full: " + myStudentList.isFull());

		System.out.println("The student numbers are:");

		for(int i = 0; i < myStudentList.getTotal(); i++)
		{
			Student tempStudent = myStudentList.getItem(i);
			System.out.println(tempStudent.getNumber());
		}
	}
}