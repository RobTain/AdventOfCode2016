package day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day03First {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day03/input");
		
		int startLocation = 0;
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				char[] arrows = sc.nextLine().toCharArray();
				
				for (char c : arrows) {
					
				}
			}
			
			System.out.println("Solution: ");
		}
	}

}
