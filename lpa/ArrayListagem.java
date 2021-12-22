
public class arrayListagem {

	public static void main(String[] args) {
		imprimir(obterValores1());
		imprimir("\n\n");
		imprimir(obterValores2());
	}
	
	/*OBJETIVO: criar um array unidimensional capaz de armazenar 07 
	 * valores inteiros, positivos e retornar o resultado
	 * (vetor preenchido) para quem executou o método.*/
	public static int[] obterValores1() {
		int[] valor = {18,17,16,29,15};
		return valor;
	}
	
	
	/*OBJETIVO: criar um array unidimensional capaz de armazenar 07 
	 * valores inteiros, positivos e retornar o resultado
	 * (vetor preenchido) para quem executou o método.*/
	public static int[] obterValores2() {
		int[] valores = new int[5];
		valores[3] = 18;
		valores[1] = 29;
		valores[0] = 2;
		valores[2] = 16;
		valores[4] = 89;
		return valores;
	}
	
	public static void imprimir(int[] valores) {
		for(int i = 0; i< valores.length; i++) {
			System.out.println(valores[i]);
		}
	}
	
	public static void imprimir(int valor) {
		System.out.println(valor); //faz parte do obterV1
	}
	
	public static void imprimir(String msg) {
		System.out.println(msg); 
	}
}
