import java.util.Scanner;

public class InssCalculo {
	public static void main (String args[]) {	
		//Declara��o de Variav�is
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
		
		//Sa�da de dados
		System.out.println("Voc� vai pagar R$: " + aliquotaINSS + " de INSS,");
		System.out.println("O seu sal�rio l�quido ser� de: R$ " + salarioLiquido);
	}
}
