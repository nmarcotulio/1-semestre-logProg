import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main(String[] args) {
		// Declração de Variáveis
		Scanner leitor = new Scanner (System.in);
		
		int[] vetor = new int [5];
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe o valor do índice " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("O elemento da posição " + i + " desse vetor é: " + vetor[i]);
		}
		
	}

}
