package br.ucsal.aula05;

public class MatriculaMain {

	public static void main(String[] args) {
		ListaMatricula lista = new ListaMatricula(249,"Dmitry Rocha", "Publicidade");

        lista.adicionar(334,"Carlos Pinho", "Engenharia de Software");
        lista.adicionar(002,"Osvaldo","Computação");
        //lista.adicionar(132,"Ricardo Oliveira","Engenharia de Software");
        //lista.adicionar(134,"Ricardo Oliveira","Análise de Sistemas");
        //lista.adicionar(136,"Racardo Bastos","Engenharia de Software");
        //lista.adicionar(139,"Rabardo Bastos","Engenharia de Software");

        lista.listar();

        System.out.println("Removendo uma pessoa\n");
        lista.remover();
        lista.listar();

        System.out.println("O nome Osvaldo está na lista? "+lista.pesquisar("Osvaldo"));
        System.out.println("O nome Tatiana está na lista? "+lista.pesquisar("Tatiana"));
        System.out.println("_____________________________________");

        System.out.println("Colocando os nomes em ordem alfabetica:\n");
        lista.alfabetica();
        lista.listar();

	}

}
