package string.cf800;

import java.util.Scanner;

public class BoyGirl {
	// hash size
	private static final int size = 26;

	// check method
	private static void check(String a) {
		// hash array
		int[] arr = new int[size];
		// update array index according to character
		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) - 97] = ++arr[a.charAt(i) - 97];
		}
		// empty string
		String s = "";
		// update as distinct String
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				s += (char) (i + 97);
		}
		// check even odd
		if (s.length() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		check(s);
	}
}
