package br.com.alexjr.secao07;

public class Exercicio3 {

	static int maior(int valor1, int valor2) {
		if (valor1 > valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}

	public static void main(String[] args) {
		System.out.println(maior(21, 42)); // 42
		System.out.println(maior(56, 42)); // 56
		System.out.println(maior(27, 27)); // 27

	}

}
