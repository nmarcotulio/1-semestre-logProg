import java.util.Scanner;

public class InssCalculo {
	public static void main (String args[]) {	
		//Declaração de Variavéis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		double aliquotaINSS = 0;
		double salarioLiquido = 0;
		
		//Entrada de dados
		System.out.print("Digite o valor do seu salario: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		aliquotaINSS = (salario * 0.11);
		salarioLiquido = (salario = aliquotaINSS);
		
		//Saída de dados
		System.out.println("Você vai pagar R$: " + aliquotaINSS + " de INSS,");
		System.out.println("O seu salário líquido será de: R$ " + salarioLiquido);
	}
}
