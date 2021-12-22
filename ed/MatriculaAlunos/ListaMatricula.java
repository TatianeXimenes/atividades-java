
public class ListaMatricula {

	Node inicio;
    String linhas = "__________________________";
    int tamanho = 0;

    public ListaMatricula(int matricula, String nome, String curso) {
        inicio = new Node();
        inicio.nome = nome;
        inicio.matricula = matricula;
        inicio.curso = curso;
        tamanho = 1;
    }
    
    public void adicionar(int matricula, String nome, String curso) {
        Node novoNo = new Node();
        novoNo.matricula = matricula;
        novoNo.nome = nome;
        novoNo.curso = curso;
        if(inicio == null) {
            System.out.println("A lista não existe ainda!");
        } else {
            Node aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoNo;
            tamanho++;
        }
    }
    
    public void remover() {
        if(inicio == null) {
            System.out.println("A lista não existe!");
        } else {
            inicio = inicio.proximo;
            tamanho--;
        }
    }

    public boolean pesquisar(String nome) {
        if(inicio == null) {
            System.out.println("A lista não existe!");
        } else {
            Node aux = inicio;
            while (aux != null) {
                if(aux.nome.equals(nome)) {
                    return true;
                }
                aux = aux.proximo;
            }
        }
        return false;
    }
    
    public void listar() {
        if(inicio == null) {
            System.out.println("A lista está vazia!");
        } else {
            Node aux = inicio;
            while (aux != null) {
                System.out.println("Nome: "+aux.nome+"\nMatrícula: "+aux.matricula+"\nCurso: "+aux.curso);
                System.out.println(linhas);
                aux = aux.proximo;
            }
        }
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public void alfabetica() {
        int charat = 0;
        for(int i = 0; i < getTamanho(); i++) {
            Node atual = inicio;
            Node segundo = inicio.proximo;
            for (int j = 0; j < getTamanho()-1; j++) {
                //Enquanto as letras forem iguais e os nomes forem diferentes, a repetição tentará a próxima
                while((atual.nome.charAt(charat) == segundo.nome.charAt(charat)) && !atual.nome.equals(segundo.nome)) {
                    charat++;
                }

                if(atual.nome.charAt(charat) > segundo.nome.charAt(charat)) {
                    //criamos variáveis para o que está em atual
                    int mat = atual.matricula;
                    String nome = atual.nome;;
                    String curso = atual.curso;

                    //colocamos em atual as variáveis de segundo
                    atual.matricula = segundo.matricula;
                    atual.nome = segundo.nome;;
                    atual.curso = segundo.curso;

                    //colocamos em segundo as variáveis de atual
                    segundo.matricula = mat;
                    segundo.nome = nome;
                    segundo.curso = curso;

                }
                atual = segundo;
                segundo = segundo.proximo;
             
                charat = 0;
            }
        }
    }
}
