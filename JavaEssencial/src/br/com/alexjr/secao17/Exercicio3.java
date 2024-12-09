package br.com.alexjr.secao17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String arquivo;

        int contaVogais = 0;
        int contaConsoantes = 0;

        System.out.println("Informe o nome do arquivo para abrir:");
        arquivo = teclado.nextLine();

        try {
            Scanner ler = new Scanner(new FileInputStream(arquivo));

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();

                for (int i = 0; i < linha.length(); i++) {
                    char caractere = Character.toLowerCase(linha.charAt(i));

                    if (caractere == 'a' || caractere == 'e' || 
                        caractere == 'i' || caractere == 'o' || 
                        caractere == 'u') {
                        contaVogais++;
                    } else if (Character.isLetter(caractere)) {
                        contaConsoantes++;
                    }
                }
            }
            ler.close();
            System.out.println("O arquivo possui " + contaVogais + " vogais.");
            System.out.println("O arquivo possui " + contaConsoantes + " consoantes.");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }

        teclado.close();
    }
}
