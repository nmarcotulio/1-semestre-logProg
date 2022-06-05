import java.util.Scanner;

public class QuadradoMagico {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int[][] quadradoMagico = new int [2][2];
		
		int numeroDoSomatorioDoQuadrado = 0;
		int soma = 0;
		
		boolean ehQuadradoMagico = true;
		
		// Entrada de dados
		for (int i = 0 ;  i < quadradoMagico.length ; i++) {
			for (int j = 0 ; j < quadradoMagico[i].length ; j++) {
				System.out.print("Digite o valor da posi��o [" + i + "," + j + "] do quadrado m�gico: ");
				quadradoMagico[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		// Processamento
		// Diagonal Principal
		soma = 0;
		for (int i = 0 ; i < quadradoMagico.length ; i++) {
			soma += quadradoMagico[i][i];
		}
		numeroDoSomatorioDoQuadrado = soma;
		
		// Diagonal Invertida
		soma = 0;
		for (int i = 0 ; i < quadradoMagico.length ; i++) {
			soma += quadradoMagico[i][quadradoMagico.length - i - 1];
		}
		if (soma != numeroDoSomatorioDoQuadrado) {
			ehQuadradoMagico = false;
		}
		
		// Linhas
		for (int i = 0 ; i < quadradoMagico.length ; i++) {
			soma = 0;
			for (int j = 0 ; j < quadradoMagico[i].length ; j++) {
				soma += quadradoMagico[i][j];
			}
			if (soma != numeroDoSomatorioDoQuadrado) {
				ehQuadradoMagico = false;
			}
		}
		
		// Colunas
		for (int j = 0 ; j < quadradoMagico.length ; j++) {
			soma = 0;
			for (int i = 0 ; i < quadradoMagico[j].length ; i++) {
				soma += quadradoMagico[i][j];
			}
			if (soma != numeroDoSomatorioDoQuadrado) {
				ehQuadradoMagico = false;
			}
		}
		
		// Sa�da de dados 
		for (int i = 0 ; i < quadradoMagico.length ; i ++) {
			for (int j = 0 ; j < quadradoMagico[i].length ; j++) {
				System.out.print(quadradoMagico[i][j] + "\t");
			}
			System.out.println("");
		}
		if (ehQuadradoMagico) {
			System.out.println("Parab�ns!! Isso � um quadrado m�gico!");
		} else {
			System.out.println("Errouu! N�o � um quadrado m�gico");
		}
	}

}
