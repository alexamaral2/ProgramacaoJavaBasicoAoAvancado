package br.com.alexjr.secao17;

//Trabalhando com Strings

/*
 * Em Java, Strings são imutáveis, ou seja, não mudam. 
 */
public class Programa41 {

	public static void main(String[] args) {

		String curso = "Programação em Java: Essencial";

		// curso = curso.replace("Java", "Python"); // Altera na string, se encontrar, a
		// primeira palavra pela segunda.

		//curso = curso.toLowerCase(); // Converte as letras maiúscilas para minusculas.

		//System.out.println(curso);

		//curso = curso.toUpperCase();

		//System.out.println(curso);

		//System.out.println(curso.charAt(12));

		//for (int i = 0; i < curso.length(); i++) {
		//	System.out.println(curso.charAt(i));
		//}

		for (int i = (curso.length() - 1); i >= 0; i--) {
			System.out.print(curso.charAt(i));
		}
	}

}
