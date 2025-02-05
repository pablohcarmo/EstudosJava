import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//Recebe o retorno da função, passando três parâmetros para ela
		int maior = maiorNum(a, b, c);
		
		//Passa o valor da variável "maior" como parâmetro para a função
		mostrarResultado(maior);
		
		sc.close();
	}
	
	public static int maiorNum (int x, int y, int z) {
		int auxiliar;
		if( x > y && x > z) {
			auxiliar = x;
		} else if (y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		return auxiliar;
	}
	public static void mostrarResultado(int valor) {
		System.out.println("Maior = " + valor);
	}
}