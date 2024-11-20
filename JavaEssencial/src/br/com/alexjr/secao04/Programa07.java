package br.com.alexjr.secao04;

import java.util.Scanner;

/*
 * Receba dados do usuário enquanto a idade for maior que 0
 */

//while e do while
public class Programa07 {

	public static void main(String[] args) {
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);

		int idade = 1;
		String nome;
		
		//sempre checa o valor antes de executar o bloco
		while (idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //Bug
			idade = Integer.parseInt(teclado.nextLine());

			System.out.println(nome + " tem " + idade + " anos");
		}
		teclado.close();

	}

}
