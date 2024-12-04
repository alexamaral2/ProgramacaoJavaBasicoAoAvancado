package br.com.alexjr.secao12;

//Template Method

/*
 * Final é um modificador de acesso que faz com que o 
 * elemento que esteja sendo utilizado, não possa ser exetendido/reescrito
 */
public abstract class Treinamento {

	// Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	public abstract void preparoFisico();

	public abstract void jogoTreino();

	public final void treinoTatico() {
		System.out.println("Treino Tático....");
	}

}
