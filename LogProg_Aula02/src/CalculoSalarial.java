import java.util.Scanner;

public class CalculoSalarial {
	public static void main (String args []) {
	// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		 
		final double SALARIO_MINIMO = 1100;
		
		double quantidadeSalariosMinimos = 0;
		
		// Entrada de Dados 
		System.out.print("Informe o seu sal�rio: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		quantidadeSalariosMinimos = (salario / SALARIO_MINIMO);
		
		// Sa�da de dados
		System.out.println("Voc� recebe " + quantidadeSalariosMinimos + " sal�rios m�nimos");
		
		
		
	}
}
