import java.util.Scanner;

class Palindromo{

	static Scanner input = new Scanner(System.in);

	static boolean palindromo(String s){
		boolean result = true;
		int oposte=s.length();
		for(int i = 0; i<s.length();i++){
			oposte += -1;

			if(s.charAt(i) != s.charAt(oposte)){ 
				result = false;
			}
		}
		return result;
	}



	public static void main(String[] args) {
		System.out.print("Diga uma palavra: ");
		String palavra = input.next();

		if(palindromo(palavra)) System.out.printf("\na palavra e palindroma");
		else System.out.printf("\na palavra nao e palindroma");
	}

}