import java.util.Scanner;

public class CalculoTemperatura {
	public static void main (String args[]) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double celsius = 0;
		
		double fahrenheit = 0;
		
		// Entrada de dados
		System.out.print("informe a temperatura em celsius: ");
		celsius = leitor.nextDouble();
		
		leitor.close();
		
		
		// Processamento
		fahrenheit = ((9 * celsius / 5) + 32);
		
		
		// Sa�da de dados
		System.out.print("o valor em graus Fahrenheit �: " + fahrenheit);
		
		
		
		
				
	}
}
