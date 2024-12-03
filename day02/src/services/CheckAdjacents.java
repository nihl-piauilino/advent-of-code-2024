package services;

public class CheckAdjacents {

	public static boolean checkAdjacents(int[] array) {
		
		// Again, doesn't hurt
		if(array.length <= 1) {
			return true;
		}
		
		for(int i = 1; i < array.length; i++) {
			if((array[i] < array[i-1] + 1 && array[i] > array[i-1] - 1) || (array[i] > array[i-1] + 3) || (array[i] < array[i-1] - 3)) {
				return false;
			}
		}
		
		return true;
	}
}
