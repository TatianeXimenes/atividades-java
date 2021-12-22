import java.util.Scanner;

public class Peso_ideal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		double altura;
		String sexo;
		double pesoIdeal;
		
		System.out.print("Informe seu nome: ");
		nome = input.next();
		System.out.print("Qual sua altura? ");
		altura = input.nextDouble();
		System.out.print("Qual seu sexo? ");
		sexo = input.next().toUpperCase();
		
		if (sexo.equals("FEMININO")) {
			pesoIdeal = (62.1*altura)-44.7;
			System.out.println("Seu peso ideal é: " +pesoIdeal);
		} else {
			pesoIdeal = (72.7*altura)-58;
			System.out.println("Seu peso ideal é: " +pesoIdeal);
		}


	}

}
