package ch6java6thedition;

/**
 * This is the TestScores class from problem challenge #6.
 * 
 * @author craig
 */
public class TestScores {
	// Class fields
	private int score1,
		    score2,
		    score3;

	// Constructors
	public TestScores() {
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	
	// Getter methods

	/**
	 * The getScore1 method returns the value in the
	 * score1 field.
	 * @return score1.
	 */
	public int getScore1() {
		return score1;
	}

	/**
	 * The getScore2 method returns the value in the
	 * score2 field.
	 * @return score2.
	 */
	public int getScore2() {
		return score2;
	}

	/**
	 * The getScore3 method returns the value in the
	 * score3 field.
	 * @return score3.
	 */
	public int getScore3() {
		return score3;
	}

	// Setter methods

	/**
	 * The setScore1 method accepts an integer argument
	 * and sets the score1 field equal to it.
	 * @param s1 The value of score1.
	 */
	public void setScore1(int s1) {
		score1 = s1;
	}

	/**
	 * The setScore2 method accepts an integer argument
	 * and sets The score2 field equal to it.
	 * @param s2 The value of score2.
	 */
	public void setScore2(int s2) {
		score2 = s2;
	}

	/**
	 * The setScore3 method accepts an integer argument
	 * and sets the score3 field equal to it.
	 * @param s3 The value of score3.
	 */
	public void setScore3(int s3) {
		score3 = s3;
	}

	/**
	 * The calculateAverage method takes three integer
	 * arguments and calculates their average.
	 * @param s1 The value of score1.
	 * @param s2 The value of score2.
	 * @param s3 The value of score3.
	 * @return The average of the three grades.
	 */
	public int calculateAverage(int s1, int s2, int s3) {
		int average = (s1 + s2 + s3) / 3;
		return average;
	}
	
}

