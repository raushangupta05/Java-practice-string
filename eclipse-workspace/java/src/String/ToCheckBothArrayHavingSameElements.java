package String;

import java.util.Arrays;

public class ToCheckBothArrayHavingSameElements {

	public static void main(String[] args) {

		String arr[] = { "Hello", "Hii", "Bye" };
		String arr2[] = { "Hii", "Bye", "Hello" };

		Arrays.sort(arr);
		Arrays.sort(arr2);

		if (Arrays.equals(arr, arr2)) {
			System.out.println("same");
		} else {
			System.out.println("Not same");
		}
	}
}
