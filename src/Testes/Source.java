package Testes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Source {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-21");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-21T14:18");
		Instant d03 = Instant.parse("2022-07-21T14:18:09Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d01 = "+ d01.format(fmt1));
		System.out.println("d02 = "+d02.format(fmt2));
		System.out.println("d03 = "+fmt3.format(d03));

	}

}
