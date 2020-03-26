import java.util.Scanner;
public class TempConverter{
	public static void main (String[] args) {
		System.out.println("conversor de temperatura");
		System.out.println("Estilos disponiveis: \n F=>1 \t K=>2 \t Ra=>3 \t N=>4 \t De=>5 \t Re=>6 ");
		Scanner caio = new Scanner(System.in);
		System.out.print("Digite o tipo de temperatura: ");
		int type = Integer.parseInt(caio.nextLine());
		System.out.print("Digite o valor da temperatura: ");
		double num = Double.parseDouble(caio.nextLine());
		double result = 0;
		if (type == 1)
			result = (num-32)*5/9;
		if(type == 2)
			result = num - 273;
		if (type == 3)
			result = (num / 1.8) - 273 ;
		if (type == 4)
			result = num * 100 / 33;
		if (type == 5)
			result = (100 - num)*2/3;
		if (type == 6)
			result = (num * 5/4);
	
	System.out.println();	
	System.out.printf("%s","A temperatura vale: ");
	System.out.printf("%5.2f" , result);
	System.out.printf("%s",  "\u00BA");
	System.out.printf("%C", 'c');


	}
}

