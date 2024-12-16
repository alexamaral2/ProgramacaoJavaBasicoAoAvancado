package br.com.alexjr.secao21;

public interface Teste {
	
	int valor = 9; 
	
	public String mensagem();
	
	public default void meuMetodo() {
		System.out.println("Meu default method..");
	}
}
