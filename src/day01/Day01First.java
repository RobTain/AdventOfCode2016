package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day01First {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day01/input");
		try (Scanner sc = new Scanner(file)) {
			int floor = 0;
			while (sc.hasNextLine()) {
				char[] input = sc.nextLine().toCharArray();
				for (char c : input) {
					if (c == '(') { floor++; } else { floor--; };
				}
			}
			
			System.out.println("Solution: " + floor);
		}
	}

}
