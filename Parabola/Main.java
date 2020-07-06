import java.util.Scanner;

//Programa para a construção de Parabolas

public class Main{

	double a;
	double b;
	double c;
	
	static Scanner input = new Scanner (System.in);

	void inValor(){
		//Este método recebe os valores de a,b e c por inpute os substitui nas variáveis globais
		
		try {
		
		System.out.print("\nDigite o valor de a, b e c (separados por espaco): ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		}catch (Exception e) {
			System.out.println("um ou mais Valores nao aceitos");
			 inValor();
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
			inValor();
			parabolas[i]=new Parabola(a,b,c);
			parabolas[i].execute();
		}



		

	}
}