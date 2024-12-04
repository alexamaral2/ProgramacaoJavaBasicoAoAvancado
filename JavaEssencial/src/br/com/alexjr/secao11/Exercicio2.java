package br.com.alexjr.secao11;

public class Exercicio2 {

	public static void main(String[] args) {

		Moto m = new Moto("Suzuki", "Intruder", "Preto");
		
		m.trocarMarcha(3);
		m.imprimir();
		m.trocarMarcha(-1);
	}

}
