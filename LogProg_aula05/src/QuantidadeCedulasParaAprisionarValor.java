import java.util.Scanner;

public class QuantidadeCedulasParaAprisionarValor {
		public static void main (String args[]) {
			// Declaração de Variáveis
			Scanner leitor = new Scanner (System.in);
			
			int qtdMoeda1 = 0;
			int qtdNota2 = 0;
			int qtdNota5 = 0;
			int qtdNota10 = 0;
			int qtdNota20 = 0;
			int qtdNota50 = 0;
			int qtdNota100 = 0;
			int qtdNota200 = 0;
			
			int valor = 0;
			
			//  Entrada de dados
			System.out.print("Digite o valor que deseja sacar: ");
			valor = leitor.nextInt();
			
			leitor.close();
			
			// Processamento
			qtdNota200 = (valor / 200);
			valor = (valor % 200);
			
			qtdNota100 = (valor / 100);
			valor = (valor % 100);
			
			qtdNota50 = (valor / 50);
			valor = (valor % 50);
			
			qtdNota20 = (valor / 20);
			valor = (valor % 20);
			
			qtdNota10 = (valor / 10);
			valor = (valor % 10);
			
			qtdNota5 = (valor / 5);
			valor = (valor % 5);
			
			qtdNota2 = (valor / 2);
			valor = (valor % 2);
			
			qtdMoeda1 = (valor);
		
			
			// Saída de dados
			if (qtdNota200 >0) {
				System.out.println(qtdNota200 + " nota" + (qtdNota200 == 1 ? "" : "s") + " de R$ 200,00");
			}
			
			if (qtdNota100 > 0) {
				System.out.println(qtdNota100 + " nota" + (qtdNota100 == 1 ? "" : "s") + " de R$ 100,00");
			
			}
			
			if (qtdNota50 >0) {
				System.out.println(qtdNota50 + " nota" + (qtdNota50 == 1 ? "" : "s") + " de R$ 50,00");
			}
			
			if (qtdNota20 >0) {
				System.out.println(qtdNota20 + " nota" + (qtdNota20 == 1 ? "" : "s") + " de R$ 20,00");
				
			}
			
			if (qtdNota10 >0) {
				System.out.println(qtdNota10 + " nota" + (qtdNota10 == 1 ? "" : "s") + " de R$ 10,00");
			}
			
			if (qtdNota5 >0) {
				System.out.println(qtdNota5 + " nota" + (qtdNota5 == 1 ? "" : "s") + " de R$ 5,00");
			}
			
			if (qtdNota2 >0) {
				System.out.println(qtdNota2 + " nota" + (qtdNota2 == 1 ? "" : "s") + " de R$ 2,00");
			}
			
			if (qtdMoeda1 >0) {
				System.out.println("1 moeda de R$ 1,00");
			}
			

		}

}
