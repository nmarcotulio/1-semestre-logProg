import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FilaPilha {
	public static void main(String[] args) {
		// Declaração de Variáveis
		int opcao = 0;
		int[] fila = new int[10];
		int[] pilha = new int[10];
		int qtdElementosFila = 0;
		int qtdElementosPilha = 0;
		
		do {
		// Entrada de dados
		opcao = selecionarMenuOpcoes();
		
		// Processamento
		
			switch (opcao) {
			case 1:	// Inserir elemento na fila
				qtdElementosFila = inserirElemento(fila, qtdElementosFila);
				break;
			case 2:	// Remover elemento na fila
				qtdElementosFila = removerElementosFila(fila, qtdElementosFila);
				break;
			case 3:	// Mostrar a fila
				mostrarFila(fila, qtdElementosFila);
				break;
			case 4:	// Inserir elemento na pilha
				qtdElementosPilha = inserirElemento(pilha, qtdElementosPilha);
				break;
			case 5:	// Remover elemento da pilha
				qtdElementosPilha = removerElementoPilha(pilha, qtdElementosPilha);
				break;
			case 6:	// Mostrar a fila
				mostrarPilha(pilha, qtdElementosPilha);
				break;
			}
		} while (opcao != 7);
	}
	
	private static int selecionarMenuOpcoes() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = 0;
		
		try {
			System.out.println("+===============================");
			System.out.println("|         Menu de Opções        ");
			System.out.println("+===============================");
			System.out.println("| 1 - Insetir elemento na fila |");
			System.out.println("| 2 - Remover elemento na fila |");
			System.out.println("| 3 - Mostrar a fila           |");
			System.out.println("| 4 - Insetir elemento na pilha|");
			System.out.println("| 5 - Insetir elemento da pilha|");
			System.out.println("| 6 - Mostrar a pilha          |");
			System.out.println("| 7 - Sair                     |");
			System.out.println("+===============================");
			System.out.println("Digite a opção selecionada: ");
			retorno = Integer.parseInt(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		return retorno;
	}

	private static int inserirElemento(int [] fila, int qtdElementosFila) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = qtdElementosFila;
	
		try {
			if (qtdElementosFila == 0) {
				System.out.println("Amigão, a fila estorou o tamanho! Tente novamente mais tarde!");
			} else {
				System.out.println("Digite o elemento: ");
				fila[qtdElementosFila] = Integer.parseInt(leitor.readLine());
				retorno++;
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		return retorno;
	}
	
	private static int removerElementosFila(int [] fila, int qtdElementosFila) {
		int retorno = qtdElementosFila;
		
		if(qtdElementosFila == 0) {
			System.out.println("Amigão, a fila está vazia! Como vai retirar alguma coisa de lugar nenhum?");
		} else {
			System.out.println("Elemento removido da fila: " + fila[0]);
			for (int i = 0 ; i < (qtdElementosFila - 1) ; i++) {
				fila[i] = fila[i + 1];
			}
			retorno--;
		}
		
		return retorno;
	}
	
	private static void mostrarFila(int [] fila, int qtdElementosFila) {
		for (int i = 0 ; i < qtdElementosFila ; i++) {
			System.out.println(fila[i] + "\t");
		}
		System.out.println("");
	}
	
	private static int removerElementoPilha(int[] pilha, int qtdElementosPilha) {
		int retorno = qtdElementosPilha;
		
		if (qtdElementosPilha == 0) {
			System.out.println("Amigão, a pilha está vazia!");
		} else {
			System.out.println("Elemento removido da pilha: " + pilha[qtdElementosPilha - 1]);
			retorno--;
		}
		
		return retorno;
	}
	
	private static void mostrarPilha(int[] pilha, int qtdElementosPilha) {
		for (int i = 0 ; i < qtdElementosPilha ; i++) {
			System.out.println(pilha[1]);
		}
	}
}
/*
 Fila: (FIFO first-in, first-out) (o primeiro que chega é o primeiro a ser atendido) (FCFS first come, first served)
 horizontal que tem um começo e um fim, todo mundo entra pelo lado do fim, e todo mundo sai pelo lado do começo
 		
 Pilha: (FILO first-in, last-out) (o primeior que chega é o ultimo a ser atendido (os últimos serão os primeiros)
 vertical que tem apenas uma porta, todo mundo entra e sai por essa mesma porta
 */
