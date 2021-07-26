
public class numeros {

	public static void main(String[] args) {
		
		// Exibir números de 0 - 100
		System.out.println("Questão 7: ");
		for (int i = 0; i <= 100; i++) {
			System.out.print(i+ " ");
		}

		// Exibir apenas numeros pares, de 0 - 50
		System.out.println("Questão 8: ");
		for (int i = 0; i <= 50; i++) {
			if(i % 2 == 0) {
				System.out.print(i+ " ");
			}
		}
		
		// Exibir apenas numeros imapres, de 0 - 50
		System.out.println("Questão 9: ");
		for (int i = 0; i <= 50; i++) {
			if(i % 2 != 0) {
				System.out.print(i+ " ");
			}
		}
		
		//Exibir números primos entre 100 primeiros números.
		System.out.println("Questão 10: ");
		int n = 100;
		for(int i = 2; i <= n; i++) {
			int flag = 1;
		for(int j = 2; j <= i/2; j++) {
			if(i % j == 0) {
				flag = 0;
				break;
			}
		}
		if(flag==1) {
			System.out.print(i+" ");
		}
		}

	}

}
