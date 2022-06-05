import java.util.Scanner;

public class CalculoDoSomatorio {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int limiteSomatorio = 0;
		int resultado = 0;
		
		// Entrada de Dados
		System.out.print("Digite o limite do somat�rio: ");
		limiteSomatorio = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < limiteSomatorio ; i++) {
			resultado += (Math.pow(i, 2) + 2 * i + 3);
		}
		
		// Sa�da de Dados
		System.out.println("O resultado do somat�rio �: " + resultado);
		
	}

}
