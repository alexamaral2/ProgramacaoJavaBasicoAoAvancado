package br.com.alexjr.secao15;

// Tratando exceções com try/catch

/*
 * Utilizando o try para tentar realizar algo, geralmente realizar
 * aquilo que pode acarretar em um problema.
 * 
 * Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
 * uma mensagem adequada sem que o sistema quebre.
 */
public class Programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5]; // 0..4 -> 0, 1, 2, 3, 4 -> n -1

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}

		for (int i = 0; i <= numeros.length; i++) {
			try { // tente fazer isso
				System.out.println(numeros[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do Array que não existe.");
			} finally {
				System.out.println("Continue o processo..");
			}
		}
	}

}
