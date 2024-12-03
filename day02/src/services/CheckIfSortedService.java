package services;

public class CheckIfSortedService {

	public static boolean checkIfAscend(int[] array) {
		
		// Doesn't hurt to be preventive
		if(array.length <= 1) {
			return true;
		}
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i - 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkIfDescend(int[] array) {
		
		if(array.length <= 1) {
			return true;
		}
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i - 1]) {
				return false;
			}
		}
		
		return true;
	}
}
