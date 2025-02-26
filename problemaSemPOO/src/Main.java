import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite os três lados do triângulo X: ");
		double aX = sc.nextDouble();
		double bX = sc.nextDouble();
		double cX = sc.nextDouble();
		
		System.out.print("\nDigite os três lados do triângulo Y: ");
		double aY = sc.nextDouble();
		double bY = sc.nextDouble();
		double cY = sc.nextDouble();
		
		double pX = (aX + bX + cX) /2; 
		double pY = (aY + bY + cY) /2;
		double areaX = Math.sqrt(pX * (pX - aX) * (pX - bX) * (pX - cX));
		double areaY = Math.sqrt(pY * (pY - aY) * (pY - bY) * (pY - cY));
		
		System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
		System.out.printf("\nÁrea do triângulo X: %.4f\n", areaY);
		if(areaX > areaY) {
			System.out.println("Area do triângulo X é maior");
		} else {
			System.out.println("Area do triângulo Y é maior");
		}
		
	}

}
