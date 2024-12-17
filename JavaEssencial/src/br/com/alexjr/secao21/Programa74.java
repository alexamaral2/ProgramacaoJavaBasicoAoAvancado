package br.com.alexjr.secao21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//Method Reference

/*
 * Pode ser consideradas simplificações das expressões lambdas.
 */
public class Programa74 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Halo 5");

		// palavras.sort(Comparator.comparing(s -> s.length()));

		// Method Reference - Forma 1
		// palavras.sort(Comparator.comparing(String::length));

		// Method Reference - Forma 2
		// Function<String,Integer> tamanho = String::length; // Usando Method Reference
		Function<String, Integer> tamanho = s -> s.length(); // Usando expressão lambda
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);

		palavras.forEach(System.out::println); // Method Reference
	}

}
