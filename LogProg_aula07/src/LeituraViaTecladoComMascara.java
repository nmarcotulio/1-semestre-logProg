import java.util.Scanner;

public class LeituraViaTecladoComMascara {
	public static void main(String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de Dados
		do {
			System.out.print("Digite um n�mero menor do que 10: ");
			numero = leitor.nextInt();
		} while (numero >= 10);
		
		leitor.close();
		
		// Processamento
		System.out.println("O n�mero digitado foi: " + numero);
				
	}

}
