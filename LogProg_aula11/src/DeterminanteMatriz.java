import java.util.Scanner;

public class DeterminanteMatriz {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [][] matriz = new int [3] [3];
		
		int determinante = 0;
		
		//Entrada de dados
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				System.out.print("Digite o valor do elemento [" + i + ", " + j + "] da matirz: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		// Processamento 
		determinante = (matriz[0][0] * matriz[1][1]* matriz [2][2] + 
						matriz[0][0] * matriz[1][1]* matriz [2][2] +
						matriz[0][0] * matriz[1][1]* matriz [2][2] -
						matriz[0][0] * matriz[1][1]* matriz [2][2] -
						matriz[0][0] * matriz[1][1]* matriz [2][2] -
						matriz[0][0] * matriz[1][1]* matriz [2][2]);
		
		// Saída de dados
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Determinante dessa matriz: " + determinante);
	}

}
