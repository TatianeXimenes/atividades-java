
public class EstruturaProfessor implements TadProfessorInterface {

	private int codigo;
	private String nomeProfessor;
	private String emailProfessor;
	private String nomeDisciplina;
	
	public EstruturaProfessor(int codigo, String nomeProfessor, String emailProfessor, String nomeDisciplina) {
		this.codigo = codigo;
		this.nomeProfessor = nomeProfessor;
		this.emailProfessor = emailProfessor;
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public boolean createProfessor(int codigo) {
		System.out.println("Dados do professor inserido");
		return true;
	}
	
	public boolean readProfessor(int codigo) {
		System.out.println("Código do professor encontrado");
		return true;
	}
	
	public boolean updateProfessor(int codigo) {
		System.out.println("Dados do professor encontrado");
		return true;
	}
	
	public boolean deleteProfessor(int codigo) {
		System.out.println("Dados do professor removido");
		return true;
	}

	@Override
	public boolean createProfessor(int codigo, String nomeProfessor, String emailProfessor, String nomeDisciplina) {
		// TODO Auto-generated method stub
		return false;
	}
}
