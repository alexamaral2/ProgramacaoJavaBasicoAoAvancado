package br.com.alexjr.secao05;

//Tipos booleanos
public class Programa14 {

	public static void main(String[] args) {
		// tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;

		// tipos não primitivos
		Boolean v = true;
		Boolean f = false;

		boolean ativo = true;

		System.out.println("verdadeiro " + verdadeiro);
		System.out.println("False " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);

		if (verdadeiro) {
			System.out.println("É Verdadeiro");
		} else {
			System.out.println("É falso");
		}

		if (1 == 3) {
			System.out.println("1  == 1 é Verdadeiro");
		} else {
			System.out.println("... é falso");
		}

		if (ativo) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}

/*
 * if (realiza uma verificação que no final retorna ou true ou false)
 */