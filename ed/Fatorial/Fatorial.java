
public class Fatorial {

	int numero;
	
	//construtor
	public Fatorial (int numero) {
		this.numero = numero;
	}
	
	//método recursivo, para calcular fatorial
	public static int fatorial(int numero) {
		if (numero == 0) 
			return 1; //lembrete: fatorial de 0 é 1
		else 
			return numero * (fatorial(numero-1)); 
	}
}
