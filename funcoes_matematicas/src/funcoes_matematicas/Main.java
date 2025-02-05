package funcoes_matematicas;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		Scanner sc = new Scanner(System.in);
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de  " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C + "\n");
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("\nValor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		System.out.println("\n\nFórmula de Bhaskara\nx = -b ± √delta/2.a\nDelta = b² - 4.a.c");
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();
		sc.close();
		double delta = (Math.pow(B, 2.0) - (4 * A * C));
		double x1 = (-B + Math.sqrt(delta)) / (2 * A);
		double x2 = (-B - Math.sqrt(delta)) / (2 * A);
		System.out.println("Valor do delta = " + delta);
		System.out.println("Raíz x1 = " + x1);
		System.out.println("Raíz x2 = "+ x2);
		System.out.print(x1);
	}

}
