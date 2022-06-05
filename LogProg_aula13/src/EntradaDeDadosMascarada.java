import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaDeDadosMascarada {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int numeroInteiro = 0;
		double numeroFracionario = 0;
		String texto = "";
		String telefone = "";
		
		// Entrada de dados
		numeroInteiro = lerNumeroInteiro();
		numeroFracionario = lerNumeroFracionario();
		texto = lerTextoDeTamanhoFixo(7);
		telefone = lerTelefone();
		
		// Sa�da de dados 
		System.out.println(numeroInteiro);
		System.out.println(numeroFracionario);
		System.out.println(texto);
		System.out.println(telefone);
	}
	
	private static int lerNumeroInteiro() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = 0;
		boolean sucesso = false;
		
		do {
			try {
			System.out.print("Digite um n�mero inteiro: ");
			retorno = Integer.parseInt(leitor.readLine());
			sucesso = true;
			} catch (Exception erro) {
				System.out.println("Amig�o, ai n�o, n�? Apenas n�meros inteiros!");
				sucesso = false;
			}
		} while (! sucesso);
		
		
		return retorno;
	}
	
	private static double lerNumeroFracionario() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		double retorno = 0;
		boolean sucesso = false;
		
		do {
			try {
				System.out.print("Digite um n�mero fracion�rio: ");
				retorno = Double.parseDouble(leitor.readLine());
				sucesso = true;
			} catch (Exception erro) {
				System.out.println("Amig�o, apenas n�mero fracion�rio!");
			}
		} while (! sucesso);
		
		return retorno;
		
	}
	
	private static String lerTextoDeTamanhoFixo(int tamanhoDoTexto) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		do {
			try {
				System.out.print("Digite um texto de tamanho " + tamanhoDoTexto + ": ");
				retorno = leitor.readLine();
			} catch (Exception erro) {
				System.out.println(erro);
			}
		} while (retorno.length() != tamanhoDoTexto);
		
		return retorno;
	}
	
	private static String lerTelefone() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		boolean sucesso = false;
		
		do {
			try {
				System.out.print("Digite um n�mero de telefone: ");
				retorno = leitor.readLine();
				sucesso = true;
				
				// Tamanho total
				if (retorno.length() != 17) {
					sucesso = false;
				}
				
				// +
				if (! retorno.substring(0, 1).equals("+")) {
					sucesso = false;
				}
				
				// C�digo internacional (2 n�meros inteiros)
				Integer.parseInt(retorno.substring(1, 3));
					
				// ( 
				if (! retorno.substring(3, 4).equals("(")) {
					sucesso = false;
				}
				
				// C�digo nacional (2 n�meros inteiros)
				Integer.parseInt(retorno.substring(4, 6));
				
				// )
				if (! retorno.substring(6, 7).equals(")")) {
					sucesso = false;
				}
				
				// prefixo (5 n�meros inteiros)
				Integer.parseInt(retorno.substring(7, 12));
				
				// -
				if (! retorno.substring(12, 12).equals("-")) {
					sucesso = false;
				}
				
				// sufixo (4 n�meros inteiros
				Integer.parseInt(retorno.substring(13));
				
			} catch (Exception erro) {
				sucesso = false;
			}
		} while (! sucesso);
		
		return retorno;
	}
}
