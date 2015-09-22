package week8;

import java.util.Scanner;

public class Lakes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String directions = scanner.nextLine();
		String[] landscape = directions.split("");
		double cubes = 0;
		int currentHeight = 0;
		for (int i = 0; i < landscape.length; i++) {
			if (landscape[i].equals("d")) {
				currentHeight++;
				if (currentHeight > 0)
					cubes = cubes + 0.5 + currentHeight - 1;
			}
			if (landscape[i].equals("h")) {
				if (currentHeight > 0)
					cubes = cubes + currentHeight;
			}
			if (landscape[i].equals("u")) {
				if (currentHeight > 0)
					cubes = cubes + 0.5 + currentHeight - 1;
				currentHeight--;
			}
		}
		Long L = Math.round(cubes * 1000);                //my:dddhhhuuhhuuuhdudddduu
		int i = Integer.valueOf(L.intValue());
		System.out.println(i);

	}
	
	
}
