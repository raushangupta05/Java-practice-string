package String;

public class String_Replace1 {
	public static void main(String[] args) {
		String str = "Hi hello bye";
		String temp = "";
		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == 1) { // Only reverse the second word
				String abb = arr[i];
				String abc = "";
				for (int j = abb.length() - 1; j >= 0; j--) {
					abc = abc + abb.charAt(j);
				}
				temp += abc + " ";
			} else {
				temp += arr[i] + " ";
			}
		}

		System.out.println(temp.trim()); // Print the final result without trailing space
	}
}
