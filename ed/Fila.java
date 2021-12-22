
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//criando fila de números
		Queue<Integer> fila = new LinkedList<Integer>();
		
		//verificando se está nula
		if(fila.isEmpty()) {
			System.out.println("Precisa adicionar elementos");
		}
		
		//adicionando elementos
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		fila.add(6);
		fila.add(7);
		fila.add(8);
		fila.add(9);
		fila.add(10);
		
		//verificando, novamente, se está nula
		if(fila.isEmpty()) {
			System.out.println("Ué, se adicionamos elementos e ela está vazia, voce deve ter errado em algo.");
		} else {
			System.out.println("Opa... os elementos foram adicionados na fila de boa.");
		}
		
		//se tem elementos, vamos verificar sua quantidade
		if (fila.size() > 0) {
			System.out.println("A sua fila tem " + fila.size() + " elementos.");
		}
		
		System.out.println("O primeiro elemento da fila é: " + fila.peek());
		
		System.out.println("Removendo elemento " + fila.remove());
		
		System.out.println("O primeiro elemento da fila é: " + fila.peek());
			
		//Imprimir todos os elementos da fila
		System.out.println("Na sua fila tem os seguintes elementos: ");
		//usando iterador para auxiliar
		Iterator<Integer> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//pesquisando determinado elemento, ex:8
		if(fila.contains(8)) {
			System.out.println("O elemento que você procura existe na fila. Ele é o " + fila.contains(8));
		} else {
			System.out.println("O elemento não existe.");
		}
		
		fila.add(11);
		fila.add(20);
		
		Iterator<Integer> it2 = fila.iterator();
		System.out.println("Após as inserções, sua fila ficou com os elementos: ");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
