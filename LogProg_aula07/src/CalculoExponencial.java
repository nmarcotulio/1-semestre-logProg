import java.util.Scanner;

public class CalculoExponencial {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double expoente = 0;
		
		double resultado = 1;
		
		// Entrada de Dados 
		System.out.print("Digite o n�mero: " );
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
		
		// Sa�da de Dados
		System.out.println(numero + "^" + expoente + " = " + resultado);
		
	}

}
