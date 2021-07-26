import java.util.Scanner;

public class diasNoMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as três primeiras letras do mês, Ex: Jan, Fev, Mar... ");
		String mes = sc.next().toUpperCase();
		System.out.println("Informe o ano desejado: ");
		int ano = sc.nextInt();
		
		switch (mes) {
		case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":
			System.out.println("O mes " + mes + " possui 31 dias. ");
			break;
		case "ABR": case "JUN": case "SET": case "NOV":
			System.out.println("O mes " + mes + " possui 30 dias.");
			break;
		case "FEV":
			if ((ano % 4 == 0) && (ano % 100 != 0)) {
	            System.out.println("O mes " + mes + " possui 29 dias. ");
	        } else {
	            System.out.println("O mes " + mes + " possui 28 dias. ");
	        }
			break;
	    default:
	    	System.out.println("O valor informado não corresponde a nenhum mês válido.");
	    	break;
	        }

	}

}
