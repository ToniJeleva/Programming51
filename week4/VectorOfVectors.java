package week4zadachki;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectors {

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
		Vector<Integer> result = new Vector<Integer>();
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.get(i).size(); j++) {
				result.add(v.get(i).get(j));
			}
		}
		
		for (int i = 0; i < result.size() - 1; i++) {
			for (int j = 0; j < result.size() - 1; j++) {
				if (result.get(j) > result.get(j + 1)) // swap the elements
				{
					int tmp = result.get(j);
					result.set(j, result.get(j + 1));
					result.set(j + 1, tmp);
				}
			}
		}
		
		for(int i=0;i<result.size()-1;i++){
			if(result.get(i)==result.get(i+1)){
				result.remove(i+1);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Vector<Vector<Integer>> vi = new Vector<Vector<Integer>>();
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Vector<Integer> v = new Vector<Integer>();
			int num = scanner.nextInt();
			for (int k = 0; k < num; k++) {
				v.add(scanner.nextInt());
			}
			vi.add(v);
		}
		//sortAndUnique(vi);
		System.out.println(sortAndUnique(vi).toString());
		
	}
}


