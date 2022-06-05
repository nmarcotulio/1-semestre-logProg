import java.util.Scanner;

public class CalculoAzulejosPiscina {
	public static void main (String args[]) {	
	// Declara��o de vari�veis
	Scanner leitor = new Scanner(System.in);
	
	double comprimentoPiscina = 0;
	double larguraPiscina = 0;
	double profundidadePiscina = 0;
	double areaPiscina = 0;
	
	double tamanhoAzulejo = 0;
	double areaAzulejo = 0;
	
	double quantidadeAzulejos = 0;
	
	// Entrada de dados
	System.out.print("Digite o comprimento da piscina: ");
	comprimentoPiscina = leitor.nextDouble();
	
	System.out.print("Digite a largura da piscina: ");
	larguraPiscina = leitor.nextDouble();
	
	System.out.print("Digite a profundidade da piscina: ");
	profundidadePiscina = leitor.nextDouble();
	
	System.out.print("Digite o tamanho do azulejo: ");
	tamanhoAzulejo = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento 
	areaPiscina = (2 * (comprimentoPiscina * profundidadePiscina) + 
	               2 * (larguraPiscina * profundidadePiscina) +
	                   (comprimentoPiscina * larguraPiscina));
	
	areaAzulejo = (Math.pow(tamanhoAzulejo, 2));
	
	quantidadeAzulejos = (areaPiscina / areaAzulejo);
	
	// Sa�da de dados
	System.out.println("A quantidade de Azulejos necess�rias para revistir a piscina � igual a: " + quantidadeAzulejos);
	
	
	
	}
}
