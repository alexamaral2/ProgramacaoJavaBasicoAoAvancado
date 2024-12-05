package br.com.alexjr.secao14;

import br.com.alexjr.secao14.Conta;

//Atributos estáticos

/*
 * Atributos Estáticos são atributos, onde os valores são compartilhados
 * entre as instâncias da classe.
 * 
 * Para utilizar um atributo estático, colocamos o nome da classe
 * junto ao atributo.
 * 
 * Exemplo:
 * NomeDaClasse.atributo;
 */
public class Programa34 {
	public static void main(String[] args) {

		Conta c1 = new Conta("Angelina Jolie");

		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());

		Conta c2 = new Conta("Felicity Jones");

		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());

		Conta c3 = new Conta("Maria da Graça Xuxa Meneguel");

		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
	}
}
