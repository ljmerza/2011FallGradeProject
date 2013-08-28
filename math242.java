public class math242
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
		totalPoints = 60;

		hwPercent = 20 / totalPoints;
		testPercent = 40 / totalPoints;
		projectPercent = 0 / totalPoints;
		quizPercent = 0 / totalPoints;
		labPercent = 0 / totalPoints;
		attendancePercent = 0 / totalPoints;
		finalPercent = 0 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 2;
		numberofHWs = 23;
		numberOfProjects = 1;
		numberOfQuizes = 1;
		numberOfLabs = 1;
		numberOfAttendance = 1;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 76+87;
		hwGrade = 100+100+100+100+100+100+100+100+100+100+80+100+100+100+100+100+100+100+100+100;
		projectGrade = 0;
		quizGrade = 0;
		labGrade = 0;
		attendanceGrade = 0;
		finalGrade = 0;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		quizAvg = (quizGrade / numberOfQuizes);
		labAvg = (labGrade / numberOfLabs);
		attendanceAvg = (attendanceGrade / numberOfAttendance);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		projectAvg = projectAvg * projectPercent;
		quizAvg = quizAvg * quizPercent;
		labAvg = labAvg * labPercent;
		attendanceAvg = attendanceAvg * attendancePercent;
		finalGrade = finalGrade * finalPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + projectAvg + quizAvg + labAvg + attendanceAvg + finalGrade;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
