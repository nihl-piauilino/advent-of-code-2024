package services;

public class CheckIfSafeService {

	public static boolean checkIfSafe(int[] array) {
		
		if((CheckIfSortedService.checkIfAscend(array) || CheckIfSortedService.checkIfDescend(array)) && CheckAdjacents.checkAdjacents(array)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean dampener(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			int[] newArray = new int[array.length - 1];
			int aux = 0;
			for(int j = 0; j < newArray.length; j++) {
				if(j == i) {
					aux++;
				}
				newArray[j] = array[j + aux];
			}
			if(CheckIfSafeService.checkIfSafe(newArray)) {
				return true;
			}
			
		}
		
		return false;
	}
}
