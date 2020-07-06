import java.util.Scanner;


class Main{
	static Scanner input = new Scanner(System.in);

	static boolean teste(String question){
		System.out.print(question +"(s/n): ");
		String resp = input.next();
		if(resp.equals("s")){
			return true;
		}else if(resp.equals("n")){
			return false;
		}else{
			System.out.print("error\n");
			return teste(question);
		}
	}

	public static void main(String[] args) {

		Professor prof1 = new Professor ("Digimon","digi.deus@usp.br",51,"Ip",2000,"Doutorado","Usp/Unesp");
		Professor prof2 = new Professor ("Norton","norton.trilegal@usp.br",52,"Ip",2000,"Doutorado","Ufpr");
		Professor prof3 = new Professor ("Claudinha","claudinha.trivial@usp.br",43,"calculo",2002,"Doutorado","Usp");
		Professor prof4 = new Professor ("Ester","ester.smd@usp.br",51,"smd",2000,"Doutorado","Usp");
		
		ListaProfessores professores = new ListaProfessores();


		professores.insere(prof1);
		professores.insere(prof2);
		professores.insere(prof3);
		professores.insere(prof4); 
		
		professores.ordena(new ComparaIdade());
		if (! professores.gravaArq()) System.out.println("Arquivo Não Criado");
		if (! professores.lerArq()) System.out.println("Arquivo Não Lido");

		Aluno aluno1 = new Aluno("Frodo","gabi.jospin@gmail.com",17,"sistema da Informacao", 2020, prof1);
		Aluno aluno2 = new Aluno("Duda","duda.duda@gmail.com",17,"sistema da Informacao", 2020, prof2);
		Aluno aluno3 = new Aluno("Ramon","ramon.pai@gmail.com",18,"sistema da Informacao", 2020, prof3);
		Aluno aluno4 = new Aluno("gabriel","gabs.BIOS@gmail.com",19,"sistema da Informacao", 2019, prof4);

		ListaAlunos alunos = new ListaAlunos();

		alunos.insere(aluno1);
		alunos.insere(aluno2);
		alunos.insere(aluno3);
		alunos.insere(aluno4);

		alunos.ordena();
		if (! alunos.gravaArq()) System.out.println("Arquivo Não Criado");
		if (! alunos.lerArq()) System.out.println("Arquivo Não Lido");

		

	}
}