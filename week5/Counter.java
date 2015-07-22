package week5;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String searched = scanner.next();
		StringBuilder toreverse = new StringBuilder(searched);
		char[] word = searched.toCharArray();
		char[][] map;
		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		map = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.next().charAt(0);
			}
		}

		int br = 0;
		if (word.length == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == word[0])
						br++;
					
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == word[0]) {
						int tempi = i;
						int tempj = j;
						if (left(tempi, tempj, map, n, m, word, 0)){
							br++;
							System.out.println(i+" "+j);
						}
						if (right(tempi, tempj, map, n, m, word, 0)){
							br++;
							System.out.println(i+" "+j);
						}
						if (up(tempi, tempj, map, n, m, word, 0))
							br++;
						if (down(tempi, tempj, map, n, m, word, 0))
							br++;
						if (digUp(tempi, tempj, map, n, m, word, 0))
							br++;
						if (digDown(tempi, tempj, map, n, m, word, 0))
							br++;
						if (secDigUp(tempi, tempj, map, n, m, word, 0))
							br++;
						if (secDigDown(tempi, tempj, map, n, m, word,0))
							br++;
					}
				}
			}

			if (searched.equals(toreverse.reverse().toString()))
				br = br/2;
			}
		System.out.println(br);
				
	}

	public static boolean right(int tempi, int tempj, char[][] arr, int rows,
			int cols, char[] word, int counter) {
		if (counter == word.length) {
       System.out.println("right");
			return true;
		}
		if (tempj < cols) {
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return right(tempi, tempj + 1, arr, rows, cols, word, counter);
		}
		return false;
	}

	public static boolean left(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
			System.out.println("left");
			
			return true;
		}
		if (tempj > 0) {
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
				
			}System.out.println(counter);
			return left(tempi, tempj - 1, arr,rows,cols, word, counter);
		}
		return false;
	}

	public static boolean up(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
				return true;
		}
		if (tempi >= 0) {
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return up(tempi - 1, tempj, arr,rows,cols, word, counter);
		}
		return false;
	}

	public static boolean down(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
			return true;
		}
		if (tempi < rows) {
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return down(tempi + 1, tempj, arr,rows,cols, word, counter);
		}
		return false;
	}

	public static boolean digDown(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
				return true;
		}
		if ((tempj < cols) && (tempi < rows)) { // rows
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return digDown(tempi + 1, tempj + 1, arr,rows,cols, word, counter);
		}
		return false;
	}

	public static boolean digUp(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
			return true;
		}
		if ((tempj > 0) && (tempi > 0)) { // rows
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return digUp(tempi - 1, tempj - 1, arr,rows,cols, word, counter);
		}
		return false;
	}

	public static boolean secDigUp(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
			return true;
		}
		if ((tempj < cols) && (tempi > 0)) { 
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return secDigUp(tempi - 1, tempj + 1, arr, rows,cols,word, counter);
		}
		return false;
	}

	public static boolean secDigDown(int tempi, int tempj, char[][] arr, int rows,int cols,char[] word,
			int counter) {
		if (counter == word.length) {
						return true;
		}
		if ((tempj > 0) && (tempi < rows)) { // rows
			if (arr[tempi][tempj] == word[counter]) {
				counter++;
			}
			return secDigDown(tempi + 1, tempj - 1, arr,rows,cols, word, counter);
		}
		return false;
	}

}
