package day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day02Second {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day02/input");
		int wrappingPaper = 0;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				int[] line = Arrays.stream(sc.nextLine().split("x")).mapToInt(Integer::parseInt).toArray();  
				if (line.length == 3) {
					wrappingPaper += 2 * line[0] * line[1] + 2 * line[1] * line[2] + 2 * line[0] * line[2];
					wrappingPaper += Math.min(Math.min(line[0] * line[1], line[1] * line[2]), line[0] * line[2]);
				}
			}
			
			System.out.println("Solution: " + wrappingPaper);
		}
	}

}
