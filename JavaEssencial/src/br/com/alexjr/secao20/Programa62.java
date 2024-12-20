package br.com.alexjr.secao20;

//Filas

/*
 * Todo elemento entra no final da fila.
 * O primeiro elemento a entrar é também o primeiro a sair.
 * <- [0][1][2][3][4]
 */

public class Programa62 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		System.out.println(fila);

		fila.adciona("Angelina");
		fila.adciona("Felicity");
		fila.adciona("Maria");
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		
		fila.remove();
		fila.remove();
		System.out.println(fila.vazia());
		
		System.out.println(fila);
		fila.remove();
	}

}
