import java.util.Scanner;

public class TestaListaShow {

	public static void main(String[] args) {
		ListaEncadeadaShow show = new ListaEncadeadaShow();
		
		TestaListaShow testa = new TestaListaShow();
		testa.adicionarShow(show);
		System.out.println("Os shows foram adicionados.");

	}
	
	private void adicionarShow(ListaEncadeadaShow show) {
		CelulaShow show1 = new CelulaShow("Caetano Veloso");
		CelulaShow show2 = new CelulaShow("Jorge Versillo");
		CelulaShow show3 = new CelulaShow("");
		
		show.adicionar(show1);
		show.adicionar(show2);
		show.adicionar(show3);
		
	}

}
