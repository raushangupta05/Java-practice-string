package String;

public class ReverseAStringWithoutUsingCharAt {

	public static void main(String[] args) {

		String str = "Hello";
		String ans = "";
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			ans = ans + ch[i];
		}
		System.out.println(ans);
	}

}
