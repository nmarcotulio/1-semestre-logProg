import java.util.Scanner;

public class CalculoPesoMedioPopula�ao {
	public static void main(String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		double somaPeso = 0;
		double tamanhoPopulacao = 0;
		double mediaPeso = 0;
		
		// Entrada de Dados 
		do {
			System.out.print("Informe o peso da pessoa: ");
			somaPeso += leitor.nextDouble();
			
			tamanhoPopulacao++;
			
			System.out.print("Informe <S> se houver mais pessoas: ");
			
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		mediaPeso = (somaPeso / tamanhoPopulacao);
		
		// Sa�da de Dados
		System.out.println("O peso m�dio da popula��o �: " + mediaPeso);
	}

}
