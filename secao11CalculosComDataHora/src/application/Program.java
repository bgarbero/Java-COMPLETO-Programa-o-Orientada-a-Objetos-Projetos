package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearLocalDate = d04.plusYears(1);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate.format(fmt1));
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate.format(fmt1));
		System.out.println("nextYearLocalDate = " + nextYearLocalDate.format(fmt1));
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime nextYearLocalDateTime = d05.plusYears(1);
		
		System.out.println();
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime.format(fmt1));
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime.format(fmt1));
		System.out.println("nextYearLocalDateTime = " + nextYearLocalDateTime.format(fmt1));
		
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		//Instant nextYearLocalInstant = d06.plus(1, ChronoUnit.YEARS);
		
		System.out.println();
		System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant  = " + nextWeekLocalInstant);
		//System.out.println("nextYearLocalInstant = " + nextYearLocalInstant);
	}

}
