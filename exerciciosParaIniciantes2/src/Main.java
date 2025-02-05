import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Exercício 1
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		sc.close();
		if(numero > 0) {
			System.out.printf("O número %d é positivo!", numero);
		} else {
			System.out.printf("O número %d é negativo", numero);
		}
		/*
		//Exercício 2
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		sc.close();
		
		if (numero % 2 == 0){
			System.out.printf("O número %d é par!", numero);
		} else {
			System.out.printf("O número %d é impar!", numero);
		}
		
		//Exercício 3
		System.out.print("Digite o primeiro número: ");
		int A = sc.nextInt();
		System.out.print("\nDigite o primeiro número: ");
		int B = sc.nextInt();
		sc.close();
		if(A % B == 0 || B % A == 0) {
			System.out.print("São múltiplos!");
		} else {
			System.out.print("Não são múltiplos!");
		}
		
		//Exercício 4
		int totalHoras;
		System.out.print("Digite o horário do início do jogo: ");
		int horaInicial = sc.nextInt();
		System.out.print("\nDigite o horário do final do jogo: ");
		int horaFinal = sc.nextInt();
		sc.close();
		
		if(horaInicial < horaFinal) {
			totalHoras = horaInicial - horaFinal;
		} else {
			totalHoras = 24 - horaInicial + horaFinal;
		}	
		System.out.printf("O jogo durou %d horas", totalHoras);
		
		
		//Exercício 5
		System.out.print("Digite o código do item: ");
		int pedido = sc.nextInt();
		System.out.print("\nDigite a quantidade: ");
		int quantidade = sc.nextInt();
		double preco = 0.0;
		sc.close();
		if(pedido == 1) {
			preco = 4.00 * (double) quantidade;
		} else if (pedido == 2) {
			preco = 4.50 * (double) quantidade;
		} else if (pedido == 3) {
			preco = 5.00 * (double) quantidade;
		} else if (pedido == 4) {
			preco = 2.00  * (double) quantidade;
		} else if (pedido == 5) {
			preco = 1.50  * (double) quantidade;
		} else {
			System.out.print("\nPedido inválido!");			
		}
		System.out.printf("\nTotal R$ %.2f", preco);
		
		
		//Exercício 6
		System.out.print("Digite um valor: ");
		double valor = sc.nextDouble();
		sc.close();
		if (valor > 0 && valor <= 25.00) {
			System.out.print("\nIntervalo [0,25]");
			
		} else if (valor >= 25.00 && valor <= 50.00 ) {
			System.out.print("\nIntervalo [25,50]");
		} else if (valor >= 5.00 && valor <= 75.00) {
			System.out.print("\nIntervalo [50,75]");
		} else if (valor >= 75.00 && valor <= 100) {
			System.out.print("\nIntervalo [75,100]");
		} else {
			System.out.print("\nFora do intervalo");
		}
		
		
		//Exercício 7
		
		System.out.print("Digite o valor X do plano cartesiano: ");
		double x = sc.nextDouble();
		System.out.print("\nDigite o valor Y do plano cartesiano: ");
		double y = sc.nextDouble();
		sc.close();
		
		if (x == 0 && y == 0) {
			System.out.print("\nOrigem");
		} else if (x > 0 && y > 0 ) {
			System.out.print("\nQ1");
		} else if (x > 0 && y < 0) {
			System.out.print("\nQ4");
		} else if (x < 0 && y > 0) {
			System.out.print("\nQ2");
		} else if (x < 0 && y < 0) {
			System.out.print("\nQ3");
		}
		
		
		//Exercício 8
		System.out.print("Digite o valor do salário R$: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
		*/
	}
}
