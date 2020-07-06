import java.util.Random;
class Sortedor{


	public static void main(String[] args) {
		Lista lista = Leitor.execute();
		Random random = new Random();
		int sort = random.nextInt(lista.tamanho);
		Pessoa pessoa = lista.pesquisa(sort);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.email);

	}
}