import java.util.Scanner;

public class CalculoPercentualVotosEleicao {
	public static void main (String args[]) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double totalEleitores = 0;
		
		double votosValidos = 0;
		double votosBrancos = 0;
		double votosNulos = 0;
		
		double calculoPercentualVotos = 0;
		
		// Entrada de dados
		System.out.print("Digite o n�mero total de eleitores: ");
		totalEleitores = leitor.nextDouble();
		
		System.out.print("Digite o total de votos v�lidos: ");
		votosValidos = leitor.nextDouble();
		
		System.out.print("Digite o total de votos brancos: ");
		votosBrancos = leitor.nextDouble();
		
		System.out.print("Digite o total de votos nulos: ");
		votosNulos = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		calculoPercentualVotos = ((votosValidos - votosBrancos - votosNulos) / totalEleitores);
		
		// Sa�da de dados
		System.out.println("A porcentagem de votos do candidato � igual a: " + calculoPercentualVotos + " porcentos");
		
		
	}

}
