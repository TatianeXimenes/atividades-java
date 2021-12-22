
public class ListaProfessores {

	Node inicio;
    int tamanho;

    public ListaProfessores () {
        inicio = new Node();
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(String nome) {
        Node novoNode = new Node();
        novoNode.nome = nome;
        if(inicio == null) {
            inicio = novoNode;
            tamanho++;
        } else {
            Node aux = inicio;
            while(aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = novoNode;
            tamanho++;
        }
    }
    
    public void remover() {
        if(inicio == null) {
            System.out.println("A lista está vazia!");
        } else {
            inicio = inicio.prox;
            tamanho--;
        }
    }

    public int verificarTamanho() {
        return tamanho;
    }
    
    public boolean estaVazia() {
        if(inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apagarLista() {
        inicio = null;
    }

    public void listar() {
        if(inicio == null) {
            System.out.println("A lista está vazia");
        } else {
            Node aux = inicio;
            while (aux != null) {
                System.out.print(aux.nome+" - ");
                aux = aux.prox;
            }
        }
    }
}
