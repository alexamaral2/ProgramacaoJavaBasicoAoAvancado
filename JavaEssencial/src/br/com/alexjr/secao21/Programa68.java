package br.com.alexjr.secao21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Halo 5");
		
		palavras.forEach(consumidor);
		
	}

}
