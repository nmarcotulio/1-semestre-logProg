import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculoDigitoVerificadoCPF {
	public static void main(String[] args) {
		// Declaração de varáiveis
		String cpf = "";
		boolean sucesso = true;
		
		// Entrada de dados
		cpf = lerCPF();
		
		// Processamento
		sucesso = validarCPF(cpf);
		
		// Saída de dados
		if(sucesso) {
			System.out.println("Parabéns, o CPF está correto!");
		} else {
			System.out.println("Esse CPF é inválido!");
		}
	}
	
	///////////////////////////////
	// Função lerCPF
	///////////////////////////////
	// Função que le o número do CPF
	// do teclado criticando o tamanho
	// e o fato de só haver números
	////////////////////////////////////
	// Parâmetros: vazio
	////////////////////////////////////
	// Retorno: String com o cpf
	////////////////////////////////////
	private static String lerCPF() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		do {
			try {
				System.out.print("Digite o CPF: ");
				retorno = leitor.readLine();
				Long.parseLong(retorno);
			} catch (Exception erro) {
				retorno = "";
			}
		} while (retorno.length() != 11);
		
		return retorno;
	}
	
	/////////////////////////////////
	// Função validar CPF
	//////////////////////////////////
	// Função que valida o número do 
	// CPF calculando os dois DVs
	///////////////////////////////////
	// Parâmetros: String com o cpf
	////////////////////////////////////
	// Retorno: boolean true ou false
	/////////////////////////////
	
	private static boolean validarCPF(String cpf) {
		boolean retorno = false;
		int dv1 = 0;
		int dv2 = 0;
		
		for (int i = 0 ; i < 9 ; i++) {
			dv1 += (Integer.parseInt(cpf.substring(i, i+1)) * (10 - i));
		}
		dv1 = (dv1 % 11);
		dv1 = 11 - dv1;
		if (dv1 >= 10) {
			dv1 = 0;
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			dv2 += (Integer.parseInt(cpf.substring(i, i+1)) * (11 - i));
		}
		dv2 = (dv2 % 11);
		dv2 = 11 - dv2;
		if (dv2 >= 10) {
			dv2 = 0;
		}
		
		retorno = ((dv1 == Integer.parseInt(cpf.substring(9, 10)))) &&
					(dv2 == Integer.parseInt(cpf.substring(10)));	
		
		return retorno;
	}
}
