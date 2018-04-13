import java.util.Arrays;


public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, -1, 88, 0, 11, 5, 4, 6, 77 };
		System.out.println(Arrays.toString(array) + " original array");
		new InsertionSort().sort(array);
		System.out.println(Arrays.toString(array)+ " sorted array");
	}

	private void sort(int[] array) {
		for (int i=1; i<array.length+1; i++) {
			for (int j=i-1; j>0; j--) {
				if(array[j-1]>array[j]){
					swap(array, j, j-1);
				}else{
					break;
				}
				
			}
		}
	}
	
	private void swap(int[] array, int indxFirst, int indxSecond){
		int temp = array[indxFirst];
		array[indxFirst] = array[indxSecond];
		array[indxSecond] = temp;
	}
}
