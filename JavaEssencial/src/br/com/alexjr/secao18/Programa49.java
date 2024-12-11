package br.com.alexjr.secao18;

import java.util.HashMap;
import java.util.Map;

import br.com.alexjr.secao10.Cliente;
import br.com.alexjr.secao10.Conta;

//Hash Map
// Não aceita chaves duplicadas, mas valores sim

/*
 * A Classe HashMap implementa a interface Map e trabalha com chave/valor
 */
public class Programa49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();

		Cliente cli1 = new Cliente(34, "Felicity Jones", "Rua 2");
		Cliente cli2 = new Cliente(24, "Angelina Jolie", "Rua 1");
		
		Conta c1 = new Conta(1, 200, 300, cli2);
		Conta c2 = new Conta(2, 400, 700, cli1);
		
		contas.put("Pessoa Fisica", c2);
		contas.put("Pessoa Juridica", c1);
		
		//System.out.println(contas.size());
		
		//System.out.println(contas.get("Pessoa Fisica"));
	}

}
