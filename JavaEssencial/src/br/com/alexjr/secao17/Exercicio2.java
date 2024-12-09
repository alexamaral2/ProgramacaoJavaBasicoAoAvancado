package br.com.alexjr.secao17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String arquivo;
		int contaLinhas = 0;

		System.out.println("Informe o nome do arquivo para abrir:");
		arquivo = teclado.nextLine();
		
		try {
			Scanner ler = new Scanner(new FileInputStream(arquivo));
			
			while(ler.hasNextLine()) {
				contaLinhas = contaLinhas + 1;
				ler.nextLine();
			}
			ler.close();
			System.out.println("O arquivo possui " + contaLinhas);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		}

		teclado.close();
	}

}
