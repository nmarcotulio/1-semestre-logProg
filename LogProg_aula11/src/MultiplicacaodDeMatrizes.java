import java.util.Scanner;

public class MultiplicacaodDeMatrizes {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] operando1 = new int[2][3];
		int[][] operando2 = new int[3][2];
		int[][] resultado = new int[2][2];
		
		// Entrada de dados 
		for (int i = 0 ; i < operando1.length ; i++) {
			for (int j = 0 ; j < operando1[i].length ; j++) {
				System.out.print("Informe o valor da posição (" + i + "," + j + ") do primeiro operando: ");
				operando1[i][j] = leitor.nextInt();
			}
		}
		
		for (int i = 0 ; i < operando2.length ; i++) {
			for (int j = 0 ; j < operando2[i].length ; j++) {
				System.out.print("Informe o valor da posição (" + i + "," + j + ") do segundo operando: ");
				operando2[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < operando1.length ; i++) {				// O indice i representa as linhas do primeiro operando
			for (int j = 0 ; j < operando2[i].length ; j++) {		// O indice j representa as colunas do segundo operando
				for (int k = 0 ; k < operando1[i].length ; k++) {	// O indice k representa as colunas do primeiro operando
					resultado[i][j] += (operando1[i][k] * operando2[k][j]);
				}
			}
		}
		
		// Saída de dados
		System.out.println("Primeiro operando: ");
		for (int i = 0 ; i < operando1.length ; i++) {
			for (int j = 0 ; j < operando1[i].length ; j++) {
				System.out.print(operando1[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Segundo operando");
		for (int i = 0 ; i < operando2.length ; i++) {
			for (int j = 0 ; j < operando2[i].length ; j++) {
				System.out.print(operando2[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Resultado: ");
		for (int i = 0 ; i < resultado.length ; i++) {
			for (int j = 0 ; j < resultado[i].length ; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
