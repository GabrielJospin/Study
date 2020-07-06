class Tangente{
	static double x;
	static double y;
	static double m;
	static String tangente;

	Tangente(Derivada derivada, double ponto, Parabola parabola){
		x = ponto;
		y = parabola.a*Math.pow(x,2)+parabola.b*x+parabola.c;
		m = derivada.a*x+derivada.b;
		tangente = String.format("Y  = %5.2f*x + %5.2f",  m, y-(m*x));
	}

	static void print(){
		System.out.print(tangente+"\n");
	}
}