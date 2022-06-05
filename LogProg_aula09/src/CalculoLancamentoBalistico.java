import java.util.Scanner;

public class CalculoLancamentoBalistico {
	private static final double GRAVIDADE = 9.807;
	
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double angulo = 0;
		double velocidade = 0;
		
		double tempoTotal = 0;
		double distanciaFinal = 0;
		double distanciaTempoATempo = 0;
		
		// Entrada de dados
		System.out.print("Informe o �ngulo de lan�amento: ");
		angulo = leitor.nextDouble();
		
		System.out.print("Informe a velociodade de lan�amento: ");
		velocidade = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento 
		angulo = ((Math.PI * angulo) / 180);
		
		tempoTotal = (( 2* velocidade * Math.sin(angulo)) / GRAVIDADE);
		
		distanciaFinal = ((Math.pow(velocidade,  2) * Math.sin(2 * angulo)) / GRAVIDADE);
		
		// Sa�da de dados
		for (int i = 0 ; i < tempoTotal ; i++) {
			System.out.println("No instante " + i + " segundos, o proj�til estar� em " + distanciaTempoATempo + " metros");
			
		}
		System.out.println("O proj�til para no instante " + tempoTotal + " segundos");
		System.out.println("O proj�til para a " + distanciaFinal + " metros do lan�amento");
		
		
		
	}

}
