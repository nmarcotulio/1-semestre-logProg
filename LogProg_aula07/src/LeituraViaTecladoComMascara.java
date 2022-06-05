import java.util.Scanner;

public class LeituraViaTecladoComMascara {
	public static void main(String args[]) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de Dados
		do {
			System.out.print("Digite um número menor do que 10: ");
			numero = leitor.nextInt();
		} while (numero >= 10);
		
		leitor.close();
		
		// Processamento
		System.out.println("O número digitado foi: " + numero);
				
	}

}
