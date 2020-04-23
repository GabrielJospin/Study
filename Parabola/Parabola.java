import java.util.Scanner;
/*
	Programa para a construçção de Parabolas

*/
public class Parabola{
	

	static Function inValor(){
		/*
		Este método recebe os valores de a,b e c por input
		e os substitui nas variáveis globais
		*/
		Function parabola = new Function();

		try {
		Scanner input = new Scanner (System.in);
		System.out.print("\nDigite o valor de a: ");
		parabola.a = input.nextDouble();
		System.out.print("Digite o valor de b: ");
		parabola.b = input.nextDouble();
		System.out.print("Digite o valor de c: ");
		parabola.c = input.nextDouble();
		parabola.delta=Function.delta(parabola.a, parabola.b, parabola.c);
		return parabola;
		}catch (Exception e) {
			System.out.println("um ou mais Valores nao aceitos");
			return inValor();}

	} 

	static double[] raízes(Function parabola){


		//Este método recebe os valores da função, cálcula as raízes e as retorna 
		double[] raiz= new double[3];
		if (parabola.delta>=0){
			raiz[0] = 1;
			raiz[1] = (0 - Math.sqrt(parabola.delta) - parabola.b) /(2*parabola.a);
			raiz[2] = (Math.sqrt(parabola.delta) - parabola.b) /(2*parabola.a);
			return raiz;}
		raiz [0] = 0;
		raiz[1] = (0 - parabola.b)/(2*parabola.a);
		raiz[2] = Math.sqrt(0-parabola.delta)/(2*parabola.a);
		return raiz;


	}

	static double[] vertice(Function parabola){
		//Este método recebe os valores da função, cálcula o Vértice e o retorna
		double[] vertice = new double[2];
		vertice[0]= (0 - parabola.b) / (2*parabola.a);
		vertice[1] = (0 - parabola.delta)/ (4*parabola.a);
		return vertice;
	}


	static void printRaiz(double[] raiz){
		//Este método recebe as raízes, testa seu tipo e printa-as
		if (raiz[0] == 1){
			System.out.printf("O Valor das raizes sao %5.2f", raiz[1]);
			System.out.printf(" e %5.2f %n", raiz[2]);
		} else{
			System.out.printf("O Valor das raizes sao %5.2f", raiz[1]);
			System.out.printf("\u00B1 %5.2f", raiz[2]);
			System.out.printf("i %n");
		} 
	}


	public static void main (String[] args){

		Function parabola = new Function();

		// Menu para input do usuário
		System.out.print("\nMontar parabolas \n \n");
		System.out.print("Uma parabola e formada pelo esquema y = a*x\u00B2 +b*x+c  ");
		
		// Crias-se a função f(x)=ax²+bx+c
		parabola = inValor();

		// printa-se a função
		System.out.printf("\nA equacao e y = %5.2f", parabola.a);
		if (parabola.b>=0) {
			System.out.printf("*x\u00B2 + %5.2f", parabola.b);
		}else {
			System.out.printf("*x\u00B2 - %5.2f", (0 - parabola.b) );
		}
		if (parabola.c>=0) {
			System.out.printf("*x + %5.2f %n", parabola.c);
		}else {
			System.out.printf("*x - %5.2f %n", (0-parabola.c));
		}

		System.out.printf("%5.2f %n", parabola.delta);
		// Printa-se as raízes
		double[] raiz = raízes(parabola);

		printRaiz(raiz);
		//Printa-se o vérice
		double[] vert = vertice(parabola);

		System.out.printf("O Ponto Vertice da funcao e ( %5.2f", vert[0]);
		System.out.printf(", %5.2f", vert[1]);
		System.out.printf(" )");
	}
}