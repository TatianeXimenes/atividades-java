
public class strings {

	public static void main(String[] args) {
		obterDados();
	}

	public static void obterDados() {
		String nome = "Tatiane Ximenes de Oliveira Gabriel";
		imprimir(nome + "\n\n");
		palavraPorLinha(nome);
		imprimir("\n\n");
		vertical(nome);
		imprimir("\n\n");
		diagonal(nome);
		imprimir("\n\n");
		inverso(nome);
	}
	public static void imprimir(String txt) {
		System.out.print(txt);
	}
	public static void palavraPorLinha(String nome) {
		imprimir(" ");
		for (int var = 0; var < nome.length(); var++) {
			if(nome.substring(var, var+1).equals(" ")) {
				imprimir("\n");
			}
			imprimir(nome.substring(var, var + 1));
			// compara 0 com 1, se tiver espaço pula linha, se nao junta. 1 com 2...
		}
		/*String linha1 = nome.substring(0,7);
		String linha2 = nome.substring(8,15);
		String linha3 = nome.substring(16,27);
		String linha4 = nome.substring(28,35);
		imprimir(nome);*/
	}
	public static void vertical(String nome) {
		for (int var = 0; var < nome.length(); var++) {
			imprimir (nome.substring(var, var + 1) + "\n");
		}
	}
	public static void diagonal(String nome) {
		String espaco = " ";
		for (int var = 0; var < nome.length(); var++) {
			imprimir(espaco + nome.substring(var, var + 1) + "\n");
			espaco += " ";
		}

	}
	public static void inverso(String nome) {
		for (int var = nome.length(); var > 0 ; var--) {
			imprimir(nome.substring(var - 1, var)); 
		}
	}
}
