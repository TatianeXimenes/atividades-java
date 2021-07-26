
public class arrayBidimensional {

	public static void main(String[] args) {
		imprimir(montarArrayBidim());
		imprimir(montarArrayBidim());
	}
	
	public static int[] montarArryUnidim() {
		int[] arrUni = new int[5];
		arrUni[3] = 8;
		arrUni[0] = 7;
		return arrUni;
	}
	
	public static int[][] montarArrayBidim() {
		int[][] arrBid = new int[3][5];
		arrBid[0][0] = 2;
		arrBid[1][3] = 9;
		return arrBid;
	}
	
	public static void imprimir(int[] arr) {
		System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void imprimir(int[][] arr) {
		System.out.println("\n");
		System.out.println("-----------------------");

		for(int i = 0; i < arr.length; i++) {
			System.out.print(" | ");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " | ");
			}
			System.out.println();
		}
	}
}