package String;

public class LowerToUpper {
	public static void main(String[] args) {
		String str = "raushan";
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int x = (char) ch;
			char ch1 = (char) (x - 32);
			ans = ans + ch1;

		}
		System.out.println(ans);
	}
}
