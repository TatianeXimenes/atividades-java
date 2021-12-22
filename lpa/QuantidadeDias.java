
public class QuantidadeDias {

	public static void main(String[] args) {
		//Usando como para exemplo o inicio do ano de 1970
		int anoBi = 366, ano = 365, anoInicial = 1970, num1 = 0, num2 = 0, qtdDias;

		do {
			if (anoInicial % 4 == 0 && anoInicial % 100 != 0 || anoInicial % 400 == 0) {
				num1++;
			} else {
				num2++;
			}
			anoInicial ++;
		} while (anoInicial <= 2019);

		qtdDias = num1 * anoBi + num2 * ano;
		System.out.println("Número todal de dias é " + qtdDias);
	}
}
