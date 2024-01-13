package Arrays;

public class Multidimensional {
	public static void main(String[] args) {
		
		// CRIANDO OS ARRAYS MULTIDIMENSIONAIS
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("valor do array1:");
		outputArray(array1); // EXIBE O ARRAY1 LINHA POR LINHA 
		
		System.out.println("valor do array2:");
		outputArray(array2); // EXIBE O ARRAY 2 LINHA POR LINHA
		
	}
	
	
	public static void outputArray(int[][] array) {
		// FAZ UM LOOP PELAS LINHAS DO ARRAY
		for(int row = 0; row < array.length; row++) {
			// FAZ UM LOOP PELAS COLUNAS DO ARRAY
			for(int column = 0; column < array[row].length; column++) {
				System.out.printf("%d ", array[row][column]);
			}
			System.out.println();
		}
	}
}
