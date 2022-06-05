import java.util.Scanner;

public class VerificacaoPalindromo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		String texto = "";
		
		boolean ehPalindromo = true;
		
		// Entrada de dados
		System.out.print("Digite o texto: ");
		texto = leitor.nextLine();
		
		leitor.close();
		
		// Processamento
		texto = texto.replace(" ", "").replace(",", "").toUpperCase();
		for (int i = 0 ; i < texto.length() / 2 ; i++) {
			if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
				ehPalindromo = false;
				break;
			}
		}
		
		// Saída de dados
		if (ehPalindromo) {
			System.out.println("Parabéns! Isso é um palíndromo!");
		} else {
			System.out.println("Isso não é um palíndromo!");
		}
	}

}
