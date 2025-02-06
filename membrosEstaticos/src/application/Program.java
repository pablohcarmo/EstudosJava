package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Não precisamos mais instanciar a classe para utilizar seus membros.
		// As utilizaremos em qualquer lugar, independe de qualquer objeto.
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f", c);
		System.out.printf("\nVolume: %.2f", v);
		System.out.printf("\nPI value: %.2f", Calculator.PI);
		sc.close();
	}
}
