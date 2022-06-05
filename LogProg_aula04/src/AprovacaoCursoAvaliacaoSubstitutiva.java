import java.util.Scanner;

public class AprovacaoCursoAvaliacaoSubstitutiva {
	public static void main(String args[]) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double prova1 = 0;
		double prova2 = 0;
		double prova3 = 0;
		
		double media = 0;
		
		double provaRecu = 0;
		
		// Entrada de Dados
		System.out.print("Informe seu resultado na primeira avaliação: ");
		prova1 = leitor.nextDouble();
		
		System.out.print("Informe seu resultado na segunda avaliação: ");
		prova2 = leitor.nextDouble();
		
		System.out.print("Informe seu resultado na terceira avaliação: ");
		prova3 = leitor.nextDouble();
		
		// Processamento
		media = (prova1 + prova2 + prova3) / 3;
		
		// Saída de Dados
		if (media >= 5) {
			System.out.println("Passou de ano caralhoo: " + media);
		}else {
			System.out.println("Informe o valor da prova de recuperação: ");
		    provaRecu = leitor.nextDouble();
		    
		    if (provaRecu >= 5) {
		    	System.out.println("Passou na coragem, irmão!");
		    }else {
		    	System.out.println("Se lascou!");
		    }
		}
		
		leitor.close();
				
	}

}
