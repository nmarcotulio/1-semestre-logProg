import java.util.Scanner;

public class CustoTotalCompraComDesconto {
	public static void main (String args[]) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int qtdProdutos = 0;
		double valorProduto = 0;
		double valorTotal = 0;
		
		//Entrada de dados
		System.out.print("Informe o valor do produto: ");
		valorProduto = leitor.nextDouble();
		
		System.out.print("Informe quantos produtos voc� levar�: ");
		qtdProdutos = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		valorTotal = (valorProduto * qtdProdutos);
		
		if (qtdProdutos >= 30) {
			valorTotal = (0.5 * valorTotal);
		} else if (qtdProdutos >= 20) {
			valorTotal = (0.7 * valorTotal);
		} else if (qtdProdutos >= 10) {
			valorTotal = (0.9 * valorTotal);	
		}
		
		// Sa�da de Dados
		System.out.println("O valor total da compra �: " + valorTotal);		
		
		
		
	}
	

}
