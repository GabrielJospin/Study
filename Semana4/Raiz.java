/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <2020102> - <Prof. Dr. Luciano Antonio Digiampietri>          **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                    **/
/**                                                                 **/
/**   <Gabriel Medeiros Jospin>                 <11796020>          **/
/**                                                                 **/
/**   <04.03.2020>                                                  **/
/*********************************************************************/

/*
	Cálculo para raiz quadrada
*/
public class Raiz {
	/*
		Calcula a raiz quadrada de um valor, com uma determinada
		precisão. Retorna esse valor, ou -1 quando:
		* a < 0
		* epsilon <= 0
		* epsilon >= 1
		
		Ou 0 (zero) quando a = 0
		
		Parâmetro:
			a - valor cuja raiz quadrada será calculada
			epsilon - precisão do cálculo
	*/
	static double raizQuadrada(double a, double epsilon) {
		// Testa a>0 e se E C ]0,1[ 
		if (a<0 || epsilon <= 0 || epsilon >= 1) return -1;
		
		double x = a / 2;
		double x_ans = 0;
		//Faz-se o processo até a precisão pedida
		while ((x-x_ans > epsilon && x-x_ans > 0) || (x-x_ans < epsilon && x - x_ans < 0)){
			x_ans = x;
			x = (x_ans+(a/x_ans))/2;

		}
		return x;
	}


	static void teste (int n){
		for (int i=0; i<=n ;i+=1 ) {
			double x = raizQuadrada(i,0.00000001);
			double resp = Math.sqrt(i);
			System.out.println("************");
			System.out.println("Testando para: "+ i);
			System.out.println("Metodo newton: " +x);
			System.out.println("biblioteca math: "+resp);
			System.out.println("|"+"\u03B5"+"|: "+(Math.abs(x-resp)));
		}
		
	}

	/*
		Apenas para seus testes. ISSO SERA IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		teste(100);

		//double resp = raizQuadrada(0,0.1);
		//System.out.println(resp);
	}

}

