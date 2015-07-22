package week4zadachki;

import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class StringNormalizer {

	public static String normalizeString(String str) {
		String sth = "";
		String[] splited = str.split(" ");
		if (splited[0].compareTo(" ") != 0)
			sth+=splited[0].substring(0, 1).toUpperCase();
		//System.out.println(sth);
		for (int i = 1; i < splited.length; i++) {
			if (splited[i].compareTo(" ") != 0) {
				splited[i].toLowerCase();
			} else if (splited[i - 1].compareTo(" ") != 0) {
				sth+=splited[i];
			}
		}
		if (splited[splited.length - 1].compareTo(" ") != 0) {
			sth+=splited[splited.length - 1].substring(1).toLowerCase();
		}

		return sth;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		System.out.println(normalizeString(s));

	}

}
