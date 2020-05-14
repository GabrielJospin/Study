/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <2020102> - <Prof. Dr. Luciano Antonio Digiampietri>          **/
/**                                                                 **/
/**   Terceiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <Gabriel Medeiros Jospin>                   <11796020>        **/
/**                                                                 **/
/**   <04.03.2020>                                                  **/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
    0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';
	static int idLinha[] = new int[3];
	static int idColuna[] = new int[3];
	static int idDiagonal[] = new int[2];

	/*
		Determina o status de uma partida de Jogo da Valha
		
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma partida valida de Jogo da Velha
			
		Saída:
			um inteiro contendo o status da partida (valores válidos de zero a quatro)
	
		Como determinar as matriz
		g |	d |	e | f |
		a |   |   |   |
		b |   |   |   |
		c |   |   |   |
		h

		a, b e c são os resultados parciais de cada LINHA formando idLinha[a,b,c]
		d, e e f são os resultados parciais de cada COLUNA formando idColuna[d,e,f]
		   g e h são os resultados pariais de cada DIAGONAL formando idDiagonal [g,h]
	
	*/

	static int verificaTrecho(char[] trecho){
		//le cada elemento da linha, coluna ou Diagonal e responde o id daquele elemento
		if ((trecho[0]==trecho[1]) && (trecho[1]==trecho[2]) && (trecho[2]==espacoVazio)){
			return 0;
		}else if ((trecho[0]==trecho[1]) && (trecho[1]==trecho[2]) && (trecho[2]==pecaX)){
			return 1;
		}else if ((trecho[0]==trecho[1]) && (trecho[1]==trecho[2]) && (trecho[2]==pecaY)){
			return 2;
		}else if ((trecho[0]== espacoVazio ) || (trecho[1]== espacoVazio ) || (trecho[2]==espacoVazio)){
			return 4;
		}else{
			return 3;
		}

	}

	static void geradorDeId(char[][] tabuleiro){
		//gera os ids de cada
		char linha[] = new char[3];
		char coluna[] = new char[3];
		char diagonal[] = new char[3];
			// gera os id da linha
		for(int j = 0; j < 3; j++){

			for (int i = 0; i<3; i++) linha[i] = tabuleiro[i][j];

			idLinha[j] = verificaTrecho(linha);
			
		}
		//gera os id das coluna
		for (int i = 0;i<3 ;i ++) {

			for (int j = 0; j<3; j++) coluna[j] = tabuleiro[i][j];
			
			idColuna[i] = verificaTrecho(coluna);
		}

		//gera o idDiagonal[0]
		for(int i = 0; i<3; i++)diagonal[i] = tabuleiro[i][i];
		idDiagonal[0] = verificaTrecho(diagonal);

		//gera o idDiagonal[1]
		for (int i = 0; i<3; i++)diagonal[i] = tabuleiro[i][2-i];
		idDiagonal[1] = verificaTrecho(diagonal);

				
	}




	static int verificaStatus(char[][] tabuleiro) {
		int status = -1;
		// ler a matriz e gerar as respostas para elas
		geradorDeId(tabuleiro);
		//verifica se a Tabela não estava vazia
		if(idLinha[0]==idLinha[1]&&idLinha[1]==idLinha[2]&&idLinha[2]==0)return	0;

		//Percorre a linha e verifica se há um ganhador, ou de esta incompleto	
		for (int l = 0; l<idLinha.length; l++){
			if (idLinha[l] == 1){
				return status = 1;
			}else if (idLinha[l]==2){
				return status =2;
			}else if (idLinha[l]==4){
				status =4;
				break;
			}
		}
		//lê a coluna e verifica se há um ganhador, ou esta incompleto
		for (int c = 0; c<idColuna.length; c++){
			if (idColuna[c] == 1){
				return status=1;
			}else if(idColuna[c]==2){
				return status = 2;
			}else if (idColuna[c]==4){
				status = 4;
				break;
			}
		}

		//lê a diagonal e vê se há um ganhador, ou se esta incompleta
		for(int d = 0; d<idDiagonal.length; d++){
			if (idDiagonal[d] == 1){
				return status=1;
			}else if(idDiagonal[d]==2){
				return status = 2;
			}else if (idDiagonal[d]==4){
				status = 4;
				break;
			}
		}
		//se não ocorreu nada é pq deu velha 
		if (status == -1) status =3;

		return status;
	}
	
	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		char[][] tab0 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		char[][] tab1 = {{'X','X','X'},{'O','O',' '},{' ',' ',' '}};
		char[][] tab2 = {{'O','X','X'},{'X','O','O'},{' ',' ','O'}};
		char[][] tab3 = {{'O','X','X'},{'X','O','O'},{'O','X','X'}};
		char[][] tab4 = {{' ',' ',' '},{'X','O','X'},{' ',' ',' '}};

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 1\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 2\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro3: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
		

	}
}
