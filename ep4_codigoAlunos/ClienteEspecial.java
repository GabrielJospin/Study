
public class ClienteEspecial extends Cliente{
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	/*Recebe o valor a ser pago, verifica se o Valor é um Natural e que estrapolará o limite, então
	* se adiciona muda-se a vaiável divida para o valor anterior + o valor do empréstimo
	*/
	public boolean obterEmprestimo(int valor) {
		int aux = getValorDaDivida();

		if(valor <=0 || dividaMaxima < (aux + valor)) return false;
		setValorDaDivida(aux+valor);
		return true;
		
	}
}
