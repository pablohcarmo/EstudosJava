package application;

public class Program {
	public static void main (String[] args) {
		
		// Vetor já instanciado com três posições
		String[] vect = new String[] { "Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------");
		
		// Ester for percorre todos os elementos do vetor vect apelidado de obj.
		// Ele percorrerá cada um dos elementos do vect apelidado de obj. 
		for (String obj: vect) {
			// Para cada objeto obj, contido no vetor vect, faça: 
			System.out.println(obj);
		}
	}
}
