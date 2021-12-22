import java.util.Scanner;

public class ConversorMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor e sua moeda (1) dolar, (2)real. ");
		double valor = sc.nextDouble();
		int moeda = sc.nextInt(), chave = 0;
		
		if (moeda == 1) {
			chave = 1;
		} else if (moeda == 2) {
			chave = 2;
		} else {
			System.out.println("Chave informada inválida.");
		}
		
		System.out.println("Para qual moeda deseja converter? (1) euro, (2) dolar, (3)real, (4)quiate, (5) riel, (6) bitcoin");
		int conv = sc.nextInt();
		double euro = 5.50, dolar = 5.10, real = 1.00, quiate = 7.00, riel = 4.70, bitcoin = 2.20;
		
		switch (chave) {
		case 1:
			if (conv == 1) {
				valor = (dolar / euro) * valor;
				System.out.println(valor);
			} else if (conv == 3) {
				valor = (dolar / real) * valor;
				System.out.println(valor);
			} else if (conv == 4) {
				valor = (dolar / quiate )* valor;
				System.out.println(valor);
			} else if (conv == 5) {
				valor = (dolar / riel) * valor;
				System.out.println(valor);
			} else if (conv == 6) {
				valor = (dolar / bitcoin) * valor;
				System.out.println(valor);
			} else {
				System.out.println("Opa, não temos a conversão desta moeda ainda.");
			}
			break;
		case 2: 
			if (conv == 1) {
				valor = valor / euro;
				System.out.println(valor);
			} else if (conv == 2) {
				valor = valor / dolar;
				System.out.println(valor);
			} else if (conv == 4) {
				valor = valor / quiate;
				System.out.println(valor);
			} else if (conv == 5) {
				valor = valor / riel;
				System.out.println(valor);
			} else  if (conv == 6) {
				valor = valor / bitcoin;
				System.out.println(valor);
			} else {
				System.out.println("Opa, não temos a conversão desta moeda ainda. ");
			}
			break;
		default:
			break;
		}

	}

}
