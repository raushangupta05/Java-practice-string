package String;

import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {

		String str = "Abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();

		// creating hashset to store bcz hashset does not support duplicate value
		HashSet<Character> h1 = new HashSet<Character>();

		// Coverting String into char and storing in array
		char ch[] = str.toCharArray();

		if (str.length() > 25) {

			// Fetching one char at time and checking with a to z then pushing it into
			// hashset
			for (char c : ch) {
				if (c >= 'a' && c <= 'z') {
					h1.add(c);

				}
			}
		} else {
			System.out.println("Length of string should be more than 25 to pangram");
		}

		if (h1.size() == 26) {
			System.out.println("Pangram String");

		} else {
			System.out.println("Not Pangram");
		}

	}
}
