import java.util.Scanner;

public class DeterminacaoParidadeESinalNumero {
	public static void main (String args[]) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner (System.in);
		
		double numero = 0;
		
		// Entrada de Dados
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Saída de Dados
		if ((numero % 2) == 0) {
			System.out.println("Seu número é par");
		}else {
			System.out.println("Seu número é impar");
		}
		
		if (numero > 0) {
			System.out.println("E seu número é positivo");
		}else if (numero < 0) {
			System.out.println("E seu número é negativo");
		}else {
			System.out.println("E Seu número é zero");
		}
		
	}

}
