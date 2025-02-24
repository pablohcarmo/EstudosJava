package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// Arranjo bidimensional
		int [][] mat = new int[n][n];

		
		// O primeiro for percorre as linhas, usando o mat.length
		for(int i = 0; i < mat.length; i++) {
						
	        // O segundo for percorrerá as colunas na linha i
	        // Tamanho do vetor correspondente a linha
			for(int j = 0; j < mat[i].length; j++) {
			 	mat[i][j] = sc.nextInt();
			 }
		}
		
		System.out.print("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.printf("%d ", mat[i][i]);
		}
		
		int sumNegative = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
				sumNegative++;
				}
			}
		}
		
		System.out.print("\nNegative numbers: " + sumNegative);
		sc.close();
	}
}