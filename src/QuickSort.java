import java.util.Arrays;
import java.util.Random;


public class QuickSort {
	
	public void sort(int[] array){
		sort(array, 0, array.length-1);
	}
	
	private void sort(int[] array, int indexLow, int indexHigh){
		if(indexLow<indexHigh) {
			int border = partition(array, indexLow, indexHigh);
			sort(array, indexLow, border-1);
			sort(array, border+1, indexHigh);
		}
	}
	
	private int partition(int[] array, int indexLow, int indexHigh){
		System.out.println(Arrays.toString(array));
		int randomPivotIndex = getRandomPivotIndex(indexLow, indexHigh);
		System.out.println("pivot=" + array[randomPivotIndex]);
		//swap pivot.. put it to end of the array..
		System.out.println("swap pivot.. put it to end of array..");
		swap(array, randomPivotIndex, indexHigh);
		System.out.println(Arrays.toString(array));
		int pivotValue=array[indexHigh];
		
		int border=-1+indexLow;
		for (int i=indexLow; i < indexHigh; i++) {
			System.out.println("loop "+(i+1));
			 if(array[i]<pivotValue){
				 System.out.println("found smaller than pivot. it is "+array[i]);
				 border++;
				 swap(array, border, i);
				 System.out.println(Arrays.toString(array));
			 }
		}
		
		//swap pivot.. put it to end of the small values.. i called it as "border"..
		System.out.println("swap pivot.. put it to end of the small values.. i called it as \"border\"..");
		swap(array, border+1, indexHigh);
		System.out.println(Arrays.toString(array));
		border++;
		return border;
	}
	
	
	private void swap(int[] array, int indxFirst, int indxSecond){
		int temp = array[indxFirst];
		array[indxFirst] = array[indxSecond];
		array[indxSecond] = temp;
	}
	
	private int getRandomPivotIndex(int indexLow, int indexHigh){
		Random rnd = new Random();
		int indx = rnd.nextInt(indexHigh-indexLow)+indexLow;
		return indx;
	}
	
	public static void main(String[] args) {
		int[] array = {1,9,-1,88,0,11,5,4,6,77};
		new QuickSort().sort(array);
		System.out.println(Arrays.toString(array));
	}

}
