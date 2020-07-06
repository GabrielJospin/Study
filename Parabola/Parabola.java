import java.util.Scanner;

class Parabola{
	static double a;
	static double b;
	static double c;
	static double delta;
	static String referenciaEmTexto;
	static Raiz raiz;
	static Vert vert;
	static Pontos points;
	static Derivada derivada;
	static Tangente tangente;

	Parabola(double a, double b, double c){
		//constrói a parabola
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta= delta(a,b,c);
		raiz = new Raiz(this);
		vert = new Vert(this);
		referenciaEmTexto = String.format("Y = %5.2f*x² + %5.2f*x + %5.2f",a, b, c);


	}

	static double delta(double a, double b, double c){
		//calcula o delta
		return (Math.pow(b, 2)-4*a*c);
	}

	static void print(){
		//printa-se a parabola
		System.out.println(referenciaEmTexto+"\n")
	}

	static void execute(){

		Scanner input = new Scanner(System.in);
		
		//printa-se a parabola, raizes e vértica
		this.print();
		raiz.print();
		vert.print();

		//calcula os pontos
		System.out.println("Deseja imprimir os principais pontos?(S/n) ");
		String resp1 = input.next();
		if (resp1.equals("s") || resp1.equals("")){
			points = new Pontos(this, raiz);
			points.print();
		}
		
		//calcula as derivadas
		System.out.println("Deseja calcular a derivada?(S/n) ");
		String resp2 = input.next();
		if (resp1.equals("s") || resp1.equals("")){
			derivada = new Derivada(this);
			derivada.print();
		}

		//calcua a Tangente
		System.out.println("Deseja calcular a reta tangente em qual ponto? ");
		Double resp3 = input.nextDouble();
		tangente = new Tangente(derivada,resp3,this);
		tangente.print();
		



	}




}