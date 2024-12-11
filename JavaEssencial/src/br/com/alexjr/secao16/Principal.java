package br.com.alexjr.secao16;

import java.util.Scanner;

import br.com.alexjr.secao10.Cliente;
import br.com.alexjr.secao10.Conta;

/*
 * Gerando Executáveis jar
 * 
 * JAR - Java Archive
 * Java Archive - Arquivo Compactado Java
 * 
 * zip/rar
 */
public class Principal {

	public static Cliente cliente = new Cliente(24, "Angelina Jolie", "Rua da paz, 45");
	public static Conta conta = new Conta(1, 200, 300, cliente);
	public static Scanner teclado = new Scanner(System.in);

	public static void depositar() {
		System.out.println("======== Deposito =======");
		System.out.println("Informe o valor para depostio: ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Deposito efetuado com sucesso.");
		} else {
			System.out.println("O valor precisa ser positivo.");
		}
	}

	public static void sacar() {
		System.out.println("============= SAQUE =============");
		System.out.println("Informe o valor para saque: ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.sacar(valor);
		} else {
			System.out.println("O valor precisa ser positivo.");
		}
	}

	public static void consultar() {
		System.out.println("Seu saldo é " + conta.getSaldo());
	}

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("Bem-vindo ao Banco Geek");

		do {
			System.out.println("Selecione uma opção abaixo: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				System.out.println("Obrigado por usar o Banco Geek. Até mais!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 0);

		teclado.close();
	}

}
