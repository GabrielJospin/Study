class Vetor{
	static int contagem1(int valores[], int x){
		int contagem = 0;
		for (int i= 0; i < valores.length; i++){
			if (x == valores[i]) contagem++;

		}
		return contagem;
	}


	static int contagem2(int valores[], int x){
		int contagem = 0;
		for (int i : valores){
			if (x == i) contagem++;

		}
		return contagem;
	}


	public static void main(String[] args) {
		int[] array = {1, 2, 1 ,2 ,1 ,2 , 4}; 
		for (int i =0; i < array.length; i++) System.out.println(array[i]);
		System.out.println("");
		for(int i=1; i <=4; i++) System.out.println(contagem2(array,i));
	}

}