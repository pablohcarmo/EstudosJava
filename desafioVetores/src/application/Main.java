package application;

import entities.Students;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 1ª forma de resolução
		/*
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		int[] rooms = new int[9];
		int[] busyRooms = new int[n];
		

		//String[] students = new String[9];
		String[] emails = new String[9];
		
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\nName: ", i + 1);
			students[i] = sc.nextLine();
			System.out.print("Email: ");
			emails[i] = sc.nextLine();
			System.out.print("Room: ");
			rooms[i] = sc.nextInt();
			busyRooms[i] = rooms[i];
			sc.nextLine();
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < busyRooms.length; i++) {
			Arrays.sort(busyRooms);
			System.out.printf("%d: %s, %s\n", busyRooms[i], students[i], emails[i]);
		}
		
		sc.close();
		*/
		/*
		// 2ª forma de resolução - com POO
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Students[] students = new Students[n];
		int[] rooms = new int[9];
	
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\nName: ", i + 1);
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			rooms[i] = sc.nextInt();
			students[i] = new Students(name, email, rooms[i]);
			sc.nextLine();
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null && rooms[i] != 0) {
				//Arrays.sort(students);
				System.out.printf("%d: %s, %s\n", students[i].getRoom(), students[i].getName(), students[i].getEmail());
			}
		}
		
		sc.close();
		*/
		// Correção do exercício
		Students[] students = new Students[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			System.out.printf("Rent #%d:\nName: ", i);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			// instanciamos o objeto na posição que o usuário informar
			students[room] = new Students(name, email);
			}
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				System.out.printf("%d: " + students[i], i);
			}
		}
		sc.close();
	}
}