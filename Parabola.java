import java.util.Scanner;
/*
	Programa para a construçção de Parabolas

*/
public class Parabola{

	static double a;
	static double b;
	static double c;
	static double delta;

	static boolean teste(Double valor){
		// Este método recebe um valor e responde se ele pertence aos Reais positivos(incluindo o zero) ou não
		if (valor >= 0) return true;
		return false;
	}

	static void InValor(){
		/*
		Este método recebe os valores de a,b e c por input
		e os substitui nas variáveis globais
		*/
		try {
		Scanner input = new Scanner (System.in);
		System.out.print("\nDigite o valor de a: ");
		a = input.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = input.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = input.nextDouble();
		}catch (Exception e) {
			System.out.println("um ou mais Valores nao aceitos");
			InValor();}

	} 

	static double[] raízes(){
		//Este método recebe os valores da função, cálcula as raízes e as retorna 
		double[] raiz= new double[3];
		if (teste(delta)){
			System.out.println(teste(delta));
			raiz[0] = 1;
			raiz[1] = (0 - Math.sqrt(delta) - b) /(2*a);
			raiz[2] = (Math.sqrt(delta) - b) /(2*a);
			return raiz;}
		raiz [0] = 0;
		raiz[1] = (0 - b)/(2*a);
		raiz[2] = Math.sqrt(0-delta)/(2*a);
		return raiz;


	}

	static double[] vertice(){
		//Este método recebe os valores da função, cálcula o Vértice e o retorna
		double[] vertice = new double[2];
		vertice[0]= (0 - b) / (2*a);
		vertice[1] = (0 - delta)/ (4*a);
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
		// Menu para input do usuário
		System.out.print("\nMontar parabolas \n \n");
		System.out.print("Uma parabola e formada pelo esquema y = a*x\u00B2 +b*x+c  ");
		
		// Crias-se a função f(x)=ax²+bx+c
		InValor();
		
		//Calcula-se Delta
		delta = Math.pow(b,2)-4*a*c;

		// printa-se a função
		System.out.printf("\nA equacao e y = %5.2f", a);
		if (b>=0) {
			System.out.printf("*x\u00B2 + %5.2f", b);
		}else {
			System.out.printf("*x\u00B2 - %5.2f", (0 - b) );
		}
		if (c>=0) {
			System.out.printf("*x + %5.2f %n", c);
		}else {
			System.out.printf("*x - %5.2f %n", (0-c));
		}
		// Printa-se as raízes
		double[] raiz = raízes();

		printRaiz(raiz);
		//Printa-se o vérice
		double[] vert = vertice();

		System.out.printf("O Ponto Vertice da funcao e ( %5.2f", vert[0]);
		System.out.printf(", %5.2f", vert[1]);
		System.out.printf(" )");
	}
}