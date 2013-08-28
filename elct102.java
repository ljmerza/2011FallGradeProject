public class elct102
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
		totalPoints = 80;

		hwPercent = 20 / totalPoints;
		testPercent = 40 / totalPoints;
		quizPercent = 20 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 2;
		numberofHWs = 7;
		numberOfQuizes = 3;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 95+84;
		hwGrade = 74+93+90+100+85+93+75;
		quizGrade = 100+100+88;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		quizAvg = (quizGrade / numberOfQuizes);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		quizAvg = quizAvg * quizPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + quizAvg;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
