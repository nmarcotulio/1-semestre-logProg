import java.util.Scanner;

public class ConversaoDecimalParaBinario {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		int[] binario = new int [1000000];
		int tamanhoBinario = 0;
		
		// Entrada de dados
		System.out.print("Informe um n�mero: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento 
		do { 
			binario[tamanhoBinario] = (numero % 2);
			tamanhoBinario++;
			numero = (numero / 2);
		} while (numero > 0);
		
		// Sa�da de dados
		System.out.print("O n�mero bin�rio correspondente �: ");
		for (int i = (tamanhoBinario - 1) ; i >= 0 ; i--) {
			System.out.print(binario[i]);
		}
	}
}
