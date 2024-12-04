package br.com.alexjr.secao12;
//Template Method

/*
 * O Padrão Template Method define o esqueleto de um algoritmo dentro de um método
 * transferindo alguns de seus passos para as sublasses. O Template Method permite que as
 * subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo.
 * 
 * Algoritmos são "receitas" passo-a-passo para resolver algum problema.
 * 
 * receber numero:
 * retornar numero *  numero;
 * 
 * metodoPrincipal(){
 * 	passo1();
 * 	passo2();
 * 	passo3();
 */
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
		tit.treinoDiario();

		System.out.println();

		TreinamentoFimTemporada tft = new TreinamentoFimTemporada();
		tft.treinoDiario();

	}

}
