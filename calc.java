import java.util.Scanner;
public class calc{
	static Scanner input = new Scanner(System.in);

	static void tutorial(){
		System.out.println("welcome to the tutoria");
		System.out.println("You post the function and next the number, example: ");
		System.out.println("SUM 2 3 5 11");
		System.out.println("21");
	}

	static Integer[] numbers(){
		Integer num[];
		for (int i= 0;num[i-1]== null ;i++ ) {
			num[i] = input.nextInt();			
		}
	
	return num;
	
	}

	static String function(){
	System.out.print("digite a função a ser utilizada");
	String func = input.next();
	Integer[] num = numbers();
	System.out.print(func);
	System.out.print(num);
	return "calc";


	}

	public static void main(String[] args) {
	System.out.println("Hi, welcome to the Super Calc!");
	System.out.println("you need a tutorial?, 0 to not and 1 to yes");
	Integer test = input.nextInt();
	if (test == 1) tutorial();
	else function();	
	}
}