import java.util.Scanner;

public class NumeroMaiorMenor {

	public static void main(String[] args) {
		NumeroMaiorMenor numero = new NumeroMaiorMenor();
		
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
	static void exibirInf(NumeroMaiorMenor numero) {
		if (numero.num1 == numero.num2) {
			System.out.println("Os números são iguals.");
		}	
	}
	static void exibirMaior(NumeroMaiorMenor numero) {
		if (numero.num1 > numero.num2) {
			System.out.println(numero.num1+ " É o maior valor.");
		} else {
			System.out.println(numero.num2+ " É o maior valor.");
		} 
	}

	static void exibirMenor(NumeroMaiorMenor numero) {
		if (numero.num1 < numero.num2) {
			System.out.println(numero.num1+ " É o menor valor.");
		} else {
			System.out.println(numero.num2+ " É o menor valor.");
		}
	}
}
