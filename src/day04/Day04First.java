package day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day04First {

	public static void main(String[] args)
			throws FileNotFoundException, UnsupportedEncodingException, NoSuchAlgorithmException {
		File file = new File("src/day04/input");
		int i = 0;
		String input = null;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				input = sc.nextLine();
				for (i = 0; i < Integer.MAX_VALUE; i++) {
					if (MD5(input + String.valueOf(i)).substring(0, 6).contains("000000")) {
						break;
					}
				}
			}

			System.out.println("Solution: " + i);
		}

	}

	public static String MD5(String md5) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] array = md.digest(md5.getBytes());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; ++i) {
			sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();

	}

}
