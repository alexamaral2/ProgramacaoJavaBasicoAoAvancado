package br.com.alexjr.secao08;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List<Contato> contatos = new ArrayList<>();

	void armazenarContato(Contato contato) {
		this.contatos.add(contato);
	}

	void removeContato(Contato contato) {
		this.contatos.remove(contato);
	}

	int buscaContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome() == nome) {
				return i;
			}
		}
		return -1;
	}
	
	void imprimeAgenda() {
		System.out.println("====== AGENDA ======");
		for(Contato contato : contatos) {
			contato.imprimir();
		}
		System.out.println("======Fim======");
	}
	
	void imprimeContato(int index) {
		contatos.get(index).imprimir();
	}
}
