import java.util.Scanner;

public class DiaDaSemanaAPartirDeUmaData {
	public static void main (String args[]) {
		// Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		int diaSemana = 0;
		
		// Entrada de dados 
		System.out.print("Informe o dia: ");
		dia = leitor.nextInt();
		
		System.out.print("Informe o mês: ");
		mes = leitor.nextInt();
		
		System.out.print("Informe o ano: ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		// Processamento 
		diaSemana = (((dia) + (2 * mes) + ((3 * (mes + 1))/5) + ((ano) + (ano / 4)) - (ano / 100) +
				(ano / 400) + 2) % 7);
		
		// Saída de Dados
		switch (diaSemana) {
		case 0:
			System.out.println("Sábado !");
			break;
		case 1:
			System.out.println("Domingo !");
			break;
		case 2:
			System.out.println("Segunda !");
			break;
		case 3:
			System.out.println("Terça !");
			break;
		case 4:
			System.out.println("Quarta !");
			break;
		case 5:
			System.out.println("Quinta !");
			break;
		case 6:
			System.out.println("Sexta !");
			break;
		}
		
				
	}

}
