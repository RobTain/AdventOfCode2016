package day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day05First {

	public static void main(String[] args)
			throws FileNotFoundException, UnsupportedEncodingException, NoSuchAlgorithmException {
		File file = new File("src/day05/input");
		int solution = 0;
		char[] input;
		boolean vowels, twice, filter;
		
		vowels = twice = filter = false;
		int count = 0;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				input = sc.nextLine().toCharArray();
				for (int j = 0; j < input.length; j++) {
					if (input[j] == 'a' || input[j] == 'e' || input[j] == 'i' || input[j] == 'o' || input[j] == 'u') {
						count++;
						if (count == 3) {
							vowels = true;
						}
					}
					
					if (j + 1 < input.length) {
						if (input[j] == input[j+1]) {
							twice = true;
						}
						
						if (input[j] == 'a' && input[j+1] == 'b') {
							filter = true;
						}
						
						if (input[j] == 'c' && input[j+1] == 'd') {
							filter = true;
						}
						
						if (input[j] == 'p' && input[j+1] == 'q') {
							filter = true;
						}
						
						if (input[j] == 'x' && input[j+1] == 'y') {
							filter = true;
						}
					}
				}
				
				if (vowels && twice && !filter) {
					solution++;
				}
				
				count = 0;
				vowels = twice = filter = false;
			}

			System.out.println("Solution: " + solution);
		}

	}


}
