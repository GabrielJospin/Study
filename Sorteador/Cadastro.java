import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class Cadastro{

	public static File arq = new File("Nomes.txt");
	static	int i = 1;	

	private static boolean gravaArq(String nome, String email, FileWriter writer){
		
	

		try{
			
			writer.write(i+" ");		
			writer.write(nome+" ");
			writer.write(email + "\n");
			i++;

		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		try{
		Scanner input = new Scanner(System.in);
		FileWriter writer = new FileWriter(arq, false);
		System.out.print("Quantas pessoas serao cadastradas? ");
		int num = input.nextInt();
		
		String nome;
		String email;

		for(int i = 1; i <= num; i++){
			System.out.printf("\n***Cadastrando Pessoa %d ***", i);
			System.out.print("\nPrimeiro nome:");
			nome = input.next();
			System.out.print("\nemail:");
			email = input.next();
			if(! gravaArq(nome, email, writer)) System.out.print("\n Cadastrado nao realizado");
			
		}
		writer.close();
		}catch (Exception e) {
			System.out.print(e);
		}
	}


}