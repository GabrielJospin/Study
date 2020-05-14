import java.util.Scanner;

class Maior{

	static Scanner input = new Scanner(System.in);

	static int MaiorValor (int[][] m){

		int maior = m[0][0];

		for (int i = 0; i<m.length ; i++ ) {
			for (int j = 0;j<m.length; j++ ) {
				if (m[i][j]>maior) maior = m[i][j];
			}
		}
	
		return maior;
	}

	static int somaDiagonal(int[][] m){
		int somador = 0;
		for (int i = 0; i<m.length; i++){
			somador += m[i][i];
		}

		return somador;
	}

	static boolean simetrica(int[][] m){
		boolean result = true;

		for (int i = 0; i <m.length; i++){
			for(int j=0; j<m.length; j++){
				if (m[i][j] != m[j][i]){
					return false;
				}
			}
		}

		return result;
	}



	static int[][] teste(){
		int matriz[][] = new int[3][3];

		for(int i = 0; i<3 ;i++){
			for(int j = 0; j<3; j++){
				System.out.printf("matriz indice[%d][%d] :", i , j);
				matriz [i][j] = input.nextInt();
			}
		}

		return matriz;
	}


	public static void main(String[] args) {
		
		int teste[][] = teste();
		int maior = MaiorValor(teste);
		int diagonal = somaDiagonal(teste);
		System.out.printf("\nO maior valor e %d, a soma da diagonal e %d  ", maior, diagonal);

		if(simetrica(teste)) System.out.printf("\n e simetrico");
		else System.out.printf("\nnao e simetrico");
	}


}