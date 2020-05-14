import java.util.Scanner;

class Main{

	public static Scanner input = new Scanner(System.in);

	static void testar(String materia){
		/*if(materia.equals("CalcI")){
			Calc result = new Calc();
			result.print();
		}*/




		switch (materia) {

			case "FSI":

				break;

			case "SMD":

				break;

			case "TADI":

				break;

			case "RP1":

				break;

			case "calcI":
				Calc calc = new Calc();
				calc.print();
				break;

			case "IP":
				Ip ip = new Ip();
				ip.print();
				break;

			default:
				System.out.println("Erro!!! matéria não encontrada!!!");
		}

	}


	public static void main(String[] args) {
		System.out.print("Digite a materia pesquisada: ");
		String materia = input.next();
		testar(materia);

	}
}