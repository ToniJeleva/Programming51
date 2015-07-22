package week4zadachki;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class LilisLibrary {
	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
		Vector<Pair<String, Integer>> result = new Vector<Pair<String, Integer>>();

		for (int i = 0; i < books.size(); i++) {
			Pair<String, Integer> a = new Pair<String, Integer>();
			int br = 1;
			for (int j = i + 1; j < books.size(); j++) {
				if (books.get(i).equals(books.get(j)))
					br++;
			}

			a.first = books.get(i);
			a.second = br;
			boolean exists = false;
			for (int k = 0; k < result.size(); k++) {
				if (books.get(i).equals(result.get(k).first))
					exists = true;
			}

			if (!(exists))
				result.add(a);

			for (int m = 0; m < result.size() - 1; m++) {
				for (int j = m + 1; j < result.size(); j++) {
					if (result.get(m).first.compareTo(result.get(j).first) > 0) {
						Pair<String, Integer> temp = result.get(m);
						result.set(m, result.get(j));
						result.set(j, temp);
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<String> books = new Vector<String>();
		int booksCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < booksCount; i++) {
			books.add(scanner.nextLine());
		}

		Vector<Pair<String, Integer>> result = orderBooks(books);

		for (Pair<String, Integer> titleCount : result) {
			System.out.println(titleCount.first + " : " + titleCount.second);
		}
	}
}
