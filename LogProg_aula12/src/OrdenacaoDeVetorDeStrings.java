import java.util.Scanner;

public class OrdenacaoDeVetorDeStrings {
	public static void main(String[] args) {
		// Entrada de dados 
		Scanner leitor = new Scanner(System.in);
		
		String[] vetor = new String[10];
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite o texto da posi��o " + i + " do vetor: ");
			vetor[i] =  leitor.nextLine();
		}
		
		leitor.close();
		
		// Processamento do algoritmo de ordena��o direta
		// Nesse algoritmo, h� dois la�os: o primeiro varre o vetor do primeiro elemento ao pen�ltimo
		// 								   o segundo varre o vetor do pr�ximo elemento ao �ltimo
		for (int i = 0 ; i < (vetor.length - 1) ; i++) { // do primeiro ao pen�ltimo
			for (int j = (i + 1) ; j < vetor.length ; j++) { // do primeiro ao �ltimo
				if (vetor[i].compareTo(vetor[j]) > 0) { // for�ar a troca do elemento i, que � maior, para o elemento j
					String temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				
			}
		}
		
		
		// Sa�da de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i]);
		}
		
	}

}
