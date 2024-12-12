package br.com.alexjr.secao20;

import java.util.Arrays;

public class Vetor {

	private Aluno alunos[] = new Aluno[100];
	private int total = 0;

	public void adiciona(Aluno aluno) {
		this.garantirEspcao();
		this.alunos[total] = aluno;
		total += 1;
	}

	public void adiciona(Aluno aluno, int posicao) {
		this.garantirEspcao();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida!");
		}

		for (int i = total - 1; i >= posicao; i--) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida");
		}
		return this.alunos[posicao];
	}

	public void remove(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		total--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		// Devolve a quantidade de alunos no vetor
		return this.total;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.alunos);
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}

	private void garantirEspcao() {
		// Verifica se o array alunos está cheio
		if (total == alunos.length) {
			// Caso esteja cheio, cria um novo array com o dobro de tamanho do array
			// anterior
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
}
