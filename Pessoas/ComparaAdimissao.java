public class ComparaAdmissao implements Comparador{
	public boolean compara(NoProfessor a, NoProfessor b){
		if(a == null) return false;
		if(b == null) return false;
		if(a.professor.anoDeAdmissao>b.professor.anoDeAdmissao) return true;
		if(a.professor.anoDeAdmissao<b.professor.anoDeAdmissao) return false;
	}
}