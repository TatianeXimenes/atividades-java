
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DesafioFilaAlunos {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("João");
		fila.add("Catarina");
		fila.add("Marcia");
		fila.add("Felipe");
		fila.add("Monique");
		
		if (fila.size() > 0) {
			System.out.println("A sua fila tem " + fila.size() + " alunos.");
		}
		

		System.out.println("O primeiro aluno da fila é: " + fila.peek());
		

		System.out.println("Removendo aluno: " + fila.remove());
		
		System.out.println();
		System.out.println("Listando os alunos que restaram: ");
		//Listando os alunos
		Iterator<String> aux = fila.iterator();
		while(aux.hasNext()) {
			System.out.println(aux.next());
		}
		
		
	}
}
