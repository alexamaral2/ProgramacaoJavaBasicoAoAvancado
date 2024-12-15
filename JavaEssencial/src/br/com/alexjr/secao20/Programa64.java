package br.com.alexjr.secao20;

import java.util.LinkedList;

// Conjuntos

/*
 * Uma das caracteristicas dos conjuntos é a não aceitação de elementos repetidos.
 * 
 * Gera performace.
 * 
 * A = ["Angelina, Angela, "Adriano", ...]
 * B
 * C
 * D
 * E
 * F
 * .
 * .
 * Z
 */

public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Julia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); // Não entra repetido
		
		conjunto.remove("Juvenal");
		
		System.out.println(conjunto);
	}

}
