import java.util.Scanner;

//Programa para a construção de Parabolas

public class Main{
	
	static Scanner input = new Scanner (System.in);

	static Parabola inValor(){
		//Este método recebe os valores de a,b e c por inpute os substitui nas variáveis globais
		
		try {
		
		System.out.print("\nDigite o valor de a, b e c (separados por espaco): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		Parabola parabola = new Parabola(a,b,c);
		return parabola;
		}catch (Exception e) {
			System.out.println("um ou mais Valores nao aceitos");
			return inValor();
		}
	} 



	public static void main (String[] args){


		// Menu para input do usuário
		System.out.print("\nMontar parabolas \n \n");
		System.out.print("Uma parabola e formada pelo esquema y = a*x\u00B2 +b*x+c  ");
		System.out.prints("\nQuantas parabolas deseja montar? ");
		int tam = input.nextInt();

		Parabola[] parabolas = new Parabola[tam];

		// Crias-se a função f(x)=ax²+bx+c
		for (int i = 0; i<parabolas.length; i++){
			parabolas[i]=inValor();
			parabolas[i].execute(parabolas[i]);
		}



		

	}
}