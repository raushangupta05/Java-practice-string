package String;

import java.util.Arrays;

public class Anagaram {
	public static void main(String[] args) {
		String str = "vidya";
		String st1 = "divya";

		if (str.length() == st1.length()) {
			char ch[] = str.toCharArray();
			char ch1[] = st1.toCharArray();

			Arrays.sort(ch);
			Arrays.sort(ch1);

			String s1 = new String(ch);
			String s2 = new String(ch1);

			if (s1.equals(s2))
				System.out.println("String is Anagram");

			else
				System.out.println("not Anagram");
		} else {
			System.out.println("not Anagram");
		}

	}
}
