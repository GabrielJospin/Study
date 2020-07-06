class TestePesssoalGabriel{

	public static void testarCliente(){
		Cliente bonoro = new ClienteEspecial("Bolsonaro", 6661738, 17000);
		System.out.println("Teste Emprestimo");
		if(bonoro.obterEmprestimo(100)) System.out.print("Passo 1 OK\t");
		if(bonoro.obterEmprestimo(40000)) System.out.print("Passo 2 OK\t");
		if(!bonoro.obterEmprestimo(10000000)) System.out.print("Passo 3 OK \n");
		System.out.println("Teste pagamento");
		if(bonoro.pagarEmprestimo(100)) System.out.print("Passo 1 OK\t");
		if(!bonoro.pagarEmprestimo(0)) System.out.print("Passo 2 OK\t");
		if(bonoro.pagarEmprestimo(300)) System.out.print("Passo 3 OK\n");
		System.out.println("Teste saque");
		if(bonoro.realizarSaque(100)) System.out.print("Passo 1 OK\t");
		if(!bonoro.realizarSaque(0)) System.out.print("Passo 2 OK\t");
		if(!bonoro.realizarSaque(18000)) System.out.print("Passo 3 OK\n");
		System.out.println("\n Teste de Persona \n");
		System.out.printf("Nome: %s \nCPF: %d \nConta Corrente: %d\n Divida: %d\n ", bonoro.nome, bonoro.cpf, bonoro.getValorContaCorrente(), bonoro.getValorDaDivida());

	}

	public static void testarGerente(){
		Gerente adm = new Gerente("Colagenadah", 6661738);
		
		Cliente bonoro = new ClienteEspecial("Bolsonaro", 6661738, 17000);
		bonoro.obterEmprestimo(30000);
		Cliente prezado = new Cliente("Sergio Moro", 5555555, 19000);
		prezado.obterEmprestimo(30000);
		Cliente quatroDedos = new ClienteEspecial("Lula", 131313, 13000);
		quatroDedos.obterEmprestimo(30000);
		Cliente robson = new Cliente("Robson", 1713105, 0);
		robson.obterEmprestimo(30000);

		System.out.println("Testando adicionar clientes");
		if(adm.adicionarCliente(bonoro)) System.out.print("Cliente 1 ok \t");
		if(adm.adicionarCliente(prezado)) System.out.print("Cliente 2 ok \t");
		if(adm.adicionarCliente(quatroDedos)) System.out.print("Cliente 3 ok \t");
		if(adm.adicionarCliente(robson)) System.out.print("Cliente 4 ok \n");

		System.out.println("Testando Cobrar Emprestimo");
		adm.cobrarTodosEmprestimos();

		adm.imprimirClientes();
	}

	public static void testarBanco(){
		Banco itau = new Banco();
		
		Gerente adm = new Gerente("Colagenadah", 5656565);
		Gerente xuxa = new Gerente("Xuxa", 6661738);
		
		Cliente bonoro = new ClienteEspecial("Bolsonaro", 6661738, 17000);
		bonoro.obterEmprestimo(30000);
		adm.adicionarCliente(bonoro);
		
		Cliente prezado = new Cliente("Sergio", 5555555, 19000);
		prezado.obterEmprestimo(30000);
		xuxa.adicionarCliente(prezado);
		
		Cliente quatroDedos = new ClienteEspecial("Lula", 131313, 13000);
		quatroDedos.obterEmprestimo(30000);
		adm.adicionarCliente(quatroDedos);
		
		Cliente robson = new Cliente("Robson", 1713105, 0);
		robson.obterEmprestimo(30000);
		xuxa.adicionarCliente(robson);

		itau.adicionarGerente(xuxa);
		itau.adicionarGerente(adm);

		itau.imprimir();




	}

	public static void main(String[] args) {
		testarCliente();
		testarGerente();
		testarBanco();
	}
}
