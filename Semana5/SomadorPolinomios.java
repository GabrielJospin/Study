class SomadorPolinomios{
	static double[] somador(double[] a, double b[]){
		double[] result = new double[a.length];

		for (int i=0;i<a.length;i++){
			result[i] = a[i] + b[i];
		}

		return result;
	}

	public static void main(String[] args) {
		double[] a= {0, 1, -5 , 6};
		double[] b= {1, 0 , 0 , -1};
		double[] result = somador(a,b);
		for ( int i = 0; i < result.length; i++ ) System.out.println(result[i]);
	}


}
