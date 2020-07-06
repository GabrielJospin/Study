import java.util.Scanner;	
class WorkString{

	static Scanner input = new Scanner(System.in);

	static String copiaStr(String s){

		char[] aux = s.toCharArray();
		String novaString = new String(aux);
		return novaString;

	}

		static boolean comparaTextos(String texto1, char[] texto2){
			String	text2 = new String (texto2);
			if(texto1.equals(text2)){
				return true;
			}else{
				return	false;
			} 
		}

	public static void main(String[] args) {
		System.out.print("qual a String 1? ");
		String str1 = input.next();
		//String nStr = copiaStr(str);
		System.out.print("qual a String 2? ");
		char[] str2 = new char[13];
		for (int i =0;i<str2.length ;i++ ) {
			str2[i] = input.next().charAt(0);
		}
		boolean	bool = comparaTextos(str1, str2);
		System.out.print("\n"+bool);
	}

}