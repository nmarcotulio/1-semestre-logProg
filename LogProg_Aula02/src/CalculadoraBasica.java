import java.util.Scanner;

public class CalculadoraBasica {
	public static void main (String args[]) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		int divisao = 0;
		int resto = 0;
		
		//Entrada de dados
		System.out.print("Digite um numero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		soma = (numero1 + numero2);
		subtracao = (numero1 - numero2);
		multiplicacao = (numero1 * numero2);
		divisao = (numero1 / numero2);
		resto = (numero1 % numero2);
		
		// Sa�da de Dados
		System.out.println("o resultado da soma �: " + soma);
		System.out.println("o resultado da subtra��o �: " + subtracao);
		System.out.println("o resultado da multiplica��o �: " + multiplicacao);
		System.out.println("o resultado da divis�o �: " + divisao);
		System.out.println("o resultado do resto �: " + resto);
		
		
	}
}
