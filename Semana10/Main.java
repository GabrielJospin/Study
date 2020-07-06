class Main{


	public static void main(String[] args) {
		FormaGeometrica forma1 = new Quadrado(5);
		FormaGeometrica forma2 = new Circulo(5);
		FormaGeometrica forma3 = new Retangulo(5,10);

		System.out.printf("\n**Quadrado** \nArea: %.4f \nPerimetro %.4f", forma1.area(), forma1.perimetro());
		System.out.printf("\n**Circulo** \nArea: %.4f \nPerimetro %.4f", forma2.area(), forma2.perimetro());
		System.out.printf("\n**Retangulo** \nArea: %.4f \nPerimetro %.4f", forma3.area(), forma3.perimetro());
	}
}