
public class TrocaDeValorDeVariaveis {
	public static void main (String args []) {
		// Declara��o de vari�veis
		int variavelA = 0;
		int variavelB = 0;
		int variavelTemp = 0;
		
		// Entrada de Dados
		variavelA = 45;
		variavelB = 17;
		
		// Processamento
		variavelTemp = variavelA;
		variavelA = variavelB;
		variavelB = variavelTemp;
		
		// Sa�da de dados
		System.out.println(variavelA);
		System.out.println(variavelB);
	}
}
