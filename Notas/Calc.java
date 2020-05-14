class Calc{
	double provaI;
	double provaII;
	double rec;
	double media;
	String resultado;


	Calc (){
		System.out.println("Calculando para Calc");
		double notas[] = new double[3];
		for (int i = 0; i<notas.length; i++){
			System.out.printf("Digite a nota %d, por favor: ", i);
			notas[i] = Main.input.nextDouble();
		}
		this.provaI = notas[0];
		this.provaII = notas[1];
		this.rec = notas[2];
		this.media = media();
		if (media>=5) resultado = "Aprovado";
		else resultado = "reprovado";
	}

	double media(){
		double media = provaI*0.4 + provaII*0.6;
		if(media<5 && media<rec && rec<=5) media = rec;
		else if(media<5 && media<rec) media = 5;
		return media;
	}

	void print(){
		System.out.printf("sua media sera de valor %5.2f, parabens voce foi %s", this.media, this.resultado);
	}
	

	
}
