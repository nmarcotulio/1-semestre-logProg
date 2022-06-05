import java.util.Scanner;

public class RaizQuadradaMetodoNewton {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double raizQuadrada = 0;
		
		// Entrada de Dados
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		raizQuadrada = (numero / 2);
		
		for (int i = 0 ; i < 10 ; i++) {
			raizQuadrada = ((raizQuadrada + (numero / raizQuadrada)) / 2);
		}
	
	// Sa�da de dados
	System.out.println("A raiz quadrada calculada pelo Java �: " + Math.sqrt(numero));
	System.out.println("A raiz quadrada calculada pelo Java �: " + raizQuadrada);
	}

}
