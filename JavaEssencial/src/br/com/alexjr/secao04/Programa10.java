package br.com.alexjr.secao04;

import java.util.Scanner;

//Foreach
public class Programa10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nome = "Geek University";

		// para cada um dos caracteres da string, imprima os caracteres
		for (char letra : nome.toCharArray()) {
			// System.out.println(letra);
			System.out.print(letra);
		}

		teclado.close();
	}

}
