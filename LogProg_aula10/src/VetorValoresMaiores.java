
public class VetorValoresMaiores {
	public static void main(String[] args) {
		// Declara��o de Vari�veis
		Scanner leitor = new Scanner (System.in);
		
		int[] vetorOriginal = new int[10];
		int[] vetorValoresMaiores = new int[10];
		
		int tamanhoVetorValoresMaiores = 0;
		
		int valorLimite = 0;
		
		// Proce
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			if (vetorOriginal[i] > valorLimite) {
				vetorValoresMaiores[tamanhoVetorValoresMaiores] = vetorOriginal[i];
				tamanhoVetorValoresMaiores++;
			}
		}
		
		
	}
	

}
