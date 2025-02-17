package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// List <tipo (wrapper class) da lista> nome da lista = new Clase que implementa a interface
		List <String> list = new ArrayList<>();
		
		//ou podemos utilizar com o String, que se tornou opcional nas versões recentes do Java.
		//List <String> list = new ArrayList<String>();
		
		// Adição de elementos
		list.add("Maria");
		list.add("Pablo");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// Para inserir um elemento na posição 2 da lista
		list.add(2, "Marco");
		
		// Para vermos o tamanho da lista
		System.out.println(list.size());
		
		for(String x : list) {
			 System.out.println(x);
		}
		
		// Para remover um elemento da lista
		list.remove(1); 
		// Neste caso, a lista é capaz de remover dados a partir da comparação dele com outro.
		list.remove("Anna");
		
		System.out.println("----------------------------");

		
		// Para remover elementos com predicado
		// A lista trabalha com elementos do tipo String
		// Todo o String x, tal que a posição 0 da cadeia seja igual a M
		list.removeIf(x -> x.charAt(0) == 'M'); // Função lambda chamada predicado, retorna um V/F.
		
		for(String x : list) {
			 System.out.println(x);
		}
		
		// Para encontrar a posição de um elemento
		System.out.println("----------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Procurando um elemento que não está na lista, será retornado -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		// Encontrar um elemento da lista que atenda um certo predicado
		// Ex: procurar o primeiro elmento que comece com a letra A
		
		// Feito a filtragem que atenda o predicado, chamamos a função findFirst que pega o primeiro elemento do stream
		// A função findFirst retorna um Optional<String> (Java 8), chamamos a função orElse(null).
		//  Ou seja, o findFirst pega o primeiro elemento do stream que atenda o predicado informado, se o elemento não existe, ele retorna nulo.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("First element with A: " + name);
		
		System.out.println("----------------------------");
		list.add("Lucas");
		list.add("Gabriel");
		list.add("Leonardo");
		list.add("José");
		
		for(String x : list) {
			 System.out.println(x);
		}
		
		System.out.println("----------------------------");
		
		// Para filtrar elementos de modo que fique apenas os que comecem com L
		
		// Precisamos declarar uma nova lista recebendo a lista "list", filtrar os elementos que comecem com L
		// Devolver uma nova lista chamada "result" somente com esse elementos
		// A lista deve ser convetida para stream (tipo especial do Java 8 em diante que aceita operações com expressões lambda
		// A partir do stream, chamamos a função filter, recebendo um predicado. Porém o stream não é compatível com o list,
		// Temos que pegar o stream e converter novamente para o tipo Lista com a função collect
		// O Java 8 só conseguiu fazer dessa forma pois o tipo List é antigo, e dessa forma é possível realizar operações Lambda com o tipo List.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String x : result) {
			 System.out.println(x);
		}
	}
}
;