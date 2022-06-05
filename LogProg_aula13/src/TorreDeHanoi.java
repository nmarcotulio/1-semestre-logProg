import java.util.Scanner;

public class TorreDeHanoi {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int numero = 0;
		
		// Entrada de dados
		numero = lerNumeroDoTeclado();
		
		// Processamento
		movimentarTorreDeHanoi(numero, "Torre 1", "Torre 2", "Torre 3");
		
	}
	
	private static int lerNumeroDoTeclado() {
		int retorno = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		retorno = leitor.nextInt();
		
		leitor.close();
		
		return retorno;
	}
	
	private static void movimentarTorreDeHanoi(int numero, String origem, String meio, String destino) {
		if (numero > 0) {
		movimentarTorreDeHanoi(numero -1, origem, destino, meio);
		System.out.println("Movimentar " + numero + " da " + origem + " para o " + destino);
		movimentarTorreDeHanoi(numero - 1, meio, origem, destino);
	
		}
	}	
}

