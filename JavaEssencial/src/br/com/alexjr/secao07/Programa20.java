package br.com.alexjr.secao07;

import java.util.Scanner;

// Criando nossas próprias funções
/*
 * Faça um programa que receba diversos nomes de frutas do
 * usuário e no final imprima essa ordem das frutas em ordem
 * contrária. O Programa deve solicitar ao usuário quantas frutas
 * ele quer informar.
 * 
 * Exemplo de saída:
 * Informe quantas frutas deseja cadastrar:
 * 2
 * 
 * Informe o nome de uma fruta:
 * Manga
 * 
 * Informe o nome de uma fruta:
 * Goiaba
 * 
 * Goiaba
 * Manga
 */

public class Programa20 {
	// Variaveis globais
	static String frutas[]; // Declaração do vetor de frutas
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Solicita a quantidade de frutas a cadastrar
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		// Variável local
		int qtd = Integer.parseInt(teclado.nextLine());

		// Chama a função para cadastrar os dados
		cadastrarDados(qtd);

		// Chama a função para mostrar os dados na ordem contrária
		mostrarDados(qtd);

		// Fecha o Scanner para evitar vazamentos de recursos
		teclado.close();
	}

	/*
	 * Uma função deve ter o seguinte: a) Tipo de retorno (Tipo de dado que a função
	 * vai retornar); b) Nome - Corresponde à ação que a função realiza; c)
	 * Parâmetros/Argumentos de entrada (Opcional); d) Retorno (Opcional - depende
	 * do tipo de retorno).
	 * 
	 */
	// void = vazio
	static void cadastrarDados(int quantidade) {
		// Define o tamanho do vetor
		frutas = new String[quantidade];

		// Solicita os nomes das frutas
		for (int i = 0; i < quantidade; i++) { // i++ -> i = i + 1
			System.out.println("Informe o nome da " + (i + 1) + "ª fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}

	static void mostrarDados(int quantidade) {
		// Imprime as frutas na ordem contrária
		System.out.println("\nFrutas em ordem contrária:");
		for (int i = quantidade - 1; i >= 0; i--) { // De trás para frente
			System.out.println(frutas[i]);
		}
	}
}
