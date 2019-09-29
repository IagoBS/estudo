package curso;

public class Foreach {
public static void main(String[] args) {
	String[] vect = new String[] {"Sophie", "Iago", "Igor" };
	
	for(int i=0;i<vect.length; i++) {
		System.out.println(vect[i]);
	}
	System.out.println("================================");
	for(Object obj : vect) {
		System.out.println(obj);
	}
	
}
}
