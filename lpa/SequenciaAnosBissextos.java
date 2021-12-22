
public class SequenciaAnosBissextos {

	public static void main(String[] args) {
		//Saber os anos que foram bissextos a partir de 1950.
		int ano = 1950;
		while (ano <= 2020) {
			if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
				System.out.print(ano + " ");
			}
			
			ano++;
		}

	}

}
