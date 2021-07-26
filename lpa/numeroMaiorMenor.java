import java.util.Scanner;
public class numeroMaiorMenor {

	public static void main(String[] args) {
		numeroMaiorMenor numero = new numeroMaiorMenor();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero.num1 = input.nextInt();
		System.out.print("Digite um número inteiro: ");
		numero.num2 = input.nextInt();
		
		exibirInf(numero);
		exibirMaior(numero);
		exibirMenor(numero);

	}
	
	private int num1;
	private int num2;
	static void exibirInf(numeroMaiorMenor numero) {
		if (numero.num1 == numero.num2) {
			System.out.println("Os números são iguals.");
		}	
	}
	static void exibirMaior(numeroMaiorMenor numero) {
		if (numero.num1 > numero.num2) {
			System.out.println(numero.num1+ " É o maior valor.");
		} else {
			System.out.println(numero.num2+ " É o maior valor.");
		} 
	}

	static void exibirMenor(numeroMaiorMenor numero) {
		if (numero.num1 < numero.num2) {
			System.out.println(numero.num1+ " É o menor valor.");
		} else {
			System.out.println(numero.num2+ " É o menor valor.");
		}
	}
}
