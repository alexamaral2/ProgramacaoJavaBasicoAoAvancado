package br.com.alexjr.secao21;

// Streams
import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmo e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
	
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)//1000
		.findAny() // Pega qualquer um de acordo com o filtro
		.ifPresent(System.out::println); // Se encontrar algum curso, imprime
	}

}
