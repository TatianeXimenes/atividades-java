
import java.util.Stack;

public class AulaPilha {

	public static void main(String[] args) {
		Stack<String> minhaPilha = new Stack<String>();
		
		System.out.println("A pulha esta vazia? " +minhaPilha.empty());
		if (!minhaPilha.empty()) {
			System.out.println("A sua pilha não ta vazia");
		} else {
			System.out.println("A sua pilha está vazia, insira elementos. ");
		}
		
		System.out.println("\nImplementando a pilha");
		//inserindo valores
		minhaPilha.push("Candido --> 6:59");
		minhaPilha.push("Caio Victor --> 7:01");
		minhaPilha.push("Rondinelle --> 7:02");
		minhaPilha.push("Gabriela --> 7:02");
		
		//outras formas de inserir:
		minhaPilha.add("Tatiane --> 7:03");
		minhaPilha.addElement("Bruno --> 7:04");
		
		
		if (!minhaPilha.empty()) {
			System.out.println("A sua pilha não ta vazia.");
		} else {
			System.out.println("A sua pilha está vazia, insira elementos. ");
		}
		
		//Verificar qtd dos elementos
		System.out.println("A sua pilha tem " + minhaPilha.size() + " itens. ");
		
		//Quem é o topo
		System.out.println("O aluno que está no topo é: " + minhaPilha.peek());
		
		//Remover um elemento
		System.out.println("\nVamos remover: " + minhaPilha.pop());
		
		//Quem é o topo
		System.out.println("O aluno que está no topo é: " + minhaPilha.peek());
		
		//Imprimir
		//System.out.println(minhaPilha);
		System.out.println();
		while(!minhaPilha.empty()) {
			System.out.println(minhaPilha.peek());
			minhaPilha.pop();
		}
	}

}

