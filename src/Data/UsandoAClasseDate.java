package Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UsandoAClasseDate {
	public static void main(String[] args) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat fmtTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date agora = new Date();
		
		
		System.out.println("Data de hoje com formatação : " + fmtTime.format(agora));
		System.out.println("Data de hoje sem formatação : " + agora);
		
		// CLASSE CALENDAR
		SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.HOUR_OF_DAY, 1);
		now = cal.getTime();
		System.out.println("Data formatada: " + formatacao.format(now));
		int mes = 1 + cal.get(Calendar.MONTH);
		System.out.println("mes : " + mes);
		
		
	}
}
