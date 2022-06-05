import java.math.BigInteger;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		// Declaração de Variáveis
		BigInteger anterior = new BigInteger("0");
		BigInteger atual = new BigInteger("0");
		BigInteger proximo = new BigInteger("0");
		
		// Processamento
		anterior = new BigInteger("0");
		atual = new BigInteger("1");
		
		while (proximo.compareTo(new BigInteger("99999999999999")) < 0) {
			proximo = anterior.add(atual);
			
			System.out.println(atual);
			
			anterior = new BigInteger(atual.toString());
			atual =  new BigInteger(proximo.toString());
		}
		
	}

}
