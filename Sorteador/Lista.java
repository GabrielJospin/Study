class Lista{

	No cabeca;
	int tamanho=0;

	Lista(){
		this.cabeca = null;
	}

	void insere(Pessoa pessoa, int pos){
		No aux = new No (pessoa, pos);
		aux.prox = this.cabeca;
		this.cabeca = aux;
		tamanho ++;
	}

	Pessoa pesquisa(int pos){
		No ref;
		for(int i = 0; i<=tamanho+1; i++ ){
			ref=this.cabeca;
			for(int j = 0; j<tamanho; j++ ){
				if(pos == ref.pos){
					return ref.pessoa;						
				}
				ref = ref.prox;			
			}
		}
		return null;
	}
}