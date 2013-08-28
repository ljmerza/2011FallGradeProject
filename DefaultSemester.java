import java.util.Scanner;

public class DefaultSemester
{
	public static void main(String[] args)
	{
		// create class objects
		/********************************************************/
		stat509 stat509class = new stat509();
		math242 math242class = new math242();
		csce211 csce211class = new csce211();
		elct102 elct102class = new elct102();

		/********************************************************/

		// get and display current grade
		/********************************************************/
		System.out.print("stat509: ");
		stat509class.getGrade();
		System.out.print("math242: ");
		math242class.getGrade();
		System.out.print("csce211: ");
		csce211class.getGrade();
		System.out.print("elct102: ");
		elct102class.getGrade();
		


		/********************************************************/

		// get and display current grade
		/********************************************************/
		Scanner in = new Scanner(System.in);
		in.nextLine();
		/********************************************************/

	} // ending of main method
} // ending of DefaultSemester