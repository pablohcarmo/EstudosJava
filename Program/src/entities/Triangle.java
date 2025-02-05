//Pacote da classe
package entities;

//Nome da classe
public class Triangle {
	//Atributos da classe
	public double a, b, c;
	
	//Prefixo, tipo de dado, nome e lista de parâmetros do método
	public double area() {
		//Corpo do método
		double p = (a + b + c) /2; 
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//return area;
	}
}
