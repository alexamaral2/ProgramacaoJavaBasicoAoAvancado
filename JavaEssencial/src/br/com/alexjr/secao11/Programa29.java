package br.com.alexjr.secao11;

/*
 * Sobrecarga de Metodo
 * Overlading
 * Ocorre quando, sobrescrevemos um método na mesma classe de declaração
 */
public class Programa29 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		p1.mensagem();
		p1.mensagem("Minha mensagem é diferente");
	}

}
