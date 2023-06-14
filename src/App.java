import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId; 

public class App {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		ZoneId.getAvailableZoneIds(); // exibe os nomes de fusos que posso especificar fusos horários.
		
		// Conversão de uma data-hora global para local
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // .ofInstant = permite que eu passe um objeto Instant e fuso desejado para hora local.
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); // ''
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		
		// Obter dados de uma data-hora local
		System.out.println("d01 dia = " + d01.getDayOfMonth()); // .getDayMonth = pega o dia do mês da data.
		System.out.println("d01 mês = " + d01.getMonthValue()); // .getMonthValue = pega o mês do ano da data.
		System.out.println("d01 ano = " + d01.getYear()); // .getYear = pega o ano da data.
		
		System.out.println("d02 hora = " + d02.getHour()); // .getHour = pega a hora da data.
		System.out.println("d02 min = " + d02.getMinute()); // .getMinute = pega o minuto da data.
		System.out.println("d02 seg = " + d02.getSecond()); // .getSecond = pega o segundo da data.
	}

}
