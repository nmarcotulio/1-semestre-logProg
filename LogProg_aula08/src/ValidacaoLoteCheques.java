import java.util.Scanner;

public class ValidacaoLoteCheques {
	public static void main(String[] args) {
		// Entrada de Dados
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeInformadaCheques = 0;
		double valorInformadoLote = 0;
		
		int contadorCheques = 0;
		double somaValorCheques = 0;
		
		// Entrada de Dados
			System.out.print("Informe a quantidade de cheques que há no lote: ");
			quantidadeInformadaCheques = leitor.nextInt();
			
			System.out.print("Informe o valor total dos cheques que há no lote: ");
			valorInformadoLote = leitor.nextDouble();
			
			do {
				contadorCheques++;
				
				System.out.print("Informe o valor do cheque: ");
				somaValorCheques += leitor.nextDouble();
				
				System.out.print("Informe <S> se houver mais cheques: ");
			} while (leitor.next().equalsIgnoreCase("S"));
			
			leitor.close();
			
			// Saída de dados
			if ((contadorCheques == quantidadeInformadaCheques) && (somaValorCheques == valorInformadoLote)) {
				System.out.println("Esse lote está corretamente validado!");
			} else {
				System.out.println("ERRO!!");
			}
	}

}
