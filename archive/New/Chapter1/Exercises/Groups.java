import java.util.Scanner;

public class Groups
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberOfStudents, sizeOfTeams, numberOfTeams, studentsLeft;
		
		System.out.println("*** Make Groups ***");
		System.out.print("How many students? ");
		numberOfStudents = sc.nextInt();
		
		System.out.print("Size of teams? ");
		sizeOfTeams = sc.nextInt();
		
		numberOfTeams = numberOfStudents / sizeOfTeams;
		studentsLeft = numberOfStudents % sizeOfTeams;
		
		System.out.println("There will be " + numberOfTeams + " teams");
		System.out.println(studentsLeft + " students will not have a team");
	}
}