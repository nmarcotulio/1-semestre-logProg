import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String[] args) {
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	double resultado = 1;
	
	// Entrada de Dados
	System.out.print("Digite o número para o cálculo fatorial: ");
	numero = leitor.nextInt();
	
	leitor.close();
	
	// Processamento 
	for (int i = numero ; i > 1 ; i--) {
		resultado *= (i);
		
	}
		
	// Saída de Dados 
	System.out.println(numero + "! = " + resultado);
	
	}
}
