package Program;
import entities.Triangle;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.print("Digite os três lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("\nDigite os três lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Armazena o valor da área chamando o método para calcular
		double areaX = x.area();
		double areaY = y.area();
				
		System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
		System.out.printf("\nÁrea do triângulo X: %.4f\n", areaY);
		if(areaX > areaY) {
			System.out.println("Area do triângulo X é maior");
		} else {
			System.out.println("Area do triângulo Y é maior");
		}
	}
}