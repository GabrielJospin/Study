class Ip{
	double ep1;
	double ep2;
	double ep3;
	double ep4;
	double rec;
	double media;
	String resultado;
	Ip(){
		System.out.println("Calculando para IP");
		double notas[] = new double[5];
		for (int i = 0; i<notas.length; i++){
			System.out.printf("Digite a nota %d, por favor: ", i);
			notas[i] = Main.input.nextDouble();
		}
		this.ep1 = notas[0];
		this.ep2 = notas[1];
		this.ep3 = notas[2];
		this.ep4 = notas[3];
		this.rec = notas[4];
		this.media = media();
		if (media>=5) this.resultado = "Aprovado";
		else this.resultado = "reprovado";
	}

	double media(){
		media = (ep1*2 + ep2*2+ ep3*2+ep4*3)/9;
		if (media<5 && media<rec && rec<5) media = rec;
		if (media<5 && media<rec) media = 5;
		return media;
	}

	void print(){
		System.out.printf("sua media sera de valor %5.2f, parabens voce foi %s", this.media, this.resultado);
	}
}