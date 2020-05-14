class Derivada{
	static double a;
	static double b;
	static String derivada;

	Derivada(Parabola parabola){
		a = 2*parabola.a;
		b = parabola.b;
		derivada = String.format("a derivada vale %5.2f + %5.2f", a ,b);

	}

	static void print(){
		System.out.print(derivada + "\n");
	}
}