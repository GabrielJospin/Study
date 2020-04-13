public class Semana3{
	
	static void cor(int identificador){
		switch (identificador){
			case 1:
				System.out.println("verde");
				break;
			case 2:
				System.out.println("Amarelo");
				break;
			case 3:
				System.out.println("Azul");
				break;
			case 4:
				System.out.println ("Branco");
				break;
			default:
				System.out.println("identificador invalido");
		}
	}

	public static void conjecturaDeCollatz(int n){
		System.out.println("Imprimindo sequencia iniciando em " + n);
		while (n>1){
			if (n % 2 == 0) n = n/2;
			else n = 3*n + 1;
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		//for (int i = 1;i<=5 ;i++ ) {
			//cor(1);
		conjecturaDeCollatz(10);
		//}
	}

}
