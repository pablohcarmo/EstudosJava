package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		
		for(int j = 0; j < n; j++) {
		System.out.println(vect[j]);
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		System.out.printf("Average height: %.2f", sum / 3);
		sc.close();
	}
}
