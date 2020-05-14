class PalavraMagica{

	static int contaCaracteres(char[][] palavra){
		int total = 0;
		for (int i=0; i<palavra.length; i++){
			total += palavra[i].length;
		}

		return total;
	}

	public static void main(String[] args) {
		char palavra[][] = new char[5][4];
		for (int i = 0; i<5; i++){
			for( int j = 0; j<4; j++){
				palavra[i][j] = 'a';
			}
		}
	
	System.out.println(contaCaracteres(palavra));

	}
}

