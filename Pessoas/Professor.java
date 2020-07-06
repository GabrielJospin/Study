class Professor extends Pessoa{ 
	
	String departamento;
	int anoDeAdmissao;
	String formacao;
	String instituicao;
	String text;


	Professor(String nome, String email,int idade,String departamento, int anoDeAdmissao, String formacao, String instituicao){
		super(nome, email, idade);
		this.departamento = departamento;
		this.anoDeAdmissao = anoDeAdmissao;
		this.formacao = formacao;
		this.instituicao = instituicao;
	}

	String print(){
		
		this.text = String.format("\nNome: %s \nCargo: %s \nDepartamnto: %s \nIdade: %d \nFormado em %s na %s\n",super.nome,"Professor",  departamento, super.idade, formacao, instituicao);
		return text;
	}


}