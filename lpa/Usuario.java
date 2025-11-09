package app.modelos.prescritivos;

public class Usuario {
	
	//Attributes
	private String id;
	private String senha;
	private Boolean aprovado;
	
	//constructor
	public Usuario(String id, String senha) {
		this.id = id;
		this.senha = senha;
		this.aprovado = false;
	}
	
	//methods
	
	//o metodo login compara ids e senha
	//e se bater, retorna true para o atributo "aprovado" e um sysout com uma mensagem de aprovação.
	//se não bater, retorna false e mensagem de reprovação.
	void login(String idLogin,String senhaLogin ){
		if (idLogin == id && senhaLogin == senha) {
			System.out.println("login aprovado");
			this.aprovado = true;
		}else {
			System.out.println("login reprovado");
			this.aprovado = false;
		}
	}
}
