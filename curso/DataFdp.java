package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFdp {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = date1.parse("25/06/2019");
		Date y2 = date2.parse("25/06/2019 20:55:06");
		System.out.println("----------------------------------------");
		
		System.out.println(date1.format(y1));
		System.out.println(date1.format(y2));
		System.out.println(date1.format(x1));
		System.out.println(date1.format(x2));
		System.out.println(date1.format(x3));
		System.out.println(date1.format(x4));
		System.out.println("-----------------------------------------------------");
		System.out.println(date2.format(y1));
		System.out.println(date2.format(y2));
		System.out.println(date2.format(x1));
		System.out.println(date2.format(x2));
		System.out.println(date2.format(x3));
		System.out.println(date2.format(x4));
		System.out.println("-----------------------------------------------");
		System.out.println(date3.format(y1));
		System.out.println(date3.format(y2));
		System.out.println(date3.format(x1));
		System.out.println(date3.format(x2));
		System.out.println(date3.format(x3));
		System.out.println(date3.format(x4));
		System.out.println("---------------------------------------------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		
		
		
	}

}
