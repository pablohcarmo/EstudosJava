import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		char repetir;
		do {
			System.out.print("Digite a temperatura em Cº: ");
			double celsius = sc.nextDouble();
			double fahrenheit = (9 * celsius / 5) + 32;
			System.out.printf("\nTemperatura em Fº: %.2f", fahrenheit);
			System.out.print("\nDeseja repetir o o programa? (S/N): ");
			repetir = sc.next().charAt(0);
		} while (repetir != 'n' && repetir != 'N');
		sc.close();
	}
}
