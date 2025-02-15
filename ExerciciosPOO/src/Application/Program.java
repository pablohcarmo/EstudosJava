package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import entities.Employee;
import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exercício 3
		Student student = new Student();
		
		System.out.print("Student name: ");
		student.name = sc.nextLine();
		System.out.print("Enter the 1st trimester grades: ");
		student.grade1 = sc.nextDouble();
		while (student.grade1 > 30) {
			System.out.print("Invalid grade, enter again: ");
			student.grade1 = sc.nextDouble();
		}
		System.out.print("Enter the 2nd trimester grades: ");
		student.grade2 = sc.nextDouble();
		while (student.grade2 > 35) {
			System.out.print("Invalid grade, enter again: ");
			student.grade2 = sc.nextDouble();
		}
		System.out.printf("Enter the 3rd trimester grades: ");
		student.grade3 = sc.nextDouble();
		while (student.grade3 > 35) {
			System.out.print("Invalid grade, enter again: ");
			student.grade3 = sc.nextDouble();
		}
		student.showGrades();
		
		sc.close();
		
		/*
		// Exercício 2
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		System.out.print("\nEmployee: " + employee);
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.print("\nUpdated data: " + employee);
		
		sc.close();
		
		// Exercício 1
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and heigth: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		System.out.printf("\nAREA = %.2f", area);
		System.out.printf("\nPERIMETER = %.2f ", perimeter);
		System.out.printf("\nDIAGONAL = %.2f", diagonal);
		sc.close();*/
	}
}
