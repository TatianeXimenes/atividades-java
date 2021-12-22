import java.util.Scanner;

public class estoque {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String produto;
		int qtdMinima, qtdMaxima;
		double estoqueMedio;
	
		System.out.print("Qual nome do produto desejado? ");
		produto = input.next();
		System.out.print("Qual a quantidade minima? ");
		qtdMinima = input.nextInt();
		System.out.print("Qual a quantidade máxima? ");
		qtdMaxima = input.nextInt();
		
		System.out.println("O estoque médio é de " +((qtdMinima+qtdMaxima)/2)+ " do próduto: " +produto);


	}

}
