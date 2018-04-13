import java.util.Arrays;


public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, -1, 88, 0, 11, 5, 4, 6, 77 };
		System.out.println(Arrays.toString(array) + " original array");
		new SelectionSort().sort(array);
		System.out.println(Arrays.toString(array)+ " sorted array");
	}

	private void sort(int[] array) {
		int minValueIndex,newMinValueIndex,minValue;
		for (int i = 0; i < array.length; i++) {
			minValueIndex=i;
			newMinValueIndex=i;
			minValue=array[i];
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < minValue){
					minValue=array[j];
					newMinValueIndex=j;
				}
			}
			if(minValueIndex!=newMinValueIndex){
				swap(array, minValueIndex, newMinValueIndex);
			}
		}
	}
	
	private void swap(int[] array, int indxFirst, int indxSecond){
		int temp = array[indxFirst];
		array[indxFirst] = array[indxSecond];
		array[indxSecond] = temp;
	}
}
