import java.util.Scanner;

public class CalculoDoSomatorio {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int limiteSomatorio = 0;
		int resultado = 0;
		
		// Entrada de Dados
		System.out.print("Digite o limite do somatório: ");
		limiteSomatorio = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < limiteSomatorio ; i++) {
			resultado += (Math.pow(i, 2) + 2 * i + 3);
		}
		
		// Saída de Dados
		System.out.println("O resultado do somatório é: " + resultado);
		
	}

}
