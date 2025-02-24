package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Tamanho da matriz
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] mat = new int[m][n];
		
		// Preenchimento da matriz
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Número referência 
		int x = sc.nextInt();
	
		// Buscado do número refência
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(x == mat[i][j]) {
					
					// Posição do elemento
					System.out.printf("Position: %d, %d\n", i, j);
					
					// Se o J NÃO estiver na primeira coluna, há elementos à esquerda
					if(j > 0) {
						System.out.printf("Left: %d\n", mat[i][j -1]);
					}
					
					// Se o J NÃO estiver na última coluna, há elementos à direita
					if(j < n - 1) {
						System.out.printf("Right: %d\n", mat[i][j + 1]);
					}
					
					// Se o I NÃO estiver na linha primeira linha, há elementos acima
					if(i > mat[i].length - 1) {
						System.out.printf("Up: %d\n", mat[i - 1][j]);
					}
					
					// Se o I NÃO estiver na última linha (limite da matriz), há elementos na linha seguinte
					if(i < mat[i].length - 1) {
						System.out.printf("Down: %d\n\n", mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
