import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main(String[] args) {
		// Declra��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int[] vetor = new int [5];
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe o valor do �ndice " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Sa�da de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("O elemento da posi��o " + i + " desse vetor �: " + vetor[i]);
		}
		
	}

}
