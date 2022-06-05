import java.util.Scanner;

public class CalculoPercentualVotosEleicao {
	public static void main (String args[]) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double totalEleitores = 0;
		
		double votosValidos = 0;
		double votosBrancos = 0;
		double votosNulos = 0;
		
		double calculoPercentualVotos = 0;
		
		// Entrada de dados
		System.out.print("Digite o número total de eleitores: ");
		totalEleitores = leitor.nextDouble();
		
		System.out.print("Digite o total de votos válidos: ");
		votosValidos = leitor.nextDouble();
		
		System.out.print("Digite o total de votos brancos: ");
		votosBrancos = leitor.nextDouble();
		
		System.out.print("Digite o total de votos nulos: ");
		votosNulos = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		calculoPercentualVotos = ((votosValidos - votosBrancos - votosNulos) / totalEleitores);
		
		// Saída de dados
		System.out.println("A porcentagem de votos do candidato é igual a: " + calculoPercentualVotos + " porcentos");
		
		
	}

}
