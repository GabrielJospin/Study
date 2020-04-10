import java.util.Scanner;

public class HelloWorld{
	private static double HelloWolrd(double x, double y, double z){
		return ((x+y)*(x/z));
	}
	public static void main(String[] args) {
		Scanner caio = new Scanner(System.in) ;
		System.out.print("Digite tres numeros ");
		double x = caio.nextDouble();
		double y = caio.nextDouble();
		double z = caio.nextDouble();
		System.out.println("A soma resulta em " + HelloWolrd(x,y,z));
	}
}