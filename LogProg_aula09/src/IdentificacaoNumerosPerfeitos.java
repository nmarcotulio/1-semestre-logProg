
public class IdentificacaoNumerosPerfeitos {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		long numero = 0;
		long somaDivisores = 0;
		
		// Processamento
		while (true) {
			numero++;
			somaDivisores = 0;
			
			for(int i = 1 ; i <= (numero/2) ; i++) {
				if ((numero % i ) == 0) {
					somaDivisores += i;
				}
			}
			
			if (numero == somaDivisores) {
				System.out.println(numero + " � perfeito!");
			}
		}
		
		
	}

}
