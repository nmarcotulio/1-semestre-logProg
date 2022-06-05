
public class NumerosPrimos {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		long numero = 0;
		boolean ehPrimo = false;
		
		// Processamento
		while (true) {
			// Supor que o n�mero seja primo
			ehPrimo = true;
			
			// Avaliar se o n�mero � primo
			for (int i = 2 ; i < numero / 2 ; i++) {
				if ((numero % i) == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			// Imprimir se o n�mero for primo
			if (ehPrimo) {
				System.out.println(numero);
			}
			
			// Incrementar o n�mero
			numero++;
		}
	}
}
