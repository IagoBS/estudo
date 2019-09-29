import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Interfaces {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "/home/user/Área de Trabalho";
		List<Integer> list  = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null ) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}
			Integer x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
