class Teste{

	static final int NOT_FOUND = -1;

	static void ordena(Produto[] arr){
		int j;
		Produto aux;
		for(int i = 0; i<arr.length; i++){
 			j = arr.length;	
 			for(int k = 1; k<j; k++){
 			if(arr[k-1].codigoProduto<arr[k].codigoProduto){
 				aux = arr[k-1];
 				arr[k-1]=arr[k];
 				arr[k] = aux;
 				
 				}
 			}
 		}
	}


	static int busca(Produto[] arr, Produto p){
		int min = 0;
		int max = arr.length-1;
		int mid;

		while(min<=max){
			mid=(max+min);
			if(arr[mid].codigoProduto > p.codigoProduto){
				min=mid+1;
			}else if(arr[mid].codigoProduto < p.codigoProduto){
				max = mid - 1;
			}else{
				return mid;
			}
		}

		return NOT_FOUND;// NOT_FOUND = -1;
	}



	public static void main(String[] args) {
		Produto produto1 = new Produto(1,"arroz",1);
		Produto produto2 = new Produto(2,"feijao",1);
		Produto produto3 = new Produto(3,"carne",2);
		Produto produto4 = new Produto(4,"frango",2);
		Produto produto5 = new Produto(5,"queijo",3);
		Produto produto6 = new Produto(6,"leite",3);
		Produto produto7 = new Produto(10,"Iogurte",3);
		Produto[] banco = {produto1,produto2,produto3,produto4,produto5, produto6};

		ordena(banco);

		int i = busca(banco, produto3);

		if(i != NOT_FOUND)banco[i].print();
		else System.out.print("error, not found");

	}	

}