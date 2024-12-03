package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import services.CheckIfSafeService;

public class Program {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Workspace\\Java\\advent-of-code\\day02\\resources\\input.txt");
			Scanner scan = new Scanner(file);
			
			int safeCounter = 0;
			
			while(scan.hasNextLine()) {
				String report = scan.nextLine();
				String[] levels = report.split(" ");
				
				int[] intLevels = new int[levels.length];
				for(int i = 0; i < levels.length; i++) {
					intLevels[i] = Integer.parseInt(levels[i]);
				}
				
//				for(int i = 0; i < intLevels.length; i++) {
//					System.out.print(intLevels[i] + " ");
//				}
//				System.out.println();
				
				if(CheckIfSafeService.checkIfSafe(intLevels)) {
					safeCounter++;
				} else if(CheckIfSafeService.dampener(intLevels)) {
					safeCounter++;
				}
				
			}
			
			System.out.println("Safe reports: " + safeCounter);
			
			scan.close();
		} catch(FileNotFoundException error) {
			System.out.println("Error while reading file.");
			error.printStackTrace();
		}
	}

}
