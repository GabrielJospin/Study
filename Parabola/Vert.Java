class Vert{
	static double x;
	static double y;
	static String vert;

	Vert(Parabola parabola){
		x = -parabola.b/(2*parabola.a);
		y = -parabola.delta/ (4*parabola.a);
		vert = String.format("O Ponto Vertice da funcao e ( %5.2f , %5.2f )", x, y);
	}

	static void print(){
		System.out.print(vert);
	}
}