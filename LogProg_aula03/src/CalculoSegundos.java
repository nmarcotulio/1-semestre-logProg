import java.util.Scanner;

public class CalculoSegundos {
	public static void main(String args[]) {
		// Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		int quantidadeSegundos = 0;
		
		// Entrada de dados
		System.out.print("Informe a quantidade de horas: ");
		horas = leitor.nextInt();
		
		System.out.print("Informe a quantidade de minutos: ");
		minutos = leitor.nextInt();
		
		System.out.print("Informe a quantidade de segundos: ");
		segundos = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		quantidadeSegundos = ((horas * 3600) +
				              (minutos * 60) +
				              (segundos));
		
		// Saída de dados
		System.out.println("A quantidade toal de segundo é: " + quantidadeSegundos);
		
	}

}
