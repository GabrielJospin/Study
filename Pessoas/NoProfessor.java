public class NoProfessor{
	Professor professor;
	NoProfessor prox= null;

	public NoProfessor(Professor professor){
		this.professor = professor;
	}

	public NoProfessor(){
		this.professor = null;
	}
}