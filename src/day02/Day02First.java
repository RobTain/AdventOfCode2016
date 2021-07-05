package day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day02First {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day02/input");
		int ribbon = 0;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				int[] line = Arrays.stream(sc.nextLine().split("x")).mapToInt(Integer::parseInt).toArray();  
				if (line.length == 3) {
					ribbon += line[0] * line[1] * line[2];
					int min = Math.min(Math.min(line[0], line[1]), line[2]);	
					
					if (line[0] == min) {
						ribbon += 2 * min + 2 * Math.min(line[1], line[2]);
					} else if (line[1] == min) {
						ribbon += 2 * min + 2 * Math.min(line[0], line[2]);
					} else {
						ribbon += 2 * min + 2 * Math.min(line[0], line[1]);
					}
					
				}
			}
			
			System.out.println("Solution: " + ribbon);
		}
	}

}
