package application;

import entites.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		// Exercício 1 - Problema "negativos"
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		*/
		
		/*
		// Exercício 2 - "soma_vetor"
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		
		System.out.printf("\nSOMA = %.2f", sum);
		
		double avg = sum / vect.length;
		System.out.printf("\nMEDIA = %.2f", avg);
		sc.close();
		*/
		
		/*
		// Exercíco 3 - problema "alturas"
		double sumHeigth = 0.0;
		int less16yo = 0;
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		for(int i = 0; i < person.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:\nNome: ", i + 1);
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double heigth = sc.nextDouble();
			person[i] = new Person(name, age, heigth);
			sumHeigth += person[i].getHeigth();
			if(person[i].getAge() < 16) {
				less16yo++;
			}
		}
		
		System.out.printf("Altura média: %.2f", sumHeigth / person.length);
		double avg16yo = less16yo * 100 / person.length;
		System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", avg16yo);
		for(int i = 0; i < person.length; i++) {
			if(person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		*/
		
		/*
		// Exercício 4 - problema "numeros_pares"
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int numPares = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("\nNUMEROS PARES");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				numPares++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", numPares);
		*/
		
		/*
		// Exercício 5 - problema "maior_posicao"
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maiorValor = 0;
		int posicaoVect = 0;
	
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoVect = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.2f", maiorValor);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicaoVect);
		*/
		/*
		// Exercício 6 - problema "soma_vetores"
		System.out.print("Quantos valores terão cada vetor? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] + vectB[i];
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		*/

		/*
		// Exercício 7 - Problema "abaixo_da_media"
		System.out.print("Quantos elementos o vetor vai ter? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		
		for(int i = 0; i <vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double average = sum / vect.length;
		System.out.printf("\nMÉDIA DO VETOR = %.3f", average);
		System.out.printf("\nELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < average) {
				System.out.println(vect[i]);
			}
		}
		*/
	}
}
