import java.util.Scanner;

public class TabuadaPersonalizada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada desejada: ");
		double numero = sc.nextDouble();
		boolean valido = false;
			System.out.println("Informe a equação desejada: (1)adição, (2)subtraçao, (3)multiplicação e (4)divisão. ");
			double equacao = sc.nextDouble();
		
		int numInicial, numFinal;
		boolean invalido = false;
				do {
			System.out.println("Começar por: ");
			numInicial = sc.nextInt();
			System.out.println("Terminar em: ");
			numFinal = sc.nextInt();
			
			if (numInicial < numFinal) {
				invalido = true;
			}
		} while(!invalido);
		
		System.out.println("Montando a tabuada de " +numero+ ", começando em " +numInicial+ " e terminando em " +numFinal+ ": ");
		if (equacao == 1) {
			for(int i = numInicial; i <= numFinal; i++) {
				System.out.println(numero+ " + " +i+ " = " +(numero+i));
			}
		}else if(equacao == 2) {
			for(int i = numInicial; i <= numFinal; i++) {
				System.out.println(numero+ " - " +i+ " = " +(numero-i));
			}
		}else if(equacao == 3) {
		for(int i = numInicial; i <= numFinal; i++) {
			System.out.println(numero+ " * " +i+ " = " +(numero*i));
			}	
		}else if(equacao == 4) {
			for(int i = numInicial; i <= numFinal; i++) {
				System.out.printf(numero+ " / " +i+ " = %.2f %n" +(numero/i));
			}
		}
	}
}
