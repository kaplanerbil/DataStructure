import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		char[] array = { 'a', 'c', 'd', 'e', 'f', 'h', 'k', 'l', 'r', 't', 'u', 'w' };
		System.out.println(Arrays.toString(array) + " original array");
		int index = new BinarySearch().find(array, 'w');
		System.out.println("index=" + index);
	}

	private int find(char[] array, char c) {
		return find(array, 0, array.length - 1, c);
	}

	private int find(char[] array, int startIndex, int endIndex, char c) {
		if (startIndex <= endIndex) {
			int mediumIndx = (startIndex + endIndex) / 2;
			if (array[mediumIndx] == c) {
				return mediumIndx;
			} else if (array[mediumIndx] < c) {
				return find(array, mediumIndx + 1, endIndex, c);
			} else { // if(array[mediumIndx]>c){
				return find(array, startIndex, mediumIndx - 1, c);
			}
		}
		return -1;
	}
}
