package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		boolean d = true;
		int a = 0;
		if (d = true) {
			for (int i = 0; i < eggs.size(); i++) {

				if (eggs.get(i) == "cracked") {
					d = false;
					a = i;
					return i;
				}
			}
		} // <- this needs changing
		System.out.println(a);
		return 0;

	}

	public static int countPearls(List<Boolean> oysters) {
		int full = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				full++;
			}
		}
		return full;
	}

	public static Double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;

	}

	public static String findLongestWord(List<String> words) {
		String a = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > a.length()) {
				a = words.get(i);
			}
		}

		return a;

	}

	public static boolean containsSOS(List<String> message1) {
		boolean SOS = false;
		for (int i = 0; i < message1.size(); i++) {
			System.out.println(message1.get(i));
			if (message1.get(i).equals(" ... --- ... ")) {

				SOS = true;
			}
		}
		return SOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i2 = 0; i2 < results.size(); i2++) {

			for (int i = i2+1; i < results.size(); i++) {
				 
					if (results.get(i2) > results.get(i)) {
					 double temp = results.get(i);
						results.set(i, results.get(i2));
					results.set(i2, temp);
						 
					
					}
				
					
				}
			}
		System.out.println(results);
		return results;	
	}

		

	

}
