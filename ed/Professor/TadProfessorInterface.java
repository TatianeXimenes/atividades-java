
public interface TadProfessorInterface {

	boolean createProfessor(int codigo, String nomeProfessor, String emailProfessor, String nomeDisciplina);
	boolean readProfessor(int codigo);
	boolean updateProfessor(int codigo);
	boolean deleteProfessor(int codigo);
}
