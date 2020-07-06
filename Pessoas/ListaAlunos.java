import java.io.*;;
import java.util.Scanner;

public class ListaAlunos{
	NoAluno cabeca;
	int tamanho=0;
	File arq = new File("Alunos.txt");

	public ListaAlunos(){
		this.cabeca=null;
	}

	public void insere(Aluno aluno){
		NoAluno aux = new NoAluno(aluno);
		aux.prox = this.cabeca;
		this.cabeca = aux;
		tamanho ++;
	}

	public void insere(Aluno aluno, int pos){
		NoAluno aux = new NoAluno(aluno);
		NoAluno	p = this.cabeca;
		for(int i = 0; i<pos-1; i++){
			aux.prox = p.prox;
			p.prox = aux;
			
		}
		tamanho ++;
	}

	public void ordena(){
		NoAluno	ref;
		Aluno aux;
		for(int i = 0; i<=tamanho+1; i++ ){
			ref=this.cabeca;
			for(int j = 0; j<tamanho; j++ ){
				if(ref!=null && ref.prox != null &&ref.aluno.idade>ref.prox.aluno.idade){
					aux= ref.aluno;
					ref.aluno = ref.prox.aluno;
					ref.prox.aluno = aux;
				}
			ref = ref.prox;			
			}
		}		
	}

	boolean gravaArq(){
		try{
			FileWriter writer = new FileWriter(arq, false);
			NoAluno ref = this.cabeca;

			for(int i = 0; i < tamanho; i++){
				if(ref != null){
					writer.write(ref.aluno.print());
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