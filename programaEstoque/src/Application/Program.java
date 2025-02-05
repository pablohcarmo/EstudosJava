package Application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
				
		System.out.print("Enter product data:\nName: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println("\nProduct data: "+ product);
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.print("\nUpdated data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.print("\nUpdated data: " + product);
		sc.close();
	}

}