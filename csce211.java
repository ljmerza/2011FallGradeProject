public class csce211
{
	private int numberOfProjects, numberofHWs, numberOfTests, numberOfQuizes, numberOfLabs, numberOfAttendance;
	private double hwPercent, testPercent, projectPercent, finalPercent, quizPercent, labPercent, attendancePercent;
	private double projectGrade, testGrade, hwGrade, quizGrade, labGrade, attendanceGrade, finalGrade;
	private double testAvg, hwAvg, projectAvg, quizAvg, labAvg, attendanceAvg;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = 70;

		hwPercent = 20 / totalPoints;
		testPercent = 40 / totalPoints;
		projectPercent = 10 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 2;
		numberofHWs = 3;
		numberOfProjects = 2;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 97+96;
		hwGrade =100+((3.6/4)*100)+((2.9/3)*100);
		projectGrade = 100+100;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		projectAvg = projectAvg * projectPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + projectAvg;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
