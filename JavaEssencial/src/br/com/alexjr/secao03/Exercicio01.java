package br.com.alexjr.secao03;

import java.util.Scanner;

/*
 * 1. Faça um programa que peça ao usuário para digitar dois números e mostre qual deles é o
 *	maior.
 */

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1, num2;

		System.out.println("Informe o primeiro número: ");
		num1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Informe o segundo número: ");
		num2 = Integer.parseInt(teclado.nextLine());

		if (num1 > num2) {
			System.out.println("O maior número é o primeiro número: " + num1);
		} else if (num1 == num2) {
			System.out.println("Os dois números são iguais.");
		} else {
			System.out.println("O maior número é o segundo número: " + num2);
		}

		teclado.close();

	}
}
