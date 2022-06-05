import java.util.Scanner;

public class FatorialRecursivo {
	private static int calcularFatorial(int numero) {
		int retorno = 1;
		
		if (numero == 1) {
			retorno = 1;
		} else {
			retorno = numero * calcularFatorial(numero - 1);
		}
				
		return retorno;
	}
	
	private static int lerNumeroDoTeclado() {
		int retorno = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		retorno = leitor.nextInt();
		
		leitor.close();
		
		return retorno;
	}
	
	public static void main(String[] args) {
		// Declaração de variáveis
		int numero = 0;
		int fatorial = 0;
		
		// Entrada de dados
		numero = lerNumeroDoTeclado();
		
		// Processamento 
		fatorial = calcularFatorial(numero);
		
		System.out.println(fatorial);
	}

}



/*

Recursividade é quando uma função se auto invoca a si mesma pleonasticamente

3! = 3 * 2 * 1

3! = 3 * 2!
2! = 2 * 1!
1! = 1

*/