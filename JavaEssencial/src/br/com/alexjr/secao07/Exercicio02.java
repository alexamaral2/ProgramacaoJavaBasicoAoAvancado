package br.com.alexjr.secao07;

public class Exercicio02 {

	static String dataTexto(String data) {
		String[] partes = data.split("/");
		String mesTxt = "";

		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int ano = Integer.parseInt(partes[2]);

		if (mes == 1) {
			mesTxt = "janeiro";
		} else if (mes == 2) {
			mesTxt = "fevereiro";
		} else if (mes == 3) {
			mesTxt = "março";
		} else if (mes == 4) {
			mesTxt = "abril";
		} else if (mes == 5) {
			mesTxt = "maio";
		} else if (mes == 6) {
			mesTxt = "junho";
		} else if (mes == 7) {
			mesTxt = "julho";
		} else if (mes == 8) {
			mesTxt = "agosto";
		} else if (mes == 9) {
			mesTxt = "setembro";
		} else if (mes == 10) {
			mesTxt = "outubro";
		} else if (mes == 11) {
			mesTxt = "novembro";
		} else if (mes == 12) {
			mesTxt = "dezembro";
		}

		return dia + " de " + mesTxt + " de " + ano;
	}

	public static void main(String[] args) {
		System.out.println(dataTexto("01/01/2024"));
		System.out.println(dataTexto("15/06/1987"));
	}

}
