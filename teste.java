import java.util.Scanner;

public class teste {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("What's your name? ");
		name = input.nextLine();
		System.out.println("Hello " + name + ", how are u?");	
	}
}