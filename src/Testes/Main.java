package Testes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-10-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-10-20T15:35:04");
		Instant d06 = Instant.parse("2023-10-20T15:35:04-03:00");
		
		LocalDate d07 = LocalDate.parse("20/07/2020",fmt1);
		LocalDateTime d08 = LocalDateTime.parse("20/07/2020 07:30", fmt2);
		
		LocalDate d09 = LocalDate.of(2022, 8, 12);
		LocalDateTime d10 = LocalDateTime.of(2022, 8, 12, 12, 30);
		
		System.out.println("d01 = "+d01.toString());
		System.out.println("d02 = "+d02.toString());
		System.out.println("d03 = "+d03.toString());
		System.out.println("d04 = "+d04.toString());
		System.out.println("d05 = "+d05.toString());
		System.out.println("d06 = "+d06.toString());
		System.out.println("d07 = "+d07.toString());
		System.out.println("d08 = "+d08.toString());
		System.out.println("d09 = "+d09.toString());
		System.out.println("d10 = "+d10.toString());
	}

} 
