package br.com.alexjr.secao03;

import java.util.Scanner;

/* 3. Faça um programa que peça ao usuário para digitar um número real e imprima o resultado do
*  quadrado desse número.
*/
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float real, quadrado;

		System.out.println("Informe um valor real: ");
		real = Float.parseFloat(teclado.nextLine());

		quadrado = real * real;

		System.out.println("O quadrado de " + real + " é " + quadrado);

		teclado.close();
	}

}
