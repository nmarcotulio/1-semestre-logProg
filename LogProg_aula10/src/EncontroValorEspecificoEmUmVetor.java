import java.util.Scanner;

public class EncontroValorEspecificoEmUmVetor {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int[] vetor = new int [5];
		
		int valorProcurado = 0;
		
		int indiceEncontrado = -1;
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe o valor do �ndice " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.print("Informe o valor a ser pesquisado: ");
		valorProcurado = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		for (int i= 0 ; i < vetor.length ; i++) {
			if (valorProcurado == vetor[i]) {
				indiceEncontrado = i;
				break;
			}
		}
		
		
		// Sa�da de dados
		if (indiceEncontrado == -1) {
			System.out.println("Velho, n�o achei esse valor no vetor");
		} else {
			System.out.println("Velor, achei esse valor no �ndice " + indiceEncontrado);
		}
	}
	
}
