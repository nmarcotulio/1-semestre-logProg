import java.util.Scanner;

public class MediaAritmeticaDeNotas {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double quantidadeDeAlunos = 0;
		
		double mediaNotas = 0;
		
		// Entrada de Dados
		do {
			System.out.println("Informe a nota do aluno: ");
			somaDasNotas += leitor.nextDouble();
			
			quantidadeDeAlunos++;
			
			System.out.println("Tem mais alunos <S/N> ?");
		} while (leitor.next().equalsIgnoreCase("S")); 
		
		leitor.close();
		
		// Processamento
		mediaNotas = (somaDasNotas / quantidadeDeAlunos);
		
		// Saída de Dados
		System.out.println("O resultado da média: " + mediaNotas);
	}

}
