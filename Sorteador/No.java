class No{
	Pessoa pessoa;
	int pos;
	No prox;

	No(Pessoa pessoa, int i){
		this.pessoa = pessoa;
		this.pos = i;
		this.prox = null;
	} 
}