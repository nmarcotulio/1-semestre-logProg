import java.util.Scanner;

public class InversaoVetor {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int[] vetor = new int [5];
		
		// Entrada de dados
				for (int i = 0 ; i < vetor.length ; i++) {
					System.out.print("Informe o valor do �ndice " + i + " do vetor: ");
					vetor[i] = leitor.nextInt();
				}
				
				leitor.close();
				
				// Sa�da de dados
				for (int i = (vetor.length - 1) ; i >= 0 ; i--) {
					System.out.println("O elemento da posi��o " + i + " desse vetor �: " + vetor[i]);
				}
				
			}

		}
