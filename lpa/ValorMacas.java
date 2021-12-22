import java.util.Scanner;

public class ValorMacas {

	public static void main(String[] args) {
			double unidMaca = 1.30;
			int duziaMaca = 12;
			int qtd;
			int calc;
			double calc2;
			double soma;

			Scanner sc = new Scanner(System.in);
			System.out.println("Quantas maças deseja?");
			qtd = sc.nextInt();
			
			if(qtd < 12) {
				soma = qtd*unidMaca;
				System.out.println("O valor total das maças é de: " +soma);
			} else {
				calc = qtd / 12;
				System.out.println(calc);
				calc = calc *duziaMaca;
				System.out.println(calc);
				calc2 = qtd % 12;
				System.out.println(calc2);
				calc2 = calc2 * unidMaca;
				System.out.println(calc2);
				System.out.println("O valor total das maças é de:" + (calc+calc2));
			}

	}

}
