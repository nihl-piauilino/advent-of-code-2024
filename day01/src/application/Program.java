package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Workspace\\Java\\advent-of-code\\day01\\resources\\input.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String input = scan.nextLine();
				System.out.println(input);
			}
			scan.close();
		} catch(FileNotFoundException error) {
			System.out.println("Error while reading file.");
			error.printStackTrace();
		}
	}

}
