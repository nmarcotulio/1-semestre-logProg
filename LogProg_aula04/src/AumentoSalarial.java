import java.util.Scanner;

public class AumentoSalarial {
	public static void main(String args[]) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		int cargo = 0;
		
		// Entrada de Dados
		System.out.print("Informe o sal�rio: ");
		salario = leitor.nextDouble();
		
		System.out.print("Digite <1> para funcion�rio, <2> para gerente ou <3> para dono: ");
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
				System.out.println("Ai n�o amig�o");
				break;
		}
		
		// Sa�da de dados
		System.out.println("O novo sal�rio �: " + salario);
		
		 
		
	}

}
