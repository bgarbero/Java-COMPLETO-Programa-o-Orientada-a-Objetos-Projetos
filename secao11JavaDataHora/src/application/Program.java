package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// Instanciação (agora): LocalDate, LocalDateTime, Instant

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);

		// Texto ISO 8601

		LocalDate d04 = LocalDate.parse("2024-02-23");
		LocalDateTime d05 = LocalDateTime.parse("2024-02-23T01:30:26");
		Instant d06 = Instant.parse("2024-02-23T01:30:26Z");
		Instant d07 = Instant.parse("2024-02-23T01:30:26-03:00");

		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);

		// Texto formato customizado
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d08 = LocalDate.parse("23/02/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("23/02/2024 01:30", fmt2);

		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);

		// Dados isolados

		LocalDate d10 = LocalDate.of(2024, 2, 23);
		LocalDateTime d11 = LocalDateTime.of(2024, 2, 23, 1, 30);

		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);

	}

}
