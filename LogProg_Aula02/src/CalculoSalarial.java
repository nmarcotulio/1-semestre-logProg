import java.util.Scanner;

public class CalculoSalarial {
	public static void main (String args []) {
	// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		 
		final double SALARIO_MINIMO = 1100;
		
		double quantidadeSalariosMinimos = 0;
		
		// Entrada de Dados 
		System.out.print("Informe o seu salário: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		quantidadeSalariosMinimos = (salario / SALARIO_MINIMO);
		
		// Saída de dados
		System.out.println("Você recebe " + quantidadeSalariosMinimos + " salários mínimos");
		
		
		
	}
}
