import java.util.Scanner;

public class mediaEscolar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome;
		double nota1, nota2, nota3;
		
		System.out.println("Nome e sobrenome: ");
		nome = input.nextLine();
		System.out.println("Informe a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.println("Informe a terceira nota: ");
		nota3 = input.nextDouble();
		
		System.out.println("A média de " +nome+ " é: " +((nota1+nota2+nota3)/3));
	}
}
