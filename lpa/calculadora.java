import java.util.Scanner;

public class calculadora {

	private int num1;
	private int num2;
	public static void main(String[] args) {
		calculadora numero = new calculadora();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero.num1 = input.nextInt();
		System.out.print("Digite um número inteiro: ");
		numero.num2 = input.nextInt();

		System.out.println("Que operação deseja realizar: "
				+ "somar, multiplicar, subtrair ou dividir?");
		String opcao = input.next().toUpperCase();
		
		switch (opcao) {
		case "SOMAR":
			System.out.println("A soma entre os números é: " +(numero.num1+numero.num2));
			break;
		case "SUBTRAIR":
			System.out.println("A subtração entre os números é: " +(numero.num1-numero.num2));
			break;
		case "MULTIPLICAR":
			System.out.println("A multiplicação entre os números é: " +(numero.num1*numero.num2));
			break;
		case "DIVIDIR":
			System.out.println("A divisão entre os números é: " +(numero.num1/numero.num2));
			break;
		default:
			System.out.println("Desculpa, não entendi o que quis dizer.");
		}

	}

}
