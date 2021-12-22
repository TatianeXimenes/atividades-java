import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da temperatura inicial: ");
		double temp = sc.nextDouble(),
				celsius = ((temp - 32) * 5) / 9,
				kelvin = temp + 273,
				fahreinheit = ((temp * 9) / 5) + 32;
		System.out.println("Deseja converter para qual temperatura: (1) Celsius, (2) Kelvin ou (3) Fahreinheit? ");
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			System.out.println(celsius);
		} else if (escolha == 2) {
			System.out.println(kelvin);
		} else {
			System.out.println(fahreinheit);
		}
	}
}
