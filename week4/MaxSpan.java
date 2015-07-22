package week4zadachki;

import java.util.Scanner;

public class MaxSpan {

	public static int maxSpan(int[] numbers) {
		int maxSpan = 1;
		int localSpan = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					localSpan = j - i + 1;
					if (localSpan > maxSpan)
						maxSpan = localSpan;
				}
			}
		}

		return maxSpan;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println(maxSpan(numbers));
	}

}
