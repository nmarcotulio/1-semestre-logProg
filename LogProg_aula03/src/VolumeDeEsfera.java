import java.util.Scanner;

public class VolumeDeEsfera {
	public static void main(String args[]) {
		// Declara��o de Variav�is
		Scanner	leitor = new Scanner (System.in);
		
		double raio = 0;
		double volume = 0;
		
		// Entrada de dados
		System.out.print("Informe o valor do raio em metros: ");
		raio = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		volume = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
		
		//Sa�da de dados
		System.out.println("o volume ser� igual: " + volume + " metros c�bicos");
		
		
		
		
	}
}
