import java.util.Scanner;

public class ClassificacaoPeso {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe seu peso em quilograma e sua altura em metros");
			double peso = sc.nextDouble(), altura = sc.nextDouble(), calc = peso / (altura * altura);
			System.out.println("Qual a sua idade? ");
			int idade = sc.nextInt(), chave;
			
			if (idade >= 18 && calc < 17) {
				chave = 1;
			} else if (idade >= 18 && calc >= 17 && calc <= 18.49) {
				chave = 2;
			} else if (idade >= 18 && calc >= 18.5 && calc <= 24.99) {
				chave = 3;
			} else if (idade >= 18 && calc >= 25 && calc <= 29.99) {
				chave = 4;
			} else if (idade >= 18 && calc >= 30 && calc <= 34.99) {
				chave = 5;
			} else if (idade >= 18 && calc >= 35 && calc <= 39.99) {
				chave = 6;
			} else if (idade >= 18 && calc >40) {
				chave = 7;
			} else if (idade == 1) {
				chave = 8;
			} else if (idade == 2) {
				chave = 9;
			} else if (idade == 3) {
				chave = 10;
			} else if (idade == 4) {
				chave = 11;
			} else if (idade == 5) {
				chave = 12;
			} else if (idade == 6) {
				chave = 13;
			} else if (idade == 7) {
				chave = 14;
			} else if (idade == 8) {
				chave = 15;
			} else if (idade == 9) {
				chave = 16;
			} else if (idade == 10) {
				chave = 17;
			} else if (idade == 11) {
				chave = 18;
			} else if (idade == 12) {
				chave = 19;
			} else if (idade == 13) {
				chave = 20;
			} else if (idade == 14) {
				chave = 21;
			} else {
				chave = 22;
			}
			
			switch (chave) {
			case 1:
				System.out.println("Muito abaixo do peso");
				break;
			case 2:
				System.out.println("Abaixo do peso");
				break;
			case 3:
				System.out.println("Peso normal");
				break;
			case 4:
				System.out.println("Acima do peso");
				break;
			case 5:
				System.out.println("Obesidade I");
				break;
			case 6:
				System.out.println("Obesidade II (severa)");
				break;
			case 7:
				System.out.println("Obesidade III (mórbida)");
				break;
			case 8:
				if (peso <= 6.3) {
					System.out.println("Normal");
				} else if (peso >= 6.3 && peso <= 7.2) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 9:
				if (peso <= 8.6) {
					System.out.println("Normal");
				} else if (peso >= 8.6 && peso <= 9.8) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 10:
				if (peso <= 10.6) {
					System.out.println("Normal");
				} else if (peso >= 10.6 && peso <= 11.6) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 11:
				if (peso <= 12.6) {
					System.out.println("Normal");
				} else if (peso >= 12.6 && peso <= 15.0) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 12:
				if (peso <= 15.6) {
					System.out.println("Normal");
				} else if (peso >= 12.6 && peso <= 16.3) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 13:
				if (peso <= 16.6) {
					System.out.println("Normal");
				} else if (peso >= 16.6 && peso <= 18.0) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 14:
				if (peso <= 17.3) {
					System.out.println("Normal");
				} else if (peso >= 17.3 && peso <= 19.1) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 15:
				if (peso <= 18.7) {
					System.out.println("Normal");
				} else if (peso >= 18.7 && peso <= 20.3) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 16:
				if (peso <= 18.8) {
					System.out.println("Normal");
				} else if (peso >= 18.8 && peso <= 21.4) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 17:
				if (peso <= 19.6) {
					System.out.println("Normal");
				} else if (peso >= 19.6 && peso <= 22.5) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 18:
				if (peso <= 20.3) {
					System.out.println("Normal");
				} else if (peso >= 20.3 && peso <= 23.7) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 19:
				if (peso <= 21.1) {
					System.out.println("Normal");
				} else if (peso >= 21.1 && peso <= 24.8) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 20:
				if (peso <= 21.9) {
					System.out.println("Normal");
				} else if (peso >= 21.9 && peso <= 25.9) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 21:
				if (peso <= 22.7) {
					System.out.println("Normal");
				} else if (peso >= 22.7 && peso <= 26.9) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			case 22:
				if (peso <= 23.6) {
					System.out.println("Normal");
				} else if (peso >= 23.6 && peso <= 27.7) {
					System.out.println("Sobrepeso");
				} else {
					System.out.println("Obesidade");
				}
				break;
			default:
				break;
			}
	}
}
