import java.util.Scanner;

public class PesquisaSocioeconomicaPopulacao {
	public static void main(String[] args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner (System.in);
		
		double rendaFamiliar = 0;
		int quantidadePessoasFamilia = 0;
		
		double rendaFamiliarPorCabeca = 0;
		
		double quantidadeDePessoasNaClasseA = 0;
		double quantidadeDePessoasNaClasseB = 0;
		double quantidadeDePessoasNaClasseC = 0;
		double quantidadeDePessoasNaClasseD = 0;
		double quantidadeDePessoasNaClasseE = 0;
		
		double quantidadeTotalDePessoasDaPopulacao = 0;
		
		double percentualDePessoasNaClasseA = 0;
		double percentualDePessoasNaClasseB = 0;
		double percentualDePessoasNaClasseC = 0;
		double percentualDePessoasNaClasseD = 0;
		double percentualDePessoasNaClasseE = 0;
		
		
		// Entrada de Dados
		do {
			System.out.print("Informa a renda familiar: ");
			rendaFamiliar = leitor.nextDouble();
			
			System.out.print("Informe quantidades de pessoas: ");
			quantidadePessoasFamilia = leitor.nextInt();
			
			rendaFamiliarPorCabeca = (rendaFamiliar / quantidadePessoasFamilia);
			
			if (rendaFamiliarPorCabeca < 600) {
				quantidadeDePessoasNaClasseE += quantidadePessoasFamilia;
			}else if (rendaFamiliarPorCabeca < 2000) {
				quantidadeDePessoasNaClasseD += quantidadePessoasFamilia;
			}else if (rendaFamiliarPorCabeca < 5000) {
				quantidadeDePessoasNaClasseC += quantidadePessoasFamilia;
			}else if (rendaFamiliarPorCabeca < 10000) {
				quantidadeDePessoasNaClasseB += quantidadePessoasFamilia;
			}else {
				quantidadeDePessoasNaClasseA += quantidadePessoasFamilia;
			}
			
			quantidadeTotalDePessoasDaPopulacao += quantidadePessoasFamilia;
			
			System.out.print("Digite <S> se houver mais famílias: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		
		// Processamento
		percentualDePessoasNaClasseA = (100 * quantidadeDePessoasNaClasseA / quantidadeTotalDePessoasDaPopulacao);
		percentualDePessoasNaClasseA = (100 * quantidadeDePessoasNaClasseB / quantidadeTotalDePessoasDaPopulacao);
		percentualDePessoasNaClasseA = (100 * quantidadeDePessoasNaClasseC / quantidadeTotalDePessoasDaPopulacao);
		percentualDePessoasNaClasseA = (100 * quantidadeDePessoasNaClasseD / quantidadeTotalDePessoasDaPopulacao);
		percentualDePessoasNaClasseA = (100 * quantidadeDePessoasNaClasseE / quantidadeTotalDePessoasDaPopulacao);
		
		// Saída de dados
		System.out.println("O percentual de pessoas na classe A é: " + percentualDePessoasNaClasseA);
		System.out.println("O percentual de pessoas na classe B é: " + percentualDePessoasNaClasseB);
		System.out.println("O percentual de pessoas na classe C é: " + percentualDePessoasNaClasseC);
		System.out.println("O percentual de pessoas na classe D é: " + percentualDePessoasNaClasseD);
		System.out.println("O percentual de pessoas na classe E é: " + percentualDePessoasNaClasseE);
	}

}
