import java.util.Scanner;

public class DeterminacaoDaMaioridade {
	public static void main (String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int idade = 0;
		
		// Entrada de dados
		System.out.print("Informe a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		}else {
			System.out.println("Voc� � menor de idade");
		}
		
		
		
	}
}
