package stringreversal;

import java.util.Scanner;

public class StringReversalApp {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = StringReverser.reverse(input);

        System.out.println("Reversed string: " + reversed);
    }
}
