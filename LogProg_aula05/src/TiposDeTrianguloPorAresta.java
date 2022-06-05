import java.util.Scanner;

public class TiposDeTrianguloPorAresta {
	public static void main (String args[]) {
		// Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		
		int tamLado1 = 0;
		int tamLado2 = 0;
		int tamLado3 = 0;
		
		// Entrada de dados
		System.out.print("Digite o tamanho de um lado do triângulo: ");
		tamLado1 = leitor.nextInt();
		
		System.out.print("Digite o tamanho de outro lado: ");
		tamLado2 = leitor.nextInt();
		
		System.out.print("Digite o tamnho do último lado: ");
		tamLado3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		if (((tamLado1 + tamLado2) <= tamLado3) ||
		    ((tamLado1 + tamLado3) <= tamLado2) ||
		    ((tamLado2 + tamLado3) <= tamLado1)) {
			System.out.println("Isso não é um triângulo");
		} else if ((tamLado1 == tamLado2) && (tamLado2 != tamLado3)) {
			System.out.println("O seu triângulo é isóceles ");
		} else if ((tamLado1 == tamLado3) && (tamLado3 != tamLado2)) {
			System.out.println("O seu triângulo é isóceles ");
		} else if ((tamLado2 == tamLado3) && (tamLado3 != tamLado1)) {
			System.out.println("O seu triângulo é isóceles ");
		} else if ((tamLado1 != tamLado2) && (tamLado2 != tamLado3)) {
			System.out.println("O seu triângulo é escaleno");
		} else if ((tamLado1 == tamLado2) && (tamLado1 == tamLado3)) {
			System.out.println("O seu triângulo é equilátero ");
		}
		
	}

}
