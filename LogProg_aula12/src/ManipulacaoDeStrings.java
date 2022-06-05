import java.util.Scanner;

public class ManipulacaoDeStrings {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		String texto = "";
		
		String stringASerRemovida = "";
		
		String stringASerProcurada = "";
		
		int contagemDeOcorrenciasDaStringProcurada = 0;
		
		int indiceEncontradoDaStringProcurada = -1;
		
		// Entrada de dados
		System.out.print("Digite um texto qualquer: ");
		texto = leitor.nextLine();
		
		System.out.print("Digite alguma coisa para ser removida do texto: ");
		stringASerRemovida = leitor.nextLine();
		
		System.out.print("Digite o texto que deseja ser procurado: ");
		stringASerProcurada = leitor.nextLine();
		
		leitor.close();
		
		// Saída de dados
		System.out.println("Primeira letra da String: " + texto.charAt(0)); 
			// chartArt devolve o caractere da posição indicadaa.
		System.out.println("Última letra da String: " + texto.charAt(texto.length() - 1));
		System.out.println("Tamanho da String: " + texto.length()); 
			// length deevolve o tamanho da String
		
		System.out.println("Tudo Maiscúlo:" + texto.toUpperCase());
		System.out.println("Tudo minúsculo: " + texto.toLowerCase());
		
		System.out.println("Texto original com a coisa que deve ser removida: " + texto.replace(stringASerRemovida, ""));
			// replace substitui um subtexto por outro subtexto dentro da String original
		
		// Contagem de Ocorrências de Determinada String
		do {
			indiceEncontradoDaStringProcurada = texto.indexOf(stringASerProcurada, indiceEncontradoDaStringProcurada + 1);
			if (indiceEncontradoDaStringProcurada >= 0) {
				contagemDeOcorrenciasDaStringProcurada++;
			}
		} while (indiceEncontradoDaStringProcurada >= 0);
		System.out.println("Quantidade de ocorrências: " + contagemDeOcorrenciasDaStringProcurada);
		
		
		
	}

}
