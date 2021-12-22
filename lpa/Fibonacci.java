
public class fibonacci {

	public static void main(String[] args) {
		int aValor = 0, pValor = 1;
		while (aValor <= 1000) {
			System.out.print(aValor + " ");
			pValor = pValor + aValor;
			aValor = pValor - aValor;
		}
	}
}
