package Data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OperacaoComDataHora {
	public static void main(String[] args) {
		LocalDate dtLocal = LocalDate.now();		
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Data local, menos uma semana : " + formatacao.format(dtLocal.minusDays(7)));
		
		LocalDateTime dtHoraLocal = LocalDateTime.now();
		DateTimeFormatter formatacaoHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Data local, mais uma semana : " + formatacaoHora.format(dtHoraLocal.plusDays(7)));
		
		Instant dtGlobal = Instant.now();
		
		DateTimeFormatter formatacaoGlobal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Europe/London"));
		System.out.println("data e hora global : " + formatacaoGlobal.format(dtGlobal));
		System.out.println("Data e hora glçobal mais sete dias: " + formatacaoGlobal.format(dtGlobal.plus(7, ChronoUnit.DAYS)));
		System.out.println("data e hora global menos sete dias "+ formatacaoGlobal.format(dtGlobal.minus(7,ChronoUnit.DAYS)));
		
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.parse("2020-09-24T14:20");
		
		Duration entreDatas = Duration.between(dt2,dt1);
		
		System.out.println("Entre datas: " + entreDatas.toDays());
	}
}
