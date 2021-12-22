package br.ucsal;

import java.util.Scanner;

public class vetorNotas {

	public static void main(String[] args) {
        double[] unidade1 = obternotas();
        impressao(unidade1);
        unidade1 = obterUnidade1(unidade1);
        System.out.println(" ");
        System.out.println("As notas da unidade 1, com seus respectivos pesos são ");
        impressao(unidade1);
        double[] unidade2 = obternotas();
        unidade2 = obterUnidade2(unidade2);
        System.out.println(" ");
        System.out.println("As notas da unidade 2, com seus respectivos pesos são ");
        impressao(unidade2);
        double notaFinal = mediaPonderada(unidade1, unidade2);
        System.out.println(" ");
        aprovadoOuNao(notaFinal);

	}
	public static double[] obternotas(){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double nota1 = -1;
        double nota2 = -1;
        double nota3 = -1;
        System.out.println("Favor informar as notas que você tirou nesta unidade:");
        while((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Qual a primeira nota? ");
            nota1 = sc.nextDouble();
            System.out.println("Qual a segunda nota?");
            nota2 = sc.nextDouble();
            System.out.println("Qual a terceita nota?");
            nota3 = sc.nextDouble();
            if((nota1 < 0 || nota1 > 10) || (nota2<0 || nota2 > 10) || (nota3<0 || nota3 > 10)) {
                System.out.println("Números inválidos, tente novamente");
            }

        }
        //Povoamos o vetor com as três notas e retornamos o vetor de double
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        return notas;

    }
	
	public static double[] obterUnidade1 (double[] notasInformadas) {
		//vetor contendo 03 notas informadas pelo usuário ponderadas em 2, 3 e 5
		//aqui multiplicamos cada nota informada por seu respectivo peso, povoamos o vetor e devolvemos
        double[] unidade1 = notasInformadas;
        double nota1 = (notasInformadas[0]*2);
        double nota2 = (notasInformadas[1]*3);
        double nota3 = (notasInformadas[2]*5);
        unidade1[0] = nota1;
        unidade1[1] = nota2;
        unidade1[2] = nota3;

        return unidade1;
    }
	
	 public static double[] obterUnidade2 (double[] notasInformadas) {
		 //vetor contendo 03 notas informadas pelo usuário ponderadas em 2, 4 e 4
	     //aqui multiplicamos cada nota informada por seu respectivo peso, povoamos o vetor e devolvemos
	     double[] unidade2 = notasInformadas;
	     double nota1 = (notasInformadas[0]*2);
	     double nota2 = (notasInformadas[1]*4);
	     double nota3 = (notasInformadas[2]*4);
	     unidade2[0] = nota1;
	     unidade2[1] = nota2;
	     unidade2[2] = nota3;

	     return unidade2;
	  }
	 
	 public static double mediaPonderada(double[] unidade1, double[] unidade2) {
		 //aqui usamos o somatório para receber todas as notas do semestre e depois dividir pelo somatório dos pesos
	     double somatorio = 0;
	     for (int i = 0; i < unidade1.length; i++) {
	         somatorio += unidade1[i];
	     }
	     somatorio = somatorio/10;
	     for (int i = 0; i < unidade2.length; i++) {
	         somatorio += unidade2[i];
	     }
	     somatorio = somatorio/10;
	     //no fim retornamos a média ponderada
	     return somatorio;

	  }
	 
	 public static void aprovadoOuNao (double media) {
	     //método apenas recebe a nota e usa um if para saber se o aluno passou
	     System.out.println("Sua média final foi "+media);
	     if (media > 6) {
	         System.out.println("Você foi aprovado");
	     } else {
	         System.out.println("Você foi reprovado");
	     }
	  }

	    public static void impressao(double[] notas) {
	    	//Usa-se um for para percorrer o vetor e imprimir o que tem dentro
	        for (int i = 0; i < notas.length; i++) {
	            System.out.print(notas[i]+" ");
	        }
	    }
	/*public static void imprimir(double vlr) {
		System.out.println(vlr);
	}
	public static void imprimir(String txt) {
		System.out.print(txt);
	}*/

}

