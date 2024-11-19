package br.com.alexjr.secao03;

import java.util.Scanner;

/*
* 1. Faça um programa que leia um número inteiro e o imprima
*/
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro: ");
		numero = Integer.parseInt(teclado.nextLine());
		
		System.out.println("O número informado foi " + numero);
	
		teclado.close();
	}

}
