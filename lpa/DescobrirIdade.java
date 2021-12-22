import java.util.Scanner;

public class descobrirIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia, mês e ano do seu nascimento: ");
		int dia_nasc = sc.nextInt(),
				mes_nasc = sc.nextInt(),
				ano_nasc = sc.nextInt();
		System.out.println("Informe tambemo dia, mês e ano de hoje: ");
		int dia_atual = sc.nextInt(),
				mes_atual = sc.nextInt(),
				ano_atual = sc.nextInt(),
				idade = ano_atual - ano_nasc;
		
		if (mes_atual < mes_nasc || mes_atual == mes_nasc && dia_atual < dia_nasc) {
			idade--;
			System.out.println(idade);
		} else {
			System.out.println(idade);
		}
	}
}
