package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[][] matriz = new int[5][5];
		int X;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Informe o valor inteiro para a Matriz [" + i + "," + j + "]: ");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());
			}
		}

		System.out.println("Informe um valor inteiro para buscar na matriz");
		X = Integer.parseInt(teclado.nextLine());
		int encontrou = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == X) {
					System.out.println("O valor de " + X + " está presente na posição da Matriz [" + i + "," + j + "]");
					encontrou = 1;
				}
			}

		}

		if (encontrou < 1) {
			System.out.println("Não encontrou");
		}

		teclado.close();

	}

}
