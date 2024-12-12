package br.com.alexjr.secao20;

// Armazenamento Sequencial

/*
 * int numeros[] = new int[5];
 * 
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 10;
 * numeros[3] = 5;
 * numeros[4] = 0;
 */
public class Programa55 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");

		Vetor lista = new Vetor();

		System.out.println("Total de alunos: " + lista.tamanho());

		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());

		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());

		System.out.println(lista);

		System.out.println(lista.contem(a1));

		try {
			System.out.println(lista.pega(0));
		} catch (IllegalArgumentException e) {
			System.out.println("O aluno da posicao não existe");
			System.out.println(e.getMessage());
		}

		Aluno a3 = new Aluno("Maria");
		try {
			System.out.println(lista.pega(1));
		} catch (IllegalArgumentException e) {
			System.out.println("A posicao é invalida");
		}

		lista.remove(0);

		System.out.println(lista);

	}
}
