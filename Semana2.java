import java.util.Random;

public class Semana2{
	static void calculoDoValorDePi(int iteracoes){
		double meuPI = 4; // valor inicial de pi ("primeira iteracao")
		int sinal = -1;
		double divisor = 3;
		for (int i=2;i<=iteracoes;i++){
			meuPI += sinal * 4.0/divisor; // atualiza o valor de pi
			divisor += 2; // incrementa o valor do divisor
			sinal *= -1; // inverte o sinal da variavel sinal
		}
		System.out.println("("+iteracoes+") pi: " + meuPI);
	}

	static double areaTrapezio(double baseMaior, double baseMenor, double altura){
		double area;
		area = (baseMenor + baseMaior)*altura/2;
		return area;
	} 

	static double areaRetangulo(double base, double altura){
		double area = areaTrapezio(base,base,altura);
		System.out.println("Area do retangulo: " + area);
		return areaTrapezio(base,base,altura);
	}

	static double areaDoQuadrado(double lado){
		double area = areaRetangulo(lado, lado);
		System.out.println("Area do Quadrado: "+area);
		return area;
	}

	static void teste(int num){
		Random random = new Random();
		for (int i = 0;i <num ;i ++ ){
			double bM = (double) random.nextInt(99);
			int aux = (int) bM;
			double bm = (double) random.nextInt(aux);
			double h = (double) random.nextInt(99);
			System.out.println("Testando para:" + bM + " " + bm+  " " + h);
			double area = areaTrapezio(bM, bm, h);
			System.out.println(area);


		}
		

	}

	public static void main(String[] args) {
		//System.out.println("Lula Livre");	
		//teste(7);
		//areaRetangulo(11,27);
		//areaDoQuadrado(5);
		for (int i = 1;i<=5 ;i++ ) {
			calculoDoValorDePi(i);
		}
		calculoDoValorDePi(100);
	}
}