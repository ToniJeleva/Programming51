package week4zadachki;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class MissingStudents {
	public static class MissingStudent {

		public static Vector<Vector<String>> missingStudents(
				Vector<String> students, Vector<Vector<String>> presence) {
			Vector<Vector<String>> missing = new Vector<Vector<String>>();
			for (int i = 0; i < presence.size(); i++) {
				Vector<String> temp = new Vector<String>();
				temp.addAll(students);
				for (int k = 0; k < presence.get(i).size(); k++) {
					temp.remove(presence.get(i).get(k));
				}
				missing.add(temp);
			}
			
			for(int i=0;i<missing.size();i++){
				Collections.sort(missing.get(i));
			}

			return missing;

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Vector<String> students = new Vector<>();
		Vector<Vector<String>> presence = new Vector<>();

		int studentsCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < studentsCount; i++) {
			String student = scanner.nextLine();
			students.add(student);
		}

		int days = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < days; i++) {
			int studentsForThatDay = Integer.parseInt(scanner.nextLine());
			Vector<String> presenceForDay = new Vector<>();
			for (int j = 0; j < studentsForThatDay; j++) {
				presenceForDay.add(scanner.nextLine());
			}

			presence.add(presenceForDay);
		}

		Vector<Vector<String>> missing = MissingStudent.missingStudents(
				students, presence);

		System.out.println(missing);
	}

}
