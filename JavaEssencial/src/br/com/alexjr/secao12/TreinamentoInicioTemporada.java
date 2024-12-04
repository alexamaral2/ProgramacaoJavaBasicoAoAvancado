package br.com.alexjr.secao12;

public class TreinamentoInicioTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo fisico de inicio de temporada");		
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo de inicio de temporada!");
	}

}
