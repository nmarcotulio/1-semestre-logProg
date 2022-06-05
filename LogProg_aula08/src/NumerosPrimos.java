
public class NumerosPrimos {
	public static void main(String[] args) {
		// Declaração de Variáveis
		long numero = 0;
		boolean ehPrimo = false;
		
		// Processamento
		while (true) {
			// Supor que o número seja primo
			ehPrimo = true;
			
			// Avaliar se o número é primo
			for (int i = 2 ; i < numero / 2 ; i++) {
				if ((numero % i) == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			// Imprimir se o número for primo
			if (ehPrimo) {
				System.out.println(numero);
			}
			
			// Incrementar o número
			numero++;
		}
	}
}
