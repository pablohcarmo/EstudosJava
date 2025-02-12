package entites;

public class Person {
	private String name;
	private int age;
	private double heigth;
	private char gender;
	
	public Person(double heigth, char gender) {
		this.heigth = heigth;
		this.gender = gender;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeigth() {
		return heigth;
	}

	public char getGender() {
		return gender;
	}
}
