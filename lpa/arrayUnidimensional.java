package br.ucsal;

public class arrayUnidimensional {

	public static void main(String[] args) {
	//Criação de array unidimensional com sequencia aritmética de 20 valores inteiros iniciado com 3 tendo a razao o valor 5
		final int TAM = 20, PRIM_VALOR = 3, RAZAO = 5;
		int[] temp = obterVetorSeqArit(TAM, PRIM_VALOR, RAZAO);
		imprimir(temp);
		imprimir("\n\n");
		imprimir(obterSomaVetor(temp));
		imprimir("\n\n");
		int tp = obterQtdPares(temp);
		imprimir(tp);
		imprimir("\n\n");
		imprimir(obterVetorPar(temp,tp));
		imprimir("\n\n");
		imprimir(obterVetorDesc(temp));
	}
	//o vetor criado dinamicamente com a sequencia elaborada
	public static int[] obterVetorSeqArit(int tam, int valorInicial, int razao) {
		int[] vetor = new int[tam];
		for (int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				vetor[i] = valorInicial;
			} else {
				vetor[i] = vetor[i-1] + razao;
			}
		}				
		return vetor;
	}
	//a soma de todos os elementos do item
	public static int obterSomaVetor(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}
	//o vetor criado dinamicamente com os elementos pares elaborado com o retorno do item
	public static int obterQtdPares(int[] vetor) {
		int qtde = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				qtde++;	
			}
		}
		return qtde;
	}

	// o vetor criado dinamicamente com os elementos pares elaborado com o retorno do item
	public static int[] obterVetorPar(int[] vetor, int tamanho) {
		int[] vetorPar = new int[tamanho];
		for(int i = 0, ip = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				vetorPar[ip] = vetor[i];
				ip++;
			}
		}
		return vetorPar;
	}
	//o vetor criado dinamicamente com a sequencia decrescente elaborado com o retorno do item
	public static int[] obterVetorDesc(int[] vetor) {
		int[] vetord = new int[vetor.length];
		for (int i = vetor.length - 1, id = 0; i > 0; i--, id++) {
			vetor[id] = vetor[i];
		}
		return vetord;
	}
	
	//a impressão de todos as informações solicitadas nos itens deverão ser feitas utilizando métodos "imprimir" específicos
	public static void imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	public static void imprimir(String txt) {
		System.out.print(txt);
	}
	public static void imprimir(int vlr) {
		System.out.print(vlr);
	}
}
