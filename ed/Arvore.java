
import java.util.Scanner;

public class Arvore {
	
	private static class ARVORE {
		public int numero;
		public ARVORE direita, esquerda;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//instanciar uma arvore vazia, se esta vazia a raiz é nula
		ARVORE raiz = null;
		int opcao, numero, achou;
		
		do {
			System.out.println("Construindo árvore binária");
			System.out.println("1- Preencher a árvore");
			System.out.println("2- Imprimir os pares");
			System.out.println("3- Imprimir os impares");
			System.out.println("4- Imprimir os primos");
			System.out.println("5- Consultar toda a árvore em ordem");
			System.out.println("6- Limpar a árvore");
			System.out.println("7- Sair do programa");
			
			System.out.println("\nEscolha sua opcao: ");
			opcao = entrada.nextInt();
			
			if(opcao <1 || opcao >6) {
				System.out.println("Você escolheu uma opção inválida.");
			} else if (opcao == 1) {
				raiz = null;
				for (int i = 0; i <= 10; i++) {
					System.out.println("Informe um nº a ser inserido: ");
					numero = entrada.nextInt();
					raiz = inserir(raiz, numero);
				}
				System.out.println("\nPronto, você preencheu a árvore com números");
			}  else if (opcao == 2) {
				if (raiz == null) {
					System.out.println("Arvore está vázia.");
				} else {
					achou = 0;
					achou = consultarPares(raiz, achou);
					if (achou == 0) {
						System.out.println("Visitei todos os nós e não encontrei número par.");
					}
				}
				
			} else if (opcao == 3) {
				if (raiz == null) {
					System.out.println("Arvore está vázia.");
				} else {
					achou = 0;
					achou = consultarImpares(raiz, achou);
					if (achou == 0) {
						System.out.println("Visitei todos os nós e não encontrei número par.");
					}
				}
			} else if (opcao == 4) {
				if (raiz == null) {
					System.out.println("Arvore está vázia.");
				} else {
					achou = 0;
					achou = consultarPrimos(raiz, achou);
					if (achou == 0) {
						System.out.println("Visitei todos os nós e não encontrei número primo.");
					}
				}
			} else if (opcao == 5) {
				if(raiz == null) {
					System.out.println("Sua árvore está vázia");
				} else {
					System.out.println("Os elementos da árvore são:");
					consultarEmOrdem(raiz);
				}
				
			} else if(opcao == 6) {
				System.out.println("Ainda falta limpar a árvore :(");
			}
			
		} while (opcao != 7);
	}
		
		public static ARVORE inserir(ARVORE aux, int num) {
			//verificar se arvore passada por parametro é null
			if(aux == null) {
				aux = new ARVORE();
				aux.numero = num;
				aux.esquerda = null;
				aux.direita = null;
			} else if (num < aux.numero) {
				//criar uma recursividade
				aux.esquerda = inserir(aux.esquerda, num);
			} else {
				aux.direita = inserir(aux.direita, num);
			}
			return aux;
		}
		
		public static int consultarPares(ARVORE aux, int achou) {
			if (aux != null) {
				if(aux.numero % 2 == 0) {
					System.out.println("Os nº são:" + aux.numero + "");
					achou = 1;
				}
				//aplicando a recursividade
				achou = consultarPares(aux.esquerda, achou);
				achou = consultarPares(aux.direita, achou);				
			} 
			
			return achou;
		}
		
		public static int consultarImpares(ARVORE aux, int achou) {
			if(aux != null) {
				if(aux.numero % 2 != 0) {
					System.out.println("Os nº são: " + aux.numero + "");
					achou = 1;
				}
				achou = consultarImpares(aux.esquerda, achou);
				achou = consultarImpares(aux.direita, achou);
			}
			return achou;
		}
		
		public static int consultarPrimos(ARVORE aux, int achou) {
			if(aux != null) {
				if (aux.numero % 2 != 0 && aux.numero % 3 != 0){
					System.out.println("Os nº são: " + aux.numero + "");
					achou = 1; 
				} if (aux.numero == 2 || aux.numero == 3) {
					System.out.println("Os nº são: " + aux.numero + "");
					achou = 1;
				}
				achou = consultarPrimos(aux.esquerda, achou);
				achou = consultarPrimos(aux.direita, achou);
			}
			return achou;
			
		}
		
		public static void consultarEmOrdem (ARVORE aux) {
			if (aux != null) {
				consultarEmOrdem(aux.esquerda);
				System.out.println(aux.numero);
				consultarEmOrdem(aux.direita);				
			}
		}
	}
