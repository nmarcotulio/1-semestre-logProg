import java.util.Scanner;

public class OrdenacaoDeVetorDeStrings {
	public static void main(String[] args) {
		// Entrada de dados 
		Scanner leitor = new Scanner(System.in);
		
		String[] vetor = new String[10];
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite o texto da posição " + i + " do vetor: ");
			vetor[i] =  leitor.nextLine();
		}
		
		leitor.close();
		
		// Processamento do algoritmo de ordenação direta
		// Nesse algoritmo, há dois laços: o primeiro varre o vetor do primeiro elemento ao penúltimo
		// 								   o segundo varre o vetor do próximo elemento ao último
		for (int i = 0 ; i < (vetor.length - 1) ; i++) { // do primeiro ao penúltimo
			for (int j = (i + 1) ; j < vetor.length ; j++) { // do primeiro ao último
				if (vetor[i].compareTo(vetor[j]) > 0) { // forçar a troca do elemento i, que é maior, para o elemento j
					String temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				
			}
		}
		
		
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i]);
		}
		
	}

}
