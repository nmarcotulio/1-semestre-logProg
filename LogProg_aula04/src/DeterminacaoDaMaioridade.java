import java.util.Scanner;

public class DeterminacaoDaMaioridade {
	public static void main (String args[]) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner (System.in);
		
		int idade = 0;
		
		// Entrada de dados
		System.out.print("Informe a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}
		
		
		
	}
}
