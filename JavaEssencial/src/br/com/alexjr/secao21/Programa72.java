package br.com.alexjr.secao21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa72 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Halo 5");

		// Forma 1
//		palavras.sort((s1, s2) -> {
//			return Integer.compare(s1.length(), s2.length());
//		});

		// Forma 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
	}

}
