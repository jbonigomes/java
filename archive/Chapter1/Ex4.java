import java.util.*;

public class Ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sizeOfTeams, numOfStudents;
		
		System.out.println("Enter the number of students: ");
		numOfStudents = sc.nextInt();
		
		System.out.println("Enter the size of the Teams: ");
		sizeOfTeams = sc.nextInt();
		
		System.out.println();
		System.out.println("There will be " + (numOfStudents / sizeOfTeams) + " teams, "
			+ (numOfStudents % sizeOfTeams) + " student(s) will be left with no team!");
	}
}