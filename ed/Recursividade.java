
import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, soma;
		System.out.println("Informe um número: ");
		numero =sc.nextInt();

		soma = somaNumeros(numero);
		System.out.println("O valor da soma de 0 - " +numero+ " é: " +soma);
		//ex: 5 = 1+2+3+4+5 = 15
		
	}

	private static int somaNumeros(int numero) {
		if (numero <= 1) {
			return numero;
		} else {
			return numero + somaNumeros(numero - 1);
		}
		
	}

}
