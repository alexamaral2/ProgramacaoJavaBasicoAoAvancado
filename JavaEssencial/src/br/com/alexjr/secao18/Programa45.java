package br.com.alexjr.secao18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Listas

/*
 * Arrays (Vetores/Matrizes)
 * Um Array tem tamanho fixo. Ou seja, se criarmos um array
 * com 5 elementos ele terá sempre no máximo 5 elementos.
 */

/*
 * Um array tem tipo dado fixo. Ou seja, se criarmos um array de inteiros
 * ele só poderá ter inteiros.
 */

/*
 * É dificil encontrar um determinado elemento em um Array. Precisamos para isso
 * varrer todo o array atráves do seu indice, caso não façamos busca pelo indice.
 */

/*
 * Collections (Coleções)
 * 
 * Java possui diversas classes/interfaces que facilitam muito o trabalho
 * quando se trata de coleções de dados. Essas classes/interfaces são chamadas de Collections (Coleções)
 */

/*
 * Listas
 * Possuem tamanho 'infinito' (depende da memória)
 * Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração
 */
public class Programa45 {

	public static void main(String[] args) {
		// List nomes = new ArrayList(); // Sem definir tipo de dado, podemos colocar
		// qualquer tipo

		List<String> nomes = new ArrayList<String>(); // Definimos o tipo String

		nomes.add("Maria");// 0
		nomes.add("Felicity");
		nomes.add("Angelina"); // 2
		nomes.add("Geek");
		nomes.add("Maria");

		// nomes.add(44);
		// nomes.add(true);
		// nomes.add(12.4);
		// nomes.add("e");

		// System.out.println(nomes.get(3));
		// System.out.println(nomes.get(0));
		// System.out.println(nomes.size());
		// System.out.println();

		// for (int i = 0; i < nomes.size(); i++) {
		// System.out.println(nomes.get(i));
		// }

		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
