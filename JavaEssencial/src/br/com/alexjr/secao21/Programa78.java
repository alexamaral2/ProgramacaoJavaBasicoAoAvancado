package br.com.alexjr.secao21;

//Streams
import java.util.ArrayList;
import java.util.List;

public class Programa78 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmo e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
	
		int soma = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		System.out.println("A soma de todos os cursos com mais de 100 aliunos é " + soma);
	}

}
