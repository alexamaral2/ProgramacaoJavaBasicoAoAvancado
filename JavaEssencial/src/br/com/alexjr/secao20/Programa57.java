package br.com.alexjr.secao20;

import br.com.alexjr.secao10.Cliente;

// Lista Ligada / LinkedList

/*
 * Em um vetor, os elementos estão um ao lado do outro, enquanto em
 * uma lista ligada, eles estão em lugares diferentes, porém um aponta 
 * para o outro indicando o próximo elemento.
 */
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);

		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Felicity");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
	}

}
