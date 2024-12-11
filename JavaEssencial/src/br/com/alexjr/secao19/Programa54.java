package br.com.alexjr.secao19;

// Thread Sincronizada
import br.com.alexjr.secao10.Cliente;
import br.com.alexjr.secao10.Conta;

/*
 * O sincronismo ocorre pois durante a execução do método, a thread
 * executa um lock (bloqueio) da função para que outra thread
 * só possa executa-la pós a finalização da thread inicial.
 */
public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);

		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);

		t1.start();
		t2.start();

		t1.join(); // Avisando que a thread t1 deve se juntar a um sincronizador
		t2.join(); // Avisando que a thread t1 deve se juntar a um sincronizador

		System.out.println(c1);
	}

}
