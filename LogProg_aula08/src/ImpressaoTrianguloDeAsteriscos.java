import java.util.Scanner;

public class ImpressaoTrianguloDeAsteriscos {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int tamanhoDoTriangulo = 0;
		
		//Entrada de dados
		System.out.print("Informe o tamanho do tri�ngulo: ");
		tamanhoDoTriangulo = leitor.nextInt();
		
		leitor.close();
		
		// Sa�da de dados
		for (int i = 0 ; i < tamanhoDoTriangulo ; i++) {
			for (int j = 0 ; j < (i + 1) ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
