package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product (String name, double price, int quantity) {
		// Geralmente é colocado depois dos atributos.
		// Por convenção, os parâmetros são os mesmos dos atributos.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		// Sobrecarga é disponibilizar mais de uma versão da operação
		// A diferença entre os dois construtores é a lista de parâmetros.
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		// Alterar o nome do produto.
		this.name = name;
	}
	
	public String getName() {
		// Acessar e retornar o valor do nome do produto.
		return name;
	}
	
	public void setPrice(double price) {
		// Alterar o preço do produto.
		this.price = price;
	}
	
	public double getPrice() {
		// Acessar e retornar o preço do produto.
		return price;
	}
	
	public int getQuantity() {
		// Apenas acessar e retornar a quantidade do produto.
		// Podemos adicionar ou remover itens através dos métodos.
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		//O this referencia ao atributo da classe, e não do método.
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}