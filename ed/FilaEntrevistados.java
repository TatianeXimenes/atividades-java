
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FIlaEntrevistados {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> filaEntrevista = new LinkedList<String>();
		int escolha;
		
		do {
			System.out.println("1 - Inserir entrevistado");
	        System.out.println("2 - Próximo entrevistado");
	        System.out.println("3 - Sair");
	        escolha = sc.nextInt();
	        
	        if(escolha < 1 || escolha > 3) {
	        	System.out.println("Você escolheu uma opção inválida.");
	        } else if(escolha == 1) {
	        	System.out.println("Informe seu nome:");
	        	filaEntrevista.add(sc.next());
	        	 //sc.next();
	            System.out.println("Informe seu telefone de contado: ");
	            filaEntrevista.add(sc.next());
	        } else if(escolha == 2) {
	        	filaEntrevista.remove();
	        	filaEntrevista.remove();
	        	System.out.println("O próximo(a) a ser entrevistado será: " + filaEntrevista.peek());
	        	filaEntrevista.remove();
	        	System.out.println("Número de telefone: " + filaEntrevista.peek());
	        } 
		} while (escolha != 3);
	}
	
}
