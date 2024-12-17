package br.com.alexjr.secao22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Datas

public class Programa82 {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); // formato ISO(Internacional)
		
		LocalDate anoNovo = LocalDate.of(2024, Month.JANUARY, 1);
		System.out.println(anoNovo); // Formato ISO (Internacional)
		
		int ano = anoNovo.getYear();
		Month mes = anoNovo.getMonth();
		int dia = anoNovo.getDayOfMonth();
		
		System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano);
		
		Period periodo = Period.between(hoje, anoNovo);
		System.out.println(periodo);
		
		System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
	
		DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		System.out.println(agora.format(formatadorHoras));
		
		LocalTime intervalo = LocalTime.of(9, 30);
		System.out.println(intervalo);
	}

}
