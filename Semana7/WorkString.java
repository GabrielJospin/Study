import java.util.Scanner;	
class WorkString{

	static Scanner input = new Scanner(System.in);

	static String copiaStr(String s){

		char[] aux = s.toCharArray();
		String novaString = new String(aux);
		return novaString;

	}

	public static void main(String[] args) {
		System.out.print("qual a String? ");
		String str = input.next();
		String nStr = copiaStr(str);
		System.out.print("\n"+nStr);
	}

}