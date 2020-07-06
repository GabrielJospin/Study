import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;


class Grava{



	boolean gravaArq(String nome){
		if (nome == null) return false;
		File arq = new File(nome);
		try{
			FileWriter writer = new FileWriter(arq, false);

		}catch (Exception e) {
			System.out.println(e);
		}
		return true;


	}

	public static void main(String[] args) {
		File arq = new File("Teste.txt");
		try{
			File arq2 = new File("Teste2");
			FileOutputStream writer = new FileOutputStream(arq2, false);
			FileInputStream reader = new FileInputStream(arq);

			int b;

			while((b= reader.read())!= -1){
				b = b ^ (~b);
				writer.write(b);
			}

			writer.close();
			reader.close();
			arq.delete();
			arq2.renameTo(arq);

		}catch (Exception e) {
			System.out.println(e);
		}
	}



}