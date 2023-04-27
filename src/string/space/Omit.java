package string.space;

import java.util.*;

public class Omit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		String newstr = omit(str);
		System.out.println("after omit space new String : "+newstr);
		s.close();
	}

	/* checking space in string */
	static String omit(String str) {
		String s = "";
		// traversing String
		for (int i = 0; i < str.length(); i++) {
			// checking space
			if (str.charAt(i) == ' ')
				continue;
			s += str.charAt(i);
		}
		return s;
	}
	
}
