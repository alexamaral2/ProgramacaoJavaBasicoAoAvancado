package br.com.alexjr.secao08;

public class Exercicio03 {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.ligaDesliga();
		
		tv.aumentarCanal();
		tv.aumentarCanal();
		
		tv.mudarCanal(42);
		tv.diminuirCanal();
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		
		tv.diminuirVolume();
		tv.diminuirVolume();

		tv.ligaDesliga();

	}

}
