import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Leitor{

	static String nome;
	static String email;
	
	static void lerArq(Lista lista){
		
		try{
			File arq = new File("Nomes.txt");
			Scanner leitor = new Scanner (arq);
			Pessoa pessoa;
			int i = 0;
			while(leitor.hasNext()){
				nome = leitor.next();
				email = leitor.nextLine();
				pessoa = new Pessoa(nome, email);
				lista.insere(pessoa,i);
				i++;
			}
			leitor.close();
		}catch (Exception e) {
			System.out.println(e);	
		}
	}

	public static Lista execute(){
		Lista lista = new Lista();
		lerArq(lista);
	 	return lista;
	}	


}