package string.space;

import java.util.Scanner;

public class CountSpace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		int space = cSpace(str);
		System.out.println("Space present in String :" + space);
		s.close();
	}

	/* count space */
	static int cSpace(String str) {
		int count = 0;
		// traversing String
		for (int i = 0; i < str.length(); i++) {
			// checking space
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
}
