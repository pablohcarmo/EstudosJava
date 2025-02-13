package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		int[] rooms = new int[9];
		int[] busyRooms = new int[n];
		String[] students = new String[9];
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
		
		System.out.println("Busy rooms");
		for(int i = 0; i < busyRooms.length; i++) {
			Arrays.sort(busyRooms);
			System.out.printf("%d: %s, %s\n", busyRooms[i], students[i], emails[i]);
		}
	}
}