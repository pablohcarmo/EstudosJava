
public class Main {

	public static void main(String[] args) {
		String original = "abcde FHIJ ABC abc DEFG     ";
		System.out.println("Original: " + original + ".");
		
		//Para letras minúsculas
		String minusculas = original.toLowerCase();
		System.out.println("Minúsculas: " + minusculas + ".");
		
		//Para letras maiúsculas
		String maiusculas = original.toUpperCase();
		System.out.println("Maiúsculas: " + maiusculas + ".");
		
		//Para remover espaços
		String removerEspacos = original.trim(); //Remove espaços somente antes e depois
		System.out.println("Remover espaços: " + removerEspacos + ".");
		
		//Recortar caracteres
		String inicioString = original.substring(2); //A partir do caractere 2 em diante
		System.out.println("2 em diante: " + inicioString);
		String inicioEFimString = original.substring(8, 12);
		System.out.println("8 a 12: " + inicioEFimString); //A partir do 8 ao 12
		
		//Substituir caracteres
		String substituir = original.replace('a', 'x');
		System.out.println("Substituir a por X: " + substituir );
		String substituirEmCadeia = original.replace("abc", "xyz");
		System.out.println("Substituir em cadeia: " + substituirEmCadeia);
		
		//Buscar posição
		int i = original.indexOf("bc"); //Primeira posição da letra B = 1
		int j = original.lastIndexOf("bc"); //Última posição do bc = 16
		System.out.println("Primeira posição da letra b: " + i);
		System.out.println("Última posição da letra b: " + j);
		
		//Recortar strings
		//Podemos recortar palavras de uma variável String e atribuir à outras
		String frutas = "apple lemon banana";
		String[] vect = frutas.split(" "); //Separador é o espaço em branco
		for(int h = 0; h < 3; h++) {
			System.out.println(vect[h]);
		}
	}
}