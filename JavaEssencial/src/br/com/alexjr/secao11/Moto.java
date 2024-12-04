package br.com.alexjr.secao11;

public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private int marcha;

	public Moto(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	public void imprimir() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Marcha: " + this.getMarcha());
	}

	public String getMarcha() {
		if (this.marcha == 0) {
			return "0 - neutro";
		} else if (this.marcha == 1) {
			return "1 - primeira";

		} else if (this.marcha == 2) {
			return "2 - segunda";
		} else if (this.marcha == 3) {
			return "3 - terceira";
		} else if (this.marcha == 4) {
			return "4 - qaurta";
		} else {
			return "Marcha não definida";
		}
	}

	public void trocarMarcha(int valor) {
		this.marcha = this.marcha + valor;

		System.out.println("Marcha Atual: " + this.getMarcha());
	}
}
