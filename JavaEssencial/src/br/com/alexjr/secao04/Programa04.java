//if, else, if else
package br.com.alexjr.secao04;

public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inicializando a variável
		int numero = 23;
		/*
		 * se (numero > 5) então{
		 * 	escreva("Sim, o número " + numero + " é maior que 5");
		 * } senao se (numero == 5) entao {
		 * 	escreva("O número " + numero + " é igual a 5");
		 * } senao {
		 * 	escreva("Não, o número " + numero + " não é maior que 5");
		 * }
		 */
		
		if (numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5");
		} else if (numero == 5) {
			System.out.println("O número " + numero + " é igual a 5");
		} else if(numero % 2  == 0) {
			//Verificando se o número é par
			System.out.println("O número " + numero + "é par.");
		}
		else {
			System.out.println("Não, o número " + numero + " não é maior que 5");
		}

	}

}
