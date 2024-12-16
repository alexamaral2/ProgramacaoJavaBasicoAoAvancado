package br.com.alexjr.secao21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Lambdas

/*
 * Expressões lambdas são funções anonicas, ou seja, funções sem nome.
 * 
 *  Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.
 *  
 *  Devemos então criar uma função lambda compativel com a função da interface que estivermos
 *  utilizando.
 *  
 *  Por exemplo:
 *  - A interface consumer, possui um método que recebe uma String e não retorna nada. Por isso
 *  foi possivel utilizar a expressão lambda que passa uma string como parâmetro e não retorna nada.
 *  
 *  A função sort, espera receber dois parametros do tipo String como entrada e retorna um inteiro, por
 *  isso foi possivel passar a expressão lambda informando as duas strings, s1 e s1 e utilizando
 *  a classe Interger.compare que retorna um inteiro.
 */

public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Halo 5");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));

		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);
	}

}
