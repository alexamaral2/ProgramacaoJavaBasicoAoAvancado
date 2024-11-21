package br.com.alexjr.secao05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[][] matriz = new int[4][4];
		int conta10 = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { // matriz[0][0]
				System.out.print("Informe o valor inteiro para a Matriz [" + i + "," + j + "]: ");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());

				if (matriz[i][j] > 10) {
					conta10++;
				}
			}
		}
		System.out.println("A matriz possui " + conta10 + " valores maiores que 10.");

		teclado.close();

	}

}
