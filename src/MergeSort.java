import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, -1, 88, 0, 11, 5, 4, 6, 77 };
		System.out.println(Arrays.toString(array) + " original array");
		new MergeSort().sort(array);
		System.out.println(Arrays.toString(array)+ " sorted array");
	}

	private void sort(int[] array) {
		sort(array, 0, array.length - 1, new int[array.length]);
	}

	private void sort(int[] array, int indexBegin, int indexEnd, int[] tmp) {
		if (indexBegin < indexEnd){
			int mediumIndex = (indexBegin + indexEnd ) / 2;
			sort(array, indexBegin, mediumIndex, tmp);
			sort(array, mediumIndex+1, indexEnd, tmp);
			compareSwapArrays(array, indexBegin, indexEnd, mediumIndex, tmp);
		}
	}

//	private void compareSwapArrays(int[] array, int indexBegin, int indexEnd, int mediumIndex) {		
//		int indexLeft=indexBegin;
//		int indexRight=mediumIndex+1;
//		System.out.println(Arrays.toString(Arrays.copyOfRange(array, indexBegin, indexEnd+1)) + " compareSwapArrays");
//		int[] tmp=Arrays.copyOf(array, array.length);
//		
//		while (indexLeft<=indexRight && indexRight<=indexEnd) {
//			if (array[indexLeft] > array[indexRight]) {
//				System.out.println(Arrays.toString(Arrays.copyOfRange(tmp, indexBegin, indexEnd+1)) + " " + array[ indexRight] + " will be putted before " + array[indexLeft]);
//				putBefore(tmp, indexLeft, indexRight);
//				System.out.println(Arrays.toString(Arrays.copyOfRange(tmp, indexBegin, indexEnd+1)) );
//				indexRight++;
//			}else{
//				System.out.println(array[indexLeft] + " <= " + array[indexRight] + " do nothing..");
//				indexLeft++;
//			}
//		}
//		System.arraycopy(tmp, indexBegin, array, indexBegin, indexEnd-indexBegin+1);
//		
//	}
//
//	private void putBefore(int[] array, int indxFirst, int indxSecond) {
//		int temp = array[indxFirst];
//		array[indxFirst] = array[indxSecond];
//		for (int i = indxSecond; i > indxFirst; i--) {
//			array[i] = array[i - 1];
//		}
//		array[indxFirst + 1] = temp;
//	}
	
	private void compareSwapArrays(int[] array, int leftStart, int rightEnd, int mediumIndex, int[] tmp) {		
		int left=leftStart;
		int leftEnd=mediumIndex;
		
		int right=mediumIndex+1;
		int index=leftStart;
		while (left <= leftEnd && right <= rightEnd) {
			if (array[left] < array[right]) {
				tmp[index]=array[left];
				left++;
			}else{
				tmp[index]=array[right];
				right++;
			}
			index++;
		}
		System.arraycopy(array, left, tmp, index, leftEnd-left+1);   		// either left or right pointer is at the end.
		System.arraycopy(array, right, tmp, index, rightEnd-right+1);		// so only one of these lines will have an effect
		
		System.arraycopy(tmp, leftStart, array, leftStart, rightEnd-leftStart+1);   // replace all original records with ordered ones
	}

}
