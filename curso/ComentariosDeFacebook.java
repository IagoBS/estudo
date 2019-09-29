package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entites.Coment;
import entites.Post;

public class ComentariosDeFacebook {

	public static void main(String[] args) throws ParseException {
		Coment c1 = new Coment("Have");
		Coment c2 = new Coment("Toma no cu cajuru");
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
		Post p1 = new Post(sdf.parse("29/07/2002 10:10:22"), 
				"Iago está aprendendo a programar", "Toma no cu cajuru",
				10000);
		System.out.println(p1);

	}

}
