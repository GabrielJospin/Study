class Something{
	static int[] conta3 (int[] m1, int[] m2, int[] m3){

		int[] result = new int[m1.length];

		if (m1.length == m2.length && m2.length ==m3.length){
			for(int i =0; i<m1.length; i++){
				result[i]=m1[i]+m2[i]+m3[i];
			}
		} else {
			return null;
		}

		return result;
	}



	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 9 ,8, 7, 6, 5, 4};
		int[] c = {1, 1, 1, 1, 1, 1, 1};

		int[] result = conta3(a,b,c);
		if (result != null){
			for (int i=0; i<result.length; i++) System.out.print(result[i] + "\t") ;
		}
	}



}