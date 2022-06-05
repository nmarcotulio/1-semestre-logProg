import java.util.Scanner;

public class TiposDeTrianguloPorAresta {
	public static void main (String args[]) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int tamLado1 = 0;
		int tamLado2 = 0;
		int tamLado3 = 0;
		
		// Entrada de dados
		System.out.print("Digite o tamanho de um lado do tri�ngulo: ");
		tamLado1 = leitor.nextInt();
		
		System.out.print("Digite o tamanho de outro lado: ");
		tamLado2 = leitor.nextInt();
		
		System.out.print("Digite o tamnho do �ltimo lado: ");
		tamLado3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		if (((tamLado1 + tamLado2) <= tamLado3) ||
		    ((tamLado1 + tamLado3) <= tamLado2) ||
		    ((tamLado2 + tamLado3) <= tamLado1)) {
			System.out.println("Isso n�o � um tri�ngulo");
		} else if ((tamLado1 == tamLado2) && (tamLado2 != tamLado3)) {
			System.out.println("O seu tri�ngulo � is�celes ");
		} else if ((tamLado1 == tamLado3) && (tamLado3 != tamLado2)) {
			System.out.println("O seu tri�ngulo � is�celes ");
		} else if ((tamLado2 == tamLado3) && (tamLado3 != tamLado1)) {
			System.out.println("O seu tri�ngulo � is�celes ");
		} else if ((tamLado1 != tamLado2) && (tamLado2 != tamLado3)) {
			System.out.println("O seu tri�ngulo � escaleno");
		} else if ((tamLado1 == tamLado2) && (tamLado1 == tamLado3)) {
			System.out.println("O seu tri�ngulo � equil�tero ");
		}
		
	}

}
