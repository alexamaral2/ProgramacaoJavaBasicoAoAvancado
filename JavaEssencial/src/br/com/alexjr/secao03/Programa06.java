//Instrução Switch
package br.com.alexjr.secao03;

public class Programa06 {

	public static void main(String[] args) {
		int numero = 33;

		switch (numero) {
		case 0:
			System.out.println("O número é 0");
			break;
		case 3:
			System.out.println("O número é 3");
			break;
		case 5:
			System.out.println("O número é 5");
			break;
		default:
			System.out.println("[Default] O número é " + numero);
			break;
		}
	}

}
