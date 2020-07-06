 class Ordem{


 	static void bolha(String[] arr){
 		int[] array = new int[arr.length];
 		
 		for(int i = 0; i<arr.length; i++){
 			array[i] = Integer.parseInt(arr[i]);
 		}
 		
 		int j;
 		int aux;
 		
 		for(int i = 0; i<arr.length; i++){
 			j = array.length;	
 			for(int k = 1; k<j; k++){
 			if(array[k-1]>array[k]){
 				aux = array[k-1];
 				array[k-1]=array[k];
 				array[k] = aux;
 				
 				}
 			}
 		}
 		for(int i =0; i<arr.length; i++){
 			arr[i]=String.valueOf(array[i]);
 		}

		for(int i=0; i<arr.length; i++){
 			System.out.print(array[i]+"\t");
 		}		
 	}

 

 	public static void main(String[] args) {
 		bolha(args);
 		
 	}
 }