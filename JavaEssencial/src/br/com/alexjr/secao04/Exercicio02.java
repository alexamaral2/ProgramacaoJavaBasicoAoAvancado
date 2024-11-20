package br.com.alexjr.secao04;

public class Exercicio02 {

	public static void main(String[] args) {
		int i = 1;

		// for
		System.out.println("Via for....");

		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		i = 1; // resetando

		// while
		System.out.println("Via while...");
		while (i <= 100) {
			i = i + 1;
		}
		System.out.println("-----------------");
		i = 1; // resetando

		// do while
		System.out.println("Via do while..");
		do {
			System.out.println(i);
			i = i + 1;
		} while (i <= 100);
	}

}
