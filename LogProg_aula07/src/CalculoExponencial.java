import java.util.Scanner;

public class CalculoExponencial {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double expoente = 0;
		
		double resultado = 1;
		
		// Entrada de Dados 
		System.out.print("Digite o número: " );
		numero = leitor.nextInt();
		
		do {
			System.out.print("Digite o expoente: " );
			expoente = leitor.nextInt();
		} while (expoente < 0);
		
		leitor.close();
		
		// Processamento 
		for (int i = 0 ; i < expoente ; i++) {
			resultado *= (numero);
		}
		
		// Saída de Dados
		System.out.println(numero + "^" + expoente + " = " + resultado);
		
	}

}
