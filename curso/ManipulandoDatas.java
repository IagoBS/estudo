package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = date1.parse("25/06/2019");
		Date y2 = date2.parse("25/06/2019 20:55:06");
		Date y3 = date2.parse("27/06/2019 17:57:07");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Calendar calendario = Calendar.getInstance();
		System.out.println("----------------------------------------");
		System.out.println(d);
	calendario.setTime(d);
	calendario.add(Calendar.HOUR, 1);
	d = calendario.getTime();
	System.out.println(d);
		int minutes = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		int hora = calendario.get(Calendar.HOUR);
		int dia1 = calendario.get(Calendar.DAY_OF_MONTH);
		int dia2 = calendario.get(Calendar.DAY_OF_WEEK);
		System.out.println(segundos);
		System.out.println(minutes);
		System.out.println(hora);
		System.out.println(dia1);
		System.out.println(dia2);
		
	
		teclado.close();
	}

}
