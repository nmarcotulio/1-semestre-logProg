import java.util.Scanner;

public class AumentoSalarial {
	public static void main(String args[]) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		int cargo = 0;
		
		// Entrada de Dados
		System.out.print("Informe o salário: ");
		salario = leitor.nextDouble();
		
		System.out.print("Digite <1> para funcionário, <2> para gerente ou <3> para dono: ");
		cargo = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		switch (cargo) {
			case 1:
				salario = (salario * 1.1);
				break;
			case 2:
				salario = (salario * 1.3);
				break;
			case 3:
				salario = (salario * 1.5);
				break;
			default:
				System.out.println("Ai não amigão");
				break;
		}
		
		// Saída de dados
		System.out.println("O novo salário é: " + salario);
		
		 
		
	}

}
