import java.util.Scanner;

public class ConversaoBinarioDecimal {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		String binario = "";
		int decimal = 0;
		
		// Entrada de dados
		System.out.print("Digite o valor em notação binário: ");
		binario = leitor.next();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < binario.length() ; i++) {
			decimal += (Integer.parseInt(binario.substring(i, i+1)) * Math.pow(2, binario.length() -1 -i));
			// Integer.parseInt é um método que converte uma String em um INT
			// String.substring é um método que pega um pedaço da String
			
		}
		
		// Saída de dados
		System.out.println("O valor correspondente em decimal é: " + decimal);
	}

}
