import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//Exercício 1
		System.out.println("Exercício 1");
		System.out.print("Digite o primeiro valor inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("\nDigite o segundo valor inteiro: ");
		int num2= sc.nextInt();
		sc.close();
		int resultado = num1 + num2;
		System.out.println("Resultado = " + resultado);
		
		//Exercício 2
		System.out.println("\nExercício 2");
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		sc.close();
		double pi = 3.14159;
		double area = pi * (Math.pow(raio, 2.0));
		System.out.printf("\nO valor da área é de : %.4f", area);
		
		//Exercício 3
		System.out.println("Exercício 3");
		int A, B, C, D;
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("\nDigite o valor de B: ");
		B = sc.nextInt();
		System.out.print("\nDigite o valor de C: ");
		C = sc.nextInt();
		System.out.print("\nDigite o valor de D: ");
		D = sc.nextInt();
		sc.close();
		int diferenca = (A * B - (C* D));
		System.out.println("A diferença de produto de A e B pelo produto de C e D é de : " + diferenca);
		
		//Exercício 4
		System.out.println("Exercício 4");
		System.out.print("Digite o número do funcionário: ");
		int numeroFunc = sc.nextInt();
		System.out.print("\nDigite o número de horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		System.out.print("\nDigite o salário por hora :");
		double salarioHora = sc.nextDouble();
		sc.close();
		
		double salario = salarioHora * horasTrabalhadas;
		
		System.out.println("Número do funcionário: " + numeroFunc);
		System.out.printf("Salário: R$ %.2f", salario);
				
		//Exercício 5
		System.out.println("Exercício 5");
		System.out.print("Digite o código da Peça 1: ");
		int codigoPeca1 = sc.nextInt();
		System.out.print("\nDigite a quantidade de Peças 1: ");
		int numeroPecas1 = sc.nextInt();
		System.out.print("\nDigite o valor unitário da Peça 1: ");
		double valorPeca1 = sc.nextDouble();
		
		System.out.print("Digite o código da Peça 2: ");
		int codigoPeca2 = sc.nextInt();
		System.out.print("\nDigite a quantidade de Peças 2: ");
		int numeroPecas2 = sc.nextInt();
		System.out.print("\nDigite o valor unitário da Peça 2: ");
		double valorPeca2 = sc.nextDouble();
		sc.close();
		double valorTotal = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);
		System.out.printf("Valor a Pagar: R$ %.2f", valorTotal);
		*/
		
		//Exercíco 6
		System.out.println("Exercício 6");
		System.out.print("Digite o primeiro valor: ");
		double valorA = sc.nextDouble();
		System.out.print("\nDigite o segundo valor: ");
		double valorB = sc.nextDouble();
		System.out.print("\nDigite o terceiro valor: ");
		double valorC = sc.nextDouble();
		sc.close();
		double valorPi = 3.14159;
		double areaTriangulo = (valorA * valorC) / 2;
		double areaCirculo = valorPi * Math.pow(valorC, 2.0);
		double areaTrapezio = ((valorA + valorB) * valorC) / 2;
		double areaQuadrado = Math.pow(valorB, 2.0);
		double areaRetangulo = valorA * valorB;
		sc.close();
		System.out.printf("Triângulo: %.3f\n", areaTriangulo);
		System.out.printf("Círculo: %.3f\n", areaCirculo);
		System.out.printf("Trapézio: %.3f\n", areaTrapezio);
		System.out.printf("Quadrado: %.3f\n", areaQuadrado);
		System.out.printf("Retângulo: %.3f\n", areaRetangulo);
	}

}
