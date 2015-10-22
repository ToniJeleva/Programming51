package Candidate;

import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String startPoint = scanner.nextLine();
		String movement = scanner.nextLine();
		String[] directions = movement.split("");

		String[] points = startPoint.replaceAll("[(|)]", "").split(",");
		int current_x = Integer.parseInt(points[0]);
		int current_y = Integer.parseInt(points[1]);

		int multiplier = 1;
		for (int i = 0; i < directions.length; i++) {
			if (directions[i].equals("~")) {
				multiplier = multiplier * (-1);
			}
			if (directions[i].equals("<")) {
				current_x = current_x - 1 * multiplier;
			}
			if (directions[i].equals(">")) {
				current_x = current_x + 1 * multiplier;
			}

			if (directions[i].equals("^")) {
				current_y = current_y - 1 * multiplier;
			}
			if (directions[i].equals("v")) {
				current_y = current_y + 1 * multiplier;
			}

		}
		System.out.println("(" + current_x + "," + current_y + ")");
	}

}
