package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	private double minGrade = 90 * 60 / 100;
	
	public void showGrades() {
		double finalGrade = grade1 + grade2 + grade3;
		
		
		if(finalGrade > minGrade) {
			System.out.printf("FINAL GRADE = %.2f\nPASS", finalGrade);
		} else {
			System.out.printf("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", finalGrade, 60 - finalGrade);
		}
	}
}
