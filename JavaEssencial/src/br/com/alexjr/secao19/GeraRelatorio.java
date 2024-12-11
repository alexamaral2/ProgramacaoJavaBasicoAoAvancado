package br.com.alexjr.secao19;

public class GeraRelatorio implements Runnable {

	public void executa() {
		// Loop para gerar mensagens de relatório
		for (int i = 0; i < 10000000; i++) {
			System.out.println(i + " - Gerando relatório... aguarde");
		}
	}

	@Override
	public void run() {
		// Loop para gerar mensagens de relatório
		for (int i = 0; i < 10000000; i++) {
			System.out.println(i + " - Gerando relatório... aguarde");
		}
	}
}
