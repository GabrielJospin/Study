class Pontos{

	static double tab;
	static double ex1;
	static double ex2;
	static double[][] points;

	Pontos(Parabola parabola, Raiz raiz){
		tab = (raiz.x2-raiz.x1);
		if (tab!=0){
			ex1 = raiz.x1 - tab*4;
			ex2 = raiz.x2 + tab*4;
		}else{
			ex1 = raiz.x1 - 10;
			ex2 = raiz.x2 + 10;
			tab = 1;
		}
		points = new double[10][2];
		
		double x = ex1;
		for(int i = 0; i<points.length; i++ ){
			points[i][0] = x;
			points[i][1] = parabola.a*Math.pow(x,2)+parabola.b*x+parabola.c;
			x+=tab;
		}

	}
	

	static void print(){
		System.out.printf("Os pontos são:\n" );
		System.out.print("| x \t | y \t | \n");
		for (int i = 0; i<points.length ; i++){
			System.out.printf("| %5.2f \t",points[i][0]);
			System.out.printf("| %5.2f \t | \n",points[i][1]);
		}
	
	}

	



}