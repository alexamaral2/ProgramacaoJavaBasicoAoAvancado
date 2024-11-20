package br.com.alexjr.secao03;

import java.util.Scanner;

/*
 *	3. Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é
 *	par ou ímpar.
 */

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número inteiro");
		numero = Integer.parseInt(teclado.nextLine());
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número "+ numero + " é impar.");
		}
		
		teclado.close();

	}
}
