package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-02-23");
		LocalDateTime d05 = LocalDateTime.parse("2024-02-20T01:30:26");
		Instant d06 = Instant.parse("2024-02-23T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		//System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		//System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		// pegando data e hora atual. Olhar melhor depois
		// Date dataHoraAtual = new Date();
		// String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		// String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t1 dias = " + t1.toDays());
		
	}

}
