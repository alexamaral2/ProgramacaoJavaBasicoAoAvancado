package br.com.alexjr.secao08;

public class ControleRemoto {

	boolean ligaDesliga(boolean ligada) {
		return !ligada;
	}

	int aumentarVolume(int volume) {
		return volume += 1;
	}

	int diminuirVolume(int volume) {
		return volume -= 1;
	}

	int aumentarCanal(int canal) {
		return canal += 1;
	}

	int diminuirCanal(int canal) {
		return canal -= 1;
	}
	
	int mudarCanal(int canal) {
		return canal;
	}
}
