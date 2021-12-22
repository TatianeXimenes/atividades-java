
public class UnidimensionalXbidimensional {

	public static void main(String[] args) {
		int linha = 5, coluna = 6;
		int[][] aux = obterArrayBid(linha, coluna);
		imprimir(aux);
		imprimir("\n\n");
		imprimirFormatada(obterArrayBid(linha, coluna));
		imprimir("\n\n");
		imprimir(obterArrayUni(aux));
	}
	public static int[] obterArrayUni(int[][] array) {
		//preenchendo com todos os elementos do array bidimensional
		int[] arrayUni = new int[array.length * array[0].length];
		for(int i = 0, h = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++, h++) {
				arrayUni[h] = array[i][j];
			}
		}
		return arrayUni;
	}
	public static String preencherComZero(int valor) {
		//preenchendo a esquerda dos valores com zero, para que todos os valores 
		//tenham a mesma quantidade de elementos
		String res = "";
		int qtdElementos = (valor + "").length(), max = 6;
		max -= qtdElementos;
		for (int i = 0; i < max; i++) {
			res += "0";
		}
			res += valor;
		return res;
	}
	public static int[][] obterArrayBid(int l, int c) {
		//array bidimensional 5 x 6 com a sequencia fibonacci (inicio 0, 1)
		int[][] arrayBid = new int[l][c];
		for(int i = 0, prn = 0, sen = 1, aux; i < arrayBid.length; i++) {
			for (int j = 0; j < arrayBid[i].length; j++) {
				arrayBid[i][j] = prn; // prn = primeiro numero
				aux = prn + sen;
				prn = sen; // sen = segundo numero
				sen = aux;
			}
		}
		return arrayBid;
	}
	
	public static void imprimir(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void imprimirFormatada(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(preencherComZero(array[i][j]) + " ");
			}
			System.out.println();
		}
	}
	
	public static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void imprimir(String txt) {
		System.out.println(txt);
	}
}
