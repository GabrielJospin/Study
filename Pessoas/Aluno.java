class Aluno extends Pessoa{
	String curso;
	int anoDeIngresso;
	Professor tutor;

	Aluno(String nome, String email,int idade, String curso, int anoDeIngresso, Professor tutor){
		super(nome, email, idade);
		this.curso = curso;
		this.anoDeIngresso = anoDeIngresso;
		this.tutor = tutor;
	}

	String print(){
		String text = String.format("\nNome: %s \nCargo: %s \nCurso: %s \nAno: %d \nProfessor: %s \n","Aluno",super.nome, curso, anoDeIngresso, tutor.nome);
		return text;
	}
}