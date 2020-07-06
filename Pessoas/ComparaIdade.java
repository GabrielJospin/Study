class ComparaIdade implements Comparador{
	public boolean compara(NoProfessor a, NoProfessor b){
		if(a == null) return false;
		if(b == null) return false;
		if(a.professor.idade>b.professor.idade) return true;
		if(a.professor.idade<b.professor.idade) return false;
		return false;
	}
}