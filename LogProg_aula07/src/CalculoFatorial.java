import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String[] args) {
	// Declara��o de Vari�veis
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	double resultado = 1;
	
	// Entrada de Dados
	System.out.print("Digite o n�mero para o c�lculo fatorial: ");
	numero = leitor.nextInt();
	
	leitor.close();
	
	// Processamento 
	for (int i = numero ; i > 1 ; i--) {
		resultado *= (i);
		
	}
		
	// Sa�da de Dados 
	System.out.println(numero + "! = " + resultado);
	
	}
}
