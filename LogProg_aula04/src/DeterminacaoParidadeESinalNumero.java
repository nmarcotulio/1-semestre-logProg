import java.util.Scanner;

public class DeterminacaoParidadeESinalNumero {
	public static void main (String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		double numero = 0;
		
		// Entrada de Dados
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Sa�da de Dados
		if ((numero % 2) == 0) {
			System.out.println("Seu n�mero � par");
		}else {
			System.out.println("Seu n�mero � impar");
		}
		
		if (numero > 0) {
			System.out.println("E seu n�mero � positivo");
		}else if (numero < 0) {
			System.out.println("E seu n�mero � negativo");
		}else {
			System.out.println("E Seu n�mero � zero");
		}
		
	}

}
