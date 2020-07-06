import  java.math.*;

public class Circulo extends FormaGeometrica{

	double raio;

	public Circulo(double raio){
		this.raio = raio;
	}

	public double area(){
		return (Math.pow(raio,2)*Math.PI);
	}

	public double perimetro(){
		return (2*raio*Math.PI);
	}


}