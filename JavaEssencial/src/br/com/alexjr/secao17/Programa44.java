package br.com.alexjr.secao17;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Escrita em arquivos 2
public class Programa44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			for (int i = 0; i < 5; i++) {
				System.out.println("Escreva algo para salvar no arquivo:");
				String msg = sc.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível criar o arquivo.");
		} finally {
			sc.close();
		}
	}
}
