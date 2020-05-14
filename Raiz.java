public class Raiz {
	
	static void teste (int n){
		for (int i=0; i<=n ;i++ ) {
			double x = raizQuadrada(i,0.1);
			double resp = Math.sqrt(i);
			System.out.println("************");
			System.out.println("Testando para: "+ i);
			System.out.println("Metodo newton: " +x);
			System.out.println("biblioteca math: "+resp);
			System.out.println("|"+"\u03B5"+"|: "+(Math.abs(x-resp)));
		}
		

	}

	static double raizQuadrada(double a, double epsilon){
		if (a<0 || epsilon <= 0 || epsilon >= 1) return -1;

		double x = a / 2;
		double x_ans = 0;
		while ((x-x_ans > epsilon && x-x_ans > 0) || (x-x_ans < epsilon && x - x_ans < 0)){
			   x_ans = x;
			   x = (x_ans+(a/x_ans))/2;

		}
		return x;
	}

	public static void main(String[] args) {
		teste(100);
		//double resp = raizQuadrada(0,0.1);
		//System.out.println(resp);
	}

}
