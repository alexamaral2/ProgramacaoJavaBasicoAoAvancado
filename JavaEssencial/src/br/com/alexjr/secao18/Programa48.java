package br.com.alexjr.secao18;

import java.util.HashSet;
import java.util.Set;

// Conjuntos

/*
 * Os Conjuntos são implementados com a interface Set, e uma das classes que implemetam esta interface
 * é a HashSet
 * 
 * A maioria das coleções possuem os mesmo métodos já conhecidos e utilizados com as listas, mas 
 * o comportamento desses objetos é um pouco diferente.
 * 
 * A performace também é melhor em conjuntos do que em listas.
 * 
 * Caracteristicas dos conjuntos:
 * Não aceitam valores repetidos
 * A ordem de inserção não é respeitada (Realiza uma semi-ordenação)
 * Não aceita ordenação
 */
public class Programa48 {

	public static void main(String[] args) {

		Set<String> nomes = new HashSet<String>();

		nomes.add("Maria"); // 0
		nomes.add("Felicity"); // 1
		nomes.add("Angelina"); // 2
		nomes.add("Geek"); // 3
		nomes.add("felicity"); // 4 - Conjuntos não aceitam repetição de valores

		System.out.println(nomes.size());
		System.out.println(nomes.contains("Felicity"));
		System.out.println();

		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
