package week4zadachki;

import java.util.Scanner;

/*public class BirthdayRanges {
	public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays,
			Vector<Pair> some) {
		Vector<Integer> count = new Vector<Integer>();
		for (int i = 0; i < some.size(); i++) {
			int br = 0;
			for (int j = 0; j < birthdays.size(); j++) {
				if ((birthdays.get(j) >= some.get(i).start)
						&& (birthdays.get(j) <= some.get(i).end))
					br++;
			}
			count.add(br);
		}
		return count;
	}

	public static void main(String[] args) {
		Vector<Integer> birthdays = new Vector<Integer>();
		Vector<Pair> ranges = new Vector<Pair>();

		Scanner scanner = new Scanner(System.in);

		int bdaysCount = scanner.nextInt();

		for (int i = 0; i < bdaysCount; i++) {
			birthdays.add(scanner.nextInt());
		}

		int rangesCount = scanner.nextInt();

		for (int i = 0; i < rangesCount; i++) {
			Pair pair = new Pair();

			pair.start = scanner.nextInt();
			pair.end = scanner.nextInt();

			ranges.add(pair);
		}

		System.out.println("Result is:");
		Vector<Integer> result = birthdaysCount(birthdays, ranges);

		for (int count = 0; count < result.size(); count++) {
			System.out.print(result.get(count));
			System.out.print(", ");
		}
	}
}*/
