import java.util.Scanner;

public class ConversaoBinarioDecimal {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		String binario = "";
		int decimal = 0;
		
		// Entrada de dados
		System.out.print("Digite o valor em nota��o bin�rio: ");
		binario = leitor.next();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < binario.length() ; i++) {
			decimal += (Integer.parseInt(binario.substring(i, i+1)) * Math.pow(2, binario.length() -1 -i));
			// Integer.parseInt � um m�todo que converte uma String em um INT
			// String.substring � um m�todo que pega um peda�o da String
			
		}
		
		// Sa�da de dados
		System.out.println("O valor correspondente em decimal �: " + decimal);
	}

}
