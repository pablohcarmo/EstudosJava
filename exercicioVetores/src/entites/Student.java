package entites;

public class Student {
	private String name;
	private double grade1, grade2;
	
	public Student(String name, double grade1, double grade2) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	public String getName() {
		return name;
	}

	public double getGrade1() {
		return grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public double average() {
		return (grade1 + grade2) / 2;
	}
}
