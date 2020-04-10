/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <2020102> - <Prof. Dr. Luciano Antonio Digiampietri>          **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <Gabriel Medeiros Jospin>               <11796020>            **/
/**                                                                 **/
/**   <04.03.2020>                                                  **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/

import java.util.Random;
import java.util.Scanner;

public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;


	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	static int MaiorDivisor(int valor, int nota){
		// este método recebe o valor da nota e de quanto quer ser saca e devolve o maior número de notas para esse valor, cujo o Resto é positivo
		int numeroDeNotas = 1;
		while (valor - nota * numeroDeNotas>=0 ) numeroDeNotas++;
		numeroDeNotas --;
		return numeroDeNotas;
	}
	static void fazRetirada(int valor) {
		// este método recebe o valor a ser sacado, usa o método para descobrir o númeoro de notas retiradas e subtrai do valor
		n50 = MaiorDivisor(valor,50);
		valor = valor - n50 * 50;
		n10 = MaiorDivisor(valor,10);
		valor = valor - n10 * 10;
		n5 = MaiorDivisor(valor,5);
		valor = valor - n5 * 5;
		n1 = valor;
	}
	
	public static void out(int num){
		// este método Responde os valores de respostas para o número pedido
		fazRetirada(num);
		System.out.println("Testando para " + num);
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);
		System.out.println();
	}
	public static void input(){
		try {
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			out(num);

		} catch(Exception e){
			System.out.println("Error: Valor inválido");
			System.out.println("Valor deve ser um inteiro positivo");
			in();
		}
		
	}

	public static void testar(){
		// este método testa para 10 númeors naturais menores que 301
		// Fala 300, Fala 300
		// /um pouco mais
		Random randomizar = new Random();
		for (int i = 0;i <10 ;i ++ ) out(randomizar.nextInt(301));

	}
	
	public static void main(String[] args) {
		
		/* System.out.println("Caixa eletrônico das Ilhas Weblands");
		System.out.println("estoque ilimitado de cédulas de B$50,00, B$10,00, B$5,00 e B$1,00.");
		System.out.println("*******************************************************************");
		System.out.print("Quanto o(a) Senhor(a) deseja sacar? ");
		input(); 
		*/

		Testar();

	}
}
