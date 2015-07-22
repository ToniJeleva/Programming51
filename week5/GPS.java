package week5;

import java.util.Scanner;
import java.util.Vector;

public class GPS {

	public static Vector<Integer> getGasStations(int tripDistance,
			int tankSize, Vector<Integer> gasStations) {
		Vector<Integer> result = new Vector<Integer>();
		gasStations.addElement(tripDistance);
		int fuelLeft = tankSize;
		fuelLeft = fuelLeft - gasStations.get(0);     
		
		for (int i = 1; i < gasStations.size(); i++) {
			if (fuelLeft < gasStations.get(i) - gasStations.get(i - 1)) {
				fuelLeft = tankSize;
				result.add(gasStations.get(i - 1));
			}
			fuelLeft = fuelLeft - (gasStations.get(i) - gasStations.get(i - 1));
		}
		return result;
	}

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int tripDistance = scanner.nextInt();
	    int tankSize = scanner.nextInt();

	    int gasStationsCount = scanner.nextInt();
	    Vector<Integer> gasStations = new Vector<Integer>();

	    for (int i = 0; i < gasStationsCount; i++) {
	      gasStations.add(scanner.nextInt());
	    }

	    Vector<Integer> result = getGasStations(tripDistance, tankSize, gasStations);

	    for (int i = 0; i < result.size(); i++) {
	        System.out.println(result.get(i));
	    }

	  }
	}
