public class Retangulo extends FormaGeometrica{

	double base;
	double altura;

	public Retangulo(double base, double altura ){
		this.base = base;
		this.altura = altura;
	}

	public double area(){
		return (base*altura);
	}

	public double perimetro(){
		return (2*base+2*altura);
	}


}