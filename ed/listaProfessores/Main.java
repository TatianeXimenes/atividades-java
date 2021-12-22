package br.ucsal.aula04;

public class Main {

	public static void main(String[] args) {
		 ListaProfessores lista1 = new ListaProfessores();

	        lista1.adicionar("Angela");
	        lista1.adicionar("Osvaldo");
	        lista1.adicionar("Neiva");
	        lista1.adicionar("Mario");

	        lista1.listar();
	        System.out.println("\nVamos remover 1");
	        lista1.remover();
	        lista1.listar();
	        System.out.println("O tamanho da lista é de: "+lista1.verificarTamanho());

	        System.out.println("\nA lista está vazia? "+lista1.estaVazia());
	        lista1.apagarLista();
	        System.out.println("\nA lista está vazia? "+lista1.estaVazia());
	}
}
