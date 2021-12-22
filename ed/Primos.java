
public class Primos {

	public static void main(String[] args) {
		//Verificando quais sao os números primos de 1-100
		out: for (int i = 1; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) continue out;
            }
            System.out.println("The number: " + i + " is prime");
        }

	}

}
