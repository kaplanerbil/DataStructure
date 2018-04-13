import java.util.Arrays;


public class BubbleSort {

	
	public static void main(String[] args) {
		int[] array = {1,9,6,5,4,11};
		new BubbleSort().sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	private void sort(int[] array) {
		boolean ordered =true;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1]){
				swap(array, i, i+1);
				ordered=false;
			}
		}
		if(!ordered){
			sort(array);
		}
		
	}
	
	private void swap(int[] array, int indxFirst, int indxSecond){
		int temp = array[indxFirst];
		array[indxFirst] = array[indxSecond];
		array[indxSecond] = temp;
	}
	
}
