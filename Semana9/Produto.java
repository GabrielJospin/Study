import java.util.Random;

class Produto{

	int codigoProdutor;
	int codigoProduto;
	String nome;
	int setor;

	private static Random rand = new Random();
	private static int upperbound = 1000;
	
	Produto(int codigo, String nome){
		this.codigoProdutor = rand.nextInt(upperbound);
		this.codigoProduto = codigo;
		this.nome = nome;
		this.setor = -1;		
	}

	Produto(String nome){
		this.codigoProdutor = rand.nextInt(upperbound);
		this.codigoProduto = rand.nextInt(upperbound);
		this.nome = nome;
		this.setor = -1;
	}

	Produto(int codigo, String nome, int setor){
		this.codigoProdutor = rand.nextInt(upperbound);
		this.codigoProduto = codigo;
		this.nome = nome;
		this.setor = setor;
	}

	Produto(String nome, int setor){
		this.codigoProdutor = rand.nextInt(upperbound);
		this.codigoProduto = rand.nextInt(upperbound);
		this.nome = nome;
		this.setor = setor;
	}

	void print(){
		System.out.printf("\nProduto %s", nome);
		System.out.printf("\nCodigo de Barra: %04d", codigoProduto);
		System.out.printf("\nCodigo do Produtor: %04d", codigoProdutor);
		System.out.printf("\nSetor: %d", setor);
	}

}
