class Pessoa{
	String nome;
	char sexo;
	String Documento;
	int dia;
	int mes;
	int ano;

	Pessoa(String nome, char sexo, String documento, int dia, int mes, int ano){
		this.nome=nome;
		this.sexo=sexo;
		this.documento=documento;
		this.dia = dia;
		this.mes= mes;
		this.ano = ano;
	}


	Pessoa(String nome, String documento, int dia, int mes, int ano){
		this.nome=nome;
		this.sexo=' ';
		this.documento;this.dia = dia;
		this.mes= mes;
		this.ano = ano;
	}
	
}