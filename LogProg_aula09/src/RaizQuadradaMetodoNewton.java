import java.util.Scanner;

public class RaizQuadradaMetodoNewton {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double raizQuadrada = 0;
		
		// Entrada de Dados
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		raizQuadrada = (numero / 2);
		
		for (int i = 0 ; i < 10 ; i++) {
			raizQuadrada = ((raizQuadrada + (numero / raizQuadrada)) / 2);
		}
	
	// Saída de dados
	System.out.println("A raiz quadrada calculada pelo Java é: " + Math.sqrt(numero));
	System.out.println("A raiz quadrada calculada pelo Java é: " + raizQuadrada);
	}

}
