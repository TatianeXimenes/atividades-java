package br.ucsal;

import java.util.Scanner;

public class progressaoAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 10, limite, qtdElementos = 0,
				qtdNumPares = 0, qtdNumImpares = 0, 
				qtdNumImparesDiv3 = 0, somaTotal = 0;
		double mediaA = 0, mediaP = 0;
		final int RAZAO = 6, PESO1 = 4, PESO2 = 6;
		
		do {
			System.out.print("Informe o valor limite da PA: ");
			limite = sc.nextInt();
		} while (limite < 50 || limite > 100);
		
		System.out.println("\nValor limite informado pelo usuario......" + limite);
		
		System.out.println("\nApresentação da sequencia -> ");
		
		do {
			System.out.print(valor + " ");
			somaTotal += valor;
			qtdElementos++;
			if (qtdElementos == 1) {
				mediaA = valor;
			}
			if (valor % 2 == 0) {
				qtdNumPares++;
			} else {
				qtdNumImpares++;
				if (valor % 3 == 0) {
					qtdNumImparesDiv3++;
				}
			}
			if(qtdElementos == 4) {
				mediaP = valor * PESO1;
			}	
			if (qtdElementos == 10) {
				mediaP += valor * PESO2;
				mediaP = mediaP / (PESO1 + PESO2);
			}
			valor += RAZAO;
		} while(valor <= limite);
		
		if (qtdElementos < 10) {
			mediaP = 0;
		}
		
		mediaA += (valor-RAZAO);
		mediaA /= 2;
		
		System.out.println("\nQuantidade de elementos da sequencia: " + qtdElementos);
		System.out.println("Média aritmética do primeiro e último valor da sequencia: " + mediaA);
		System.out.println("Quantidade de números pares existentes na sequencia: " + qtdNumPares);
		System.out.println("Quantidade de números ímpares existentes na sequencia: " + qtdNumImpares);
		System.out.println("Quantidade de números ímpares divisíveis por 3 existentes na sequencia: " + qtdNumImparesDiv3);
		System.out.println("Soma de todos os elementos da sequencia: " + somaTotal);
		System.out.println("Média ponderada do 13º e do 21º numero da sequencia, considerando os pesos 4 e 6 respectivamente."
				+ "\n OBS: Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado. Resultado: "
				+ (mediaP == 0 ? "Não foi possivel calcular" : mediaP));
	}
}
