
public class TestarTAD {

	public static void main(String[] args) {
		TadProfessorInterface professor = new EstruturaProfessor(0, null, null, null);
		professor.createProfessor(14, "Angela", "angela@gmail.com", "Estrutura de dados");
		professor.readProfessor(14);
		professor.updateProfessor(14);
		
		System.out.println();

	}

}
