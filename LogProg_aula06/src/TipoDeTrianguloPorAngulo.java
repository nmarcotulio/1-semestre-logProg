import java.util.Scanner;

public class TipoDeTrianguloPorAngulo {
	public static void main (String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int anguloA = 0;
		int anguloB = 0;
		int anguloC= 0;
		
		// Entrada de dados
		System.out.print("Informe o primeiro �ngulo: ");
		anguloA = leitor.nextInt();
		
		System.out.print("Informe o segundo �ngulo: ");
		anguloB = leitor.nextInt();
		
		System.out.print("Informe o terceiro �ngulo: ");
		anguloC = leitor.nextInt();
		
		leitor.close();
		
		// Processamento 
		if ((anguloA + anguloB + anguloC) != 180) {
			System.out.println("Ta de sacanagem?");
		} else if ((anguloA == 90) || (anguloB == 90) || (anguloC == 90));
			System.out.println("Isso � um tri�ngulo ret�ngulo"); {
		} else if ((anguloA < 90) && (anguloB > 90) || (anguloC == 90));
		System.out.println("Isso � um tri�ngulo ret�ngulo"); {				

		}
		
		
	}

}
