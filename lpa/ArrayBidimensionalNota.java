
public class ArrayBidimensionalNota {

	public static void main(String[] args) {
		imprimir(obterArrayBid());

	}
	public static String[][] obterArrayBid() {
		String[][] arrayBid = new String[3][2];
		arrayBid[0][0] = "Joao";
		arrayBid[1][0] = "4,7";
		arrayBid[2][0] = "REPR";
		arrayBid[0][1] = "Maria";
		arrayBid[1][1] = "6,8";
		arrayBid[2][1] = "APROV";
		
		return arrayBid;
	}
	public static void imprimir(String[][] array) {
		System.out.println("\n");
		System.out.println("  -----------------");

		for(int i = 0; i < array.length; i++) {
			System.out.print(" | ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print((i == 1 ? " " :  "") + array[i][j] + " ");
				System.out.print(i == 1 && j == 1 ? "  | " : " | "); // i comanda as linhas e j as colunas ?
			}
			System.out.println();
		}
		System.out.println("  -----------------");

	}
}
