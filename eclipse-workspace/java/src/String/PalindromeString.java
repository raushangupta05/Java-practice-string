package String;

public class PalindromeString {
	public static void main(String[] args) {

		String str = "MADAM";
		String rev = "";

//	for(int i =str.length()-1;i>= 0; i--) {
//		rev = rev+str.charAt(i);
//	}

		int i = str.length() - 1;
		while (i >= 0) {
			rev = rev + str.charAt(i);
			i--;
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("Given String is plindrome");
		} else {
			System.out.println("Not plindrome");
		}

	}
}
