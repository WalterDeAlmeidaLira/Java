package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
	public static void main(String[] args) {
		//INSTANCIAR NO AGORA
		LocalDate dataLocal = LocalDate.now();
		LocalDateTime dataLocalHora = LocalDateTime.now();
		Instant global = Instant.now();
		
		//INSTANCIAR DATA DE AGORA
		LocalDate dataLocal3 = LocalDate.now();
		
		//INSTANCIAR DATA LOCAL E TEMPO
		LocalDateTime time = LocalDateTime.now();
		
		//INSTANCIAR LOCAL E DATA DE LONDRES
		Instant londres = Instant.now();
		
		//FORMATAÇÃO DE DATA 
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//EXEMPLO DE FORMATACAO
		LocalDateTime ex1 = LocalDateTime.parse("22/03/1999 01:30", formatacao);
		
		//DATA LOCAL 
		Instant local = Instant.now();
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		//FORMATAR DATA E HORA
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataLocal2 = LocalDate.parse("22/09/2023",fmt1);
		
		System.out.println("Data Local: " + dataLocal);
		System.out.println("Data e Hora Local " + dataLocalHora);
		System.out.println("Data e Hora Global " + global);
		System.out.println("Data local formatada " + dataLocal2);
		System.out.println("Exemplo de  formatação" + ex1);
		
		System.out.println("Formatacao de hora do usuario: " + fmt2.format(local));
		
		
		//FORMATANDO QUALQUER HORARIO
		
		DateTimeFormatter iso = DateTimeFormatter.ISO_DATE;
		
		Instant now = Instant.now();
		LocalDateTime exemplo1 = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
		LocalDateTime exemplo2 = LocalDateTime.ofInstant(now, ZoneId.of("Portugal"));
		
		System.out.println("hórario atual sem formação " + exemplo1);
		System.out.println("hórario atual sem formação " + exemplo2);
		
		System.out.println("Horario atual: " + formatacao.format(exemplo1));
		System.out.println("Horário de Portugal: " + formatacao.format(exemplo2));
		
		System.out.println("formatacao tipo ISO: " + iso.format(exemplo2));
		
	}
}
