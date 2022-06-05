import java.util.Scanner;

public class CalculoLancamentoBalistico {
	private static final double GRAVIDADE = 9.807;
	
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double angulo = 0;
		double velocidade = 0;
		
		double tempoTotal = 0;
		double distanciaFinal = 0;
		double distanciaTempoATempo = 0;
		
		// Entrada de dados
		System.out.print("Informe o ângulo de lançamento: ");
		angulo = leitor.nextDouble();
		
		System.out.print("Informe a velociodade de lançamento: ");
		velocidade = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento 
		angulo = ((Math.PI * angulo) / 180);
		
		tempoTotal = (( 2* velocidade * Math.sin(angulo)) / GRAVIDADE);
		
		distanciaFinal = ((Math.pow(velocidade,  2) * Math.sin(2 * angulo)) / GRAVIDADE);
		
		// Saída de dados
		for (int i = 0 ; i < tempoTotal ; i++) {
			System.out.println("No instante " + i + " segundos, o projétil estará em " + distanciaTempoATempo + " metros");
			
		}
		System.out.println("O projétil para no instante " + tempoTotal + " segundos");
		System.out.println("O projétil para a " + distanciaFinal + " metros do lançamento");
		
		
		
	}

}
