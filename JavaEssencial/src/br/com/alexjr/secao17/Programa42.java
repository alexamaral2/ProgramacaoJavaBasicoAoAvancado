package br.com.alexjr.secao17;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Escrevendo em arquivos
public class Programa42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try (PrintStream escrever = new PrintStream("saida.txt")) {
			// Desta forma, toda vez que o programa for executado.
			// o arquivo será recriado e toda a informação, se pré-existente,
			// será excluida, recomeçando um arquivo zerado.

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
