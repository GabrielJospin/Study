import java.util.Scanner;

public class Fatorial{
	public static void main(String[] args) {
		System.out.print("numero a ser fatorado: ");
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		double total = 1;
		String resp = "";
		int test = 0;
		while (num > 0){
			total = total * num;
			num = num - 1;
			if (total> (7*Math.pow(10,300))){
				System.out.print("A fucking big number");
				resp = "\nError";
				test = 1;
				break;
			}

		}
		if (test == 0) resp = String.format("%f",total);

		System.out.println(resp);
			
	}
}