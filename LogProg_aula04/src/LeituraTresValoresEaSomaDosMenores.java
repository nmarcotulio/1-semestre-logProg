import java.util.Scanner;

public class LeituraTresValoresEaSomaDosMenores {
	public static void main (String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int soma = 0;
		
		// Entrada de Dados
		System.out.print("Digite um n�mero: ");
		n1 = leitor.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		n2 = leitor.nextInt();
		
		System.out.print("Digite o �ltimo n�mero: ");
		n3 = leitor.nextInt();
		
		leitor.close();
		
		//Processamento 
		if ((n1 > n2) && (n1 > n3)) {
			soma = (n2 + n3); 
		}else if ((n2 > n1) &&	(n2> n3)) {
			soma = (n1 + n3);
		}else {
			soma = (n1 + n2);
		}
		
		//Sa�da de Dados
		System.out.println("A soma dos dois menores �: " +soma);
		
			
		
	}

}
