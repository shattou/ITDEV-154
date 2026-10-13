package bracketchecker;

import java.util.Scanner;

public class BracketCheckerApp {
	public static void main(String[] args) {
		boolean flag = true;
		String input;
		Scanner keyboard = new Scanner(System.in);
		while (flag) {
			System.out.print("Enter string containing delimiters: ");

			input = keyboard.nextLine(); // read a string from kbd
			if (input.equals("")) // quit if [Enter]
				flag = false;

			else {
				BracketChecker theChecker = new BracketChecker(input); // make a BracketChecker
				theChecker.check();
			}
		} // end while
	}
}
