package br.com.alexjr.secao03;

import java.util.Scanner;

/*
 * 2. Faça um programa que peça ao usuário para digitar um número. Se esse número for positivo,
 *	calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem dizendo
 *	que o número é inválido.
 */

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("Informe um número inteiro: ");
		numero = Integer.parseInt(teclado.nextLine());

		if (numero > 0) {
			System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));
		} else {
			System.out.println("O número " + numero + " é inválido.");
		}

		teclado.close();

	}
}
