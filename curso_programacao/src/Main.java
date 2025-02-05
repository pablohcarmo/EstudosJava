import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String s1, s2, s3;
		int num1;
		
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		sc.close();
		System.out.printf("Número digitado: %d\n", num1);
		System.out.printf("%s\n%s\n%s\n", s1, s2, s3);
	}
	
}
