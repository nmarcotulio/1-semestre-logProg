import java.util.Scanner;

public class CalculoPesoMedioPopulaçao {
	public static void main(String args[]) {
		// Declaração de Variáveis
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
		
		// Saída de Dados
		System.out.println("O peso médio da população é: " + mediaPeso);
	}

}
