import java.util.Scanner;

public class DeterminacaoTipoDePoligonoEPerimetroEArea {
	public static void main (String args[]) {
		//Declara��o de Variaveis 
		Scanner leitor = new Scanner (System.in);
		
		int qtdLados = 0;
		
		double tamLado = 0;
		
		double perimetro = 0;
		double area = 0;
		
		//Entrada de dados
		System.out.print(("informe a quantidade de lados do pol�gono: "));
		qtdLados = leitor.nextInt();
		
		System.out.print("Informe o tamanho do lado");
		tamLado = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		switch (qtdLados) {
		case 3:
			perimetro = (3 * tamLado);
			area = ((Math.pow(tamLado, 2) * Math.sqrt(3)) / 4);
			
			break;
		case 4:
			perimetro = (4 * tamLado);
			area = (Math.pow(tamLado, 2));
			
			break;
		case 5:
			perimetro = (5 * tamLado);
			area = ((5 * Math.pow(tamLado, 2)) / (4 * Math.tan(36)));
			
			break;
		case 6:
		 	perimetro = (6 * tamLado);
			area = ((3 * Math.pow(tamLado, 2) * Math.sqrt(3)) / 2);
			
			break;
		case 7:
			perimetro = (7* tamLado);
			area = ((7 / 4) * Math.pow(tamLado, 2) * (1 / Math.tan(51.4285714)));
			
			break;
		default:
			System.out.println("Meu amigo, s� sei calcular pol�gonos entre 3 a 7 lados. Tenta de novo!!");
			
			break;
		}
		
		// Sa�da de dados
		System.out.println("O per�metro do pol�gono �: " + perimetro);
		System.out.println("A �rea do pol�gono �: " + area);
		
			
		
		}
		
		
		
		
		
	}


