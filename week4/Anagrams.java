package week4zadachki;

import java.util.Vector;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

	public static boolean areAnagrams(String a, String b) {
		boolean check = true;
		String a1 = a.toLowerCase();
		String b1 = b.toLowerCase();
		String[] first = a1.split("");
		String[] second = b1.split("");

		if (first.length != second.length)
			check = false;

		Arrays.sort(first);
		Arrays.sort(second);

		for (int i = 0; i < first.length; i++) {
			if (!(first[i].equals(second[i]))) {
				check = false;
				break;
			}
		}

		return check;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
}
