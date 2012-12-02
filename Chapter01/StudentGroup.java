import java.util.Scanner;

public class StudentGroup
{
	public static void main(String[] args)
	{
		int numberOfStudents, sizeOfTeams;

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of student(s): ");
		numberOfStudents = sc.nextInt();
		System.out.print("Size of team(s): ");
		sizeOfTeams = sc.nextInt();

		System.out.println(numberOfStudents / sizeOfTeams + " team(s) can be formed");
		System.out.println(numberOfStudents % sizeOfTeams + " student(s) will be left without a team");
	}
}