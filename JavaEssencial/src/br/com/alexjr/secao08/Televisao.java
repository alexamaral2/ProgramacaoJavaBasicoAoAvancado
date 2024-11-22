package br.com.alexjr.secao08;

public class Televisao {
	ControleRemoto controle = new ControleRemoto();
	int canal = 1, volume = 1;
	boolean ligada = false;
	
	void ligaDesliga() {
		this.ligada = this.controle.ligaDesliga(ligada);
		
		if (this.ligada) {
			System.out.println("A TV foi ligada....");
		} else {
			System.out.println("A TV foi desligada....");
		}
	}
	
	void diminuirVolume() {
		this.volume = this.controle.diminuirVolume(volume);
		
		System.out.println("- Volume atual: " + this.volume);
	}
	
	void aumentarVolume() {
		this.volume = this.controle.aumentarVolume(volume);
		
		System.out.println("+ Volume atual: " + this.volume);
	}
	
	void diminuirCanal() {
		this.canal = this.controle.diminuirCanal(canal);
		
		System.out.println("- Canal atual: " + this.canal);
	}
	
	void aumentarCanal() {
		this.canal = this.controle.aumentarCanal(canal);
		
		System.out.println("+ Canal atual: " + this.canal);
	}
	
	void mudarCanal(int canal) {
		this.canal = this.controle.mudarCanal(canal); 
		
		System.out.println("Mude canal: " + this.canal);

	}
	
}
