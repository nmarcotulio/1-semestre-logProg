import java.util.Scanner;

public class CalculoMediaNotasCurso {
	public static void main(String args []) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		double mediaNotaAluno = 0;
		
		// Entrada de dados
		System.out.print("Digite quanto tirou na primeira avalia��o: ");
		nota1 = leitor.nextDouble();
		
		System.out.print("Digite quanto tirou na segunda avalia��o: ");
		nota2 = leitor.nextDouble();
		
		System.out.print("Digite quanto tirou na terceira avalia��o: ");
		nota3 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		mediaNotaAluno = ((nota1 + nota2 + nota3) / 3);
				
		// Sa�da de dados
		System.out.println("A m�dia do aluno � igual a: " + mediaNotaAluno);
		
	}

}
