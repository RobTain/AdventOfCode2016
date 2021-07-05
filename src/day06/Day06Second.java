package day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day06Second {

	public static void main(String[] args)
			throws FileNotFoundException, UnsupportedEncodingException, NoSuchAlgorithmException {
		File file = new File("src/day06/input");

		// initialize grid
		Integer[][] grid = new Integer[1000][1000];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = 0;
			}
		}

		long brightness = 0;
		boolean light = false;
		int xStart, yStart, xEnd, yEnd;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				String[] input = sc.nextLine().split(" ");

				// turn on or off
				if (input[0].equals("turn")) {
					if (input[1].equals("on")) {
						light = true;
					}
					xStart = Integer.parseInt(input[2].split(",")[0]);
					yStart = Integer.parseInt(input[2].split(",")[1]);
					xEnd = Integer.parseInt(input[4].split(",")[0]);
					yEnd = Integer.parseInt(input[4].split(",")[1]);
					for (int i = xStart; i <= xEnd; i++) {
						for (int j = yStart; j <= yEnd; j++) {
							if (light) {
								grid[i][j]++;
							} else {
								if (grid[i][j] > 0) {
									grid[i][j]--;
								}
							}
						}
					}
				} else {

					// toggle
					xStart = Integer.parseInt(input[1].split(",")[0]);
					yStart = Integer.parseInt(input[1].split(",")[1]);
					xEnd = Integer.parseInt(input[3].split(",")[0]);
					yEnd = Integer.parseInt(input[3].split(",")[1]);

					for (int i = xStart; i <= xEnd; i++) {
						for (int j = yStart; j <= yEnd; j++) {
							grid[i][j] = grid[i][j] + 2;
						}
					}
				}

				light = false;
			}

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					brightness += grid[i][j];
				}
			}
		}

		System.out.println("Solution: " + brightness);
	}

}
