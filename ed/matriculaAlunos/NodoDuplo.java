package br.ucsal.aula05;

public class NodoDuplo {

	int valor;
    NodoDuplo proximo;
    NodoDuplo anterior;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NodoDuplo proximo) {
        this.proximo = proximo;
    }

    public NodoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDuplo anterior) {
        this.anterior = anterior;
    }
}
