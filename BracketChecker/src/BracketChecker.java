package bracketchecker;

import java.util.*;

public class BracketChecker {
	private String input; // input string
    private StackX stack; // stack for delimiter storage

    public BracketChecker(String in) {
        input = in; // save the input string
        stack = new StackX(in.length()); // create stack with the same size as the input string
    }

 
    public boolean check() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
            case '{':
            case '[':
            case '(':
                stack.push(ch); // push left delimiters onto stack
                break;
            case '}':
            case ']':
            case ')':
                if (stack.isEmpty()) {
                    System.out.println("Error: " + ch + " at index " + i);
                    return false;
                } else {
                    char chx = (char)stack.pop(); // pop and check the top of stack for correct right delimiter
                    if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                        System.out.println("Error: " + ch + " at index " + i + " instead of " + chx);
                        return false;
                    }
                }
                break;
            default:
                // do nothing for non-delimiter characters
                break;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter to match left delimiter");
            return false;
        } else {
            System.out.println("The delimiters are all correct. There were no errors.");
            return true;
        }
    }
}
