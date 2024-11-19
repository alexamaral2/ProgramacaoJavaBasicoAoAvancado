//Operador Ternário

//Se você precisar criar a função main() //programa java
// main e no teclado pressionar CTRL + barra de espaço
package br.com.alexjr.secao04;

public class Programa05 {

	public static void main(String[] args) {
		int valor = -3, numero;
		
		/*
		if (valor > 0) {
			numero = valor;
		} else {
			numero = 7;
		}
		*/
		
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);
	}

}
