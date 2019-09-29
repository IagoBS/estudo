package contrato;

public class Vetores4 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int[] vetor2 = new int[20];
		for(int i=0; i<20; i++) {
			vetor[i] += i;
			vetor2[i] += i;
			vetor2[i] = vetor[i] + vetor2[i] + 1;
			
			
			System.out.println(vetor2[i] + 1);
		}

	}

}
