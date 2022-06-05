import java.util.Scanner;

public class CalculoMediaNotasCurso {
	public static void main(String args []) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		double mediaNotaAluno = 0;
		
		// Entrada de dados
		System.out.print("Digite quanto tirou na primeira avaliação: ");
		nota1 = leitor.nextDouble();
		
		System.out.print("Digite quanto tirou na segunda avaliação: ");
		nota2 = leitor.nextDouble();
		
		System.out.print("Digite quanto tirou na terceira avaliação: ");
		nota3 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		mediaNotaAluno = ((nota1 + nota2 + nota3) / 3);
				
		// Saída de dados
		System.out.println("A média do aluno é igual a: " + mediaNotaAluno);
		
	}

}
