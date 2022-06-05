
public class CalculoSoma {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		int a = 2;
		int b = 3;
		int soma = 0;
		
		// Processamento 
		soma = calcularSoma(a, b);
		
		// Sa�da de dados
		System.out.println(soma);
		System.out.println(calcularSoma(30, 29));
		
		// na volta da fun��o, se o par�metro for por refer�ncia, ele atualiza o valor (0)
		// na volta da fun��o, se o par�metro for por valor, ele n�o atualiza o valor (15)
	}
	
	// visibilidade static retorno nome (lista de par�metros separados por v�rgula)
	private static int calcularSoma(int primeiroNumero, int segundoNumero) {
		primeiroNumero = 0;
		return (primeiroNumero + segundoNumero);
	}

}

/*
 
No C a diferen�a � que se for s� a vari�vel, � por valor, se for &vari�vel, � por refer�ncia

No java todo tipo b�sico � por valor(byte, short, int, long, float,double, char, boolean)
No java todo objeto � sempre por refer�ncia

*/
