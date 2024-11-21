package br.com.alexjr.secao05;

public class Exercicio01 {

	public static void main(String[] args) {
		int[] A = new int[6];
		int soma;

		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;

		soma = A[0] + A[1] + A[5];
		System.out.println("A soma é " + soma);

		A[4] = 100;

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
