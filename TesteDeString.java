import java.util.Scanner;

public class TesteDeString {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Digite seu email");
	String email = input.nextLine();
	email = email.trim();
	System.out.println(email);
	}
	
}
	
