package week7;

import java.util.Scanner;
import java.util.Stack;

public class Parser {

	public static int evaluate(String formula, int x) {
		String[] functions = formula.split(" \\. ");
		;
		Stack<String> result = new Stack<>();
		for (int i = 0; i < functions.length; i++) {
			result.push(functions[i]);
		}
		
		while (!result.isEmpty()) {
			if (result.peek().equals("f1")) {
				result.pop();
				x = f1(x);
			}
			if ((!result.empty()) && (result.peek().equals("f2"))) {
				result.pop();
				x = f2(x);
			}
			if ((!result.empty()) && (result.peek().equals("f3"))) {
				result.pop();
				x = f3(x);
			}
			if ((!result.empty()) && (result.peek().equals("f4"))) {
				result.pop();
				x = f4(x);
			}
		}
		return x;
	}

	public static int f1(int x) {
		x = f2(x) + f3(x);
		return x;
	}

	public static int f2(int x) {
		x = x * 2;
		return x;
	}

	public static int f3(int x) {
		x = x + 1;
		return x;
	}

	public static int f4(int x) {
		x = 2 * f1(x);
		return x;
	}

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    int x = scanner.nextInt();

    System.out.println(evaluate(input, x));
    
    

  }

}
