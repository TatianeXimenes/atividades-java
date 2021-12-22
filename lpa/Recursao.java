
public class Recursao {
/*fatorial de 5 
5! = 5 x 4 x 3 x 2 x 1			5! = 5 x 4!
4! = 4 x 3 x 2 x 1				4! = 4 x 3!
3! = 3 x 2 x 1					3! = 3 x 2!
2! = 2 x 1						2! = 2 x 1!
1! = 1 (caso base)
*/
	public static void main(String[] args) {
		imprimir(fatorial(5));
	}
	public static int fatorial(int vlr) {
		int res;
		if(vlr == 0 || vlr == 1) {
			res = 1;
		} else {
			res = vlr * fatorial(vlr - 1);
		}
		return res;
	}
	
	public static void imprimir(int var) {
		System.out.println(var);
	}
	public static void imprimir(String var) {
		System.out.println(var);
	}

}
