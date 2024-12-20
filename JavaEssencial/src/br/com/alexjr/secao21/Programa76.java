package br.com.alexjr.secao21;
// Streams

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Streams são fluxos de dados/objetos utilizados para que possamos
 * trabalhar com esses dados de forma mais criteriosa.
 * 
 * Quando trabalhamos com stream, os métodos aplicados a este stream
 * não afeta a coleção original.
 */

public class Programa76 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmo e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));

		// Como fazer para imprimir somente os cursos com mais de 100 alunos?
		// cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c ->
		// System.out.println(c));
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);

	}

}
