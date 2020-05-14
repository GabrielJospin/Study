class Raiz{
	static int type;
	static double x1;
	static double x2;
	static double complex;
	static double y1 = 0;
	static double y2 = 0;
	static String raizes;

	Raiz(Parabola parabola){
		if (parabola.delta>=0){
			type = 0;
			x1 = (-parabola.b-Math.sqrt(parabola.delta))/(2*parabola.a);
			x2 = (-parabola.b+Math.sqrt(parabola.delta))/(2*parabola.a);
			complex = 0;
			raizes = String.format("O valos das raizes sao %5.2f e %5.2f", x1, x2);
		} else{
			type = 1;
			x1 = (-parabola.b)/(2*parabola.a);
			x2 = (-parabola.b)/(2*parabola.a);
			complex = (Math.sqrt(-parabola.delta))/(2*parabola.a);
			raizes = String.format("O valor das raizes sao %5.2f \u00B1 %5.2f i", x1, complex);
		}

	}

	static void print(){
			System.out.pritnt(raizes + "\n");
		 
	}
}
