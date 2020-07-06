abstract class  Pessoa{
	String nome;
	String email;
	int idade;


	Pessoa(String nome, String email, int idade){
		this.nome = nome;
		this.email = email;
		this.idade=idade;
	}

	abstract String print();
}
