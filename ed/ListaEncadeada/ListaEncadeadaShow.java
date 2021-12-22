
public class ListaEncadeadaShow {

	private CelulaShow primeiro;
	private CelulaShow ultimo;
	private CelulaShow posicaoAtual;
	
	public void adicionar(CelulaShow valor) {
		CelulaShow celula = new CelulaShow(null);
		celula.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}
	
	public void remover() {
		if (primeiro.getProximo() != null) {
			CelulaShow celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}
	
	public CelulaShow recuperarPenultimo(CelulaShow celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	public CelulaShow size() {
		return size();
	}
	
	public boolean taVazia() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public CelulaShow clean() {
		return clean();
	}
	
	public void listar(CelulaShow nome) {
		CelulaShow aux = nome.getProximo();
		while(aux != null) {
			System.out.println(aux.getNome());
			aux = aux.getProximo();
		}
	}
	
}
