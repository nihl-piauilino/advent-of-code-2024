package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Workspace\\Java\\advent-of-code\\day01\\resources\\input.txt");
			Scanner scan = new Scanner(file);
			
			List<Integer> leftList = new ArrayList<Integer>();
			List<Integer> rightList = new ArrayList<Integer>();
			
			int totalDistance = 0;
			
			while(scan.hasNextLine()) {
				String input = scan.nextLine();
				
				String regex = "   ";
				String[] distances = input.split(regex);
				
				leftList.add(Integer.parseInt(distances[0]));
				rightList.add(Integer.parseInt(distances[1]));
			}
			
			Collections.sort(leftList);
			Collections.sort(rightList);
			
			// This part of the code was taken from
			// https://stackoverflow.com/questions/960431/how-can-i-convert-listinteger-to-int-in-java
			// I understood what happened here, but I'm not happy with this code, so I intend to
			// return here and think a better solution. I don't know if there is one, though.
			
			int[] leftCoord = leftList.stream().mapToInt(Integer::intValue).toArray();
			int[] rightCoord = rightList.stream().mapToInt(Integer::intValue).toArray();
			
			// End of the part taken from StackOverFlow
			
			for(int i = 0; i < leftCoord.length; i++) {
				int distance = leftCoord[i] - rightCoord[i];
				if(distance < 0) {
					distance *= -1;
				}
				totalDistance += distance;
			}
			
			System.out.println(totalDistance);
			
			int similarity = 0;
			for(int i : leftCoord) {
				int aux = 0;
				for (int j : rightCoord) {
					if(i == j) {
						aux++;
					}
				}
				
				similarity += (i * aux);
			}
			System.out.println(similarity);
			
			scan.close();
		} catch(FileNotFoundException error) {
			System.out.println("Error while reading file.");
			error.printStackTrace();
		}
	}

}
