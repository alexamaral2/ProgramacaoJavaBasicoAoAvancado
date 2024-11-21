package br.com.alexjr.secao06;

//Vetores parte 2
public class Programa17 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i ++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]); //primeiro elemento
		System.out.println(numeros[9]); //ultimo elemento
		
		//0..9
		//numeros[10] = 42;
		//System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e não
		 * podem ser aumentados/diminuidos.
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //primeiro elemento
		
		//numeros[0] = 23.4f;
		/*
		 * Os vetores/arrays possuem tipos de dados fixos
		 * e não aceitam tipos variados.
		 */
		
		for(int i =0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 10);
		}
		System.out.println(numeros[0]); //primeiro elemento
		System.out.println(numeros[9]); //ultimo elemento
		
		System.out.println(Math.round(Math.random() * 10));
		
		for(int i : numeros) {
			System.out.println(i);
		}
	}

}
