package br.com.alexjr.secao19;

/*
 * Para executar metodos em paralelo, nossa classe
 * deve implementar a interface Runnable, e o método
 * que precisar ser executado em paralelo deve ser executado
 * dentro do método run
 */
public class BarraDeProgresso implements Runnable {

	public void executa() {
		// For 0 até 10 milhões
		for (int i = 0; i < 10000000; i++) {
			System.out.println(i + " - Barra de Progresso... aguarde");
		}
	}

	@Override
	public void run() {
		// For 0 até 10 milhões
		for (int i = 0; i < 10000000; i++) {
			System.out.println(i + " - Barra de Progresso... aguarde");
		}

	}
}
