import java.util.Scanner;

public class ExponencialNeperianoPorTaylor {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner (System.in);
		
		double expoente = 0;
		
		double resultado = 0;
		double dividendoResultado = 0;
		double divisorResultado = 0;
		
		// Entrada de dados
		System.out.print("Digite o expoente: ");
		expoente = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		resultado = 1 + expoente;
		
		for (int i = 2 ; i < 150 ; i++) {
			// For para o cálculo do número elevado ao índice i
			dividendoResultado = expoente;
			for (int j = 1 ; j < i ; j++) {
				dividendoResultado *= expoente;
			}
			
			// For para o cálculo do fatorial do índice i
			divisorResultado = 1;
			for (int j = i ; j > 0 ; j--) {
				divisorResultado *= j;
			}
			
			resultado += (dividendoResultado / divisorResultado);
		}
		
		
		
		// Saída de dados
		System.out.println("O número de Euller elevado ao expoente calculado pelo Java é: " + Math.pow(Math.E, expoente));
		System.out.println("O número de Euller elevado ao expoente calculado por Taylor é: " + resultado);
	}

}
