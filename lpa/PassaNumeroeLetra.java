package passaNumeroeLetra;

import java.util.Scanner;

public class PassaNumeroeLetra {

	public static void main(String[] args) {

		String texto = "";

		String letras = "";
		String numeros = "";

		char caractere;
		int ascii = 0;

		String senha = "abc123";
		String login = "astrobigogildo";

		String senhaInputada = "";
		String loginInputado = "";

		char x;
		boolean checkSenha = false;
		boolean checkLogin = false;
		boolean check = false;

		Scanner scanner = new Scanner(System.in);

		while (check == false) {
			System.out.print("Digite seu login \n");
			loginInputado = scanner.next();
			System.out.print("Digite sua senha \n");
			senhaInputada = scanner.next();

			if (senhaInputada.equals(senha)) {
				checkSenha = true;
			}

			if (loginInputado.equals(login)) {
				checkLogin = true;
			}

			if (checkLogin == true && checkSenha == true) {
				System.out.println("login aprovado. \n");
				check = true;
			} else {
				System.out.println("credenciais incorretas. tentes novamente. \n");

			}
		}

		System.out.println("digite um texto \n");
		texto = scanner.next();

		scanner.close();

		for (int i = 0; i < texto.length(); i++) {
			caractere = texto.charAt(i);
			ascii = (int) caractere;

			if (ascii >= 65 && ascii <= 90) {
				x = (char) ascii;
				letras = letras + x;
			}

			if (ascii >= 97 && ascii <= 122) {
				x = (char) ascii;
				letras = letras + x;
			}

			if (ascii >= 48 && ascii <= 57) {
				x = (char) ascii;
				numeros = numeros + x;
			}
		}

		System.out.println("so as letras : " + letras + "\n");
		System.out.println("so os numeros : " + numeros + "\n");

	}

}
