import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ListaProfessores{
	NoProfessor cabeca;
	int tamanho=0;
	File arq = new File("Professor.txt");

	public ListaProfessores(){
		this.cabeca=null;
	}

	public void insere(Professor professor){
		NoProfessor aux = new NoProfessor(professor);
		aux.prox = this.cabeca;
		this.cabeca = aux;
		tamanho ++;
	}

	public void insere(Professor professor, int pos) {
		NoProfessor q = new NoProfessor(professor);
		if(pos == 0){
			q.prox = this.cabeca;
			this.cabeca = q;
		}else{
			
			NoProfessor p = this.cabeca;
			for (int i=0; i<pos-1; i++) p = p.prox;
			q.prox = p.prox;
			p.prox = q;
			}
		tamanho++;
		}

	public void exclui(int i) {
		if (i < 0 || i >= this.tamanho ||this.cabeca == null) tamanho++;
		else if (i == 0) this.cabeca = this.cabeca.prox;
		else {
			NoProfessor	 p = this.cabeca;
			for (int j=0; j<(i-1); j++) p = p.prox;
			p.prox = p.prox.prox;		
		}
		tamanho--;
	}


	public void ordena(Comparador c){
		NoProfessor	ref;
		Professor aux;
		for(int i = 0; i<=tamanho+1; i++ ){
			ref=this.cabeca;
			for(int j = 0; j<tamanho; j++ ){
				if(c.compara(ref, ref.prox)){
					aux= ref.professor;
					ref.professor = ref.prox.professor;
					ref.prox.professor = aux;
				}
			ref = ref.prox;			
			}
		}
	}

	
	boolean gravaArq(){
		
		try{
			FileWriter writer = new FileWriter(arq, false);
			NoProfessor ref = this.cabeca;

			for(int i = 0; i < tamanho; i++){
				if(ref != null){
					writer.write(ref.professor.print());
				} 
			ref = ref.prox;
			}
			writer.close();

		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;


	}


	boolean lerArq(){
		String text;
		try{
			Scanner leitor = new Scanner (arq);
			while(leitor.hasNext()){
				text = leitor.nextLine();
		 		System.out.println(text);
		 	}
			leitor.close();
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}




}