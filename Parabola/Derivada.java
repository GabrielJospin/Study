class Derivada{
	static double dvA;
	static double dvB;
	static String derivada;

	Derivada(Parabola parabola){
		dvA = 2*parabola.a;
		dvB = parabola.b;
		derivada = String.format("a derivada vale %5.2f + %5.2f", dva ,dvB);

	}

	static void print(){
		System.out.print(derivada + "\n");
	}
}