
public class CalculoSoma {
	public static void main(String[] args) {
		// Declaração de Variáveis
		int a = 2;
		int b = 3;
		int soma = 0;
		
		// Processamento 
		soma = calcularSoma(a, b);
		
		// Saída de dados
		System.out.println(soma);
		System.out.println(calcularSoma(30, 29));
		
		// na volta da função, se o parâmetro for por referência, ele atualiza o valor (0)
		// na volta da função, se o parâmetro for por valor, ele não atualiza o valor (15)
	}
	
	// visibilidade static retorno nome (lista de parâmetros separados por vírgula)
	private static int calcularSoma(int primeiroNumero, int segundoNumero) {
		primeiroNumero = 0;
		return (primeiroNumero + segundoNumero);
	}

}

/*
 
No C a diferença é que se for só a variável, é por valor, se for &variável, é por referência

No java todo tipo básico é por valor(byte, short, int, long, float,double, char, boolean)
No java todo objeto é sempre por referência

*/
