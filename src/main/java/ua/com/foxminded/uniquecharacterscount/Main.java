package ua.com.foxminded.uniquecharacterscount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CharCounter charCounter = new CharCounter();
		boolean keepOn = true;
		Scanner scanner = new Scanner(System.in);

		while (keepOn) {
			System.out.println("Enter string, or q to quit: ");
			String string = scanner.nextLine();
			if (!string.equals("q")) {
				System.out.println("Unique characters count: " + charCounter.getCharCount(string));
			} else {
				keepOn = false;
			}
		}
		scanner.close();

	}
}
