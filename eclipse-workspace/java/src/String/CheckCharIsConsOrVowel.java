package String;

public class CheckCharIsConsOrVowel {

	public static void main(String[] args) {

		String str = "Hello how are you";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(str.charAt(i) + " is Vowel");

			} else if (ch == ' ') {
				System.out.println(str.charAt(i) + " is Whitespace");
			}

			else {
				System.out.println(str.charAt(i) + " is Constant");
			}

		}

	}

}
