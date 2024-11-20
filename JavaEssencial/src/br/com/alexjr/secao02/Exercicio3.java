package br.com.alexjr.secao02;

import java.util.Scanner;

/*
* 2. Faça um programa que peça ao usuário para digitar três valores inteiros e imprima a soma
*deles.
*/
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1, valor2, valor3, soma;

		System.out.println("Informe o valor1: ");
		valor1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Informe o valor2: ");
		valor2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Informe o valor3: ");
		valor3 = Integer.parseInt(teclado.nextLine());

		soma = valor1 + valor2 + valor3;

		System.out.println("A soma de " + valor1 + " com " + valor2 + " e " + valor3 + " é " + soma);

		teclado.close();
	}

}
