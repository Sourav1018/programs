package string.classProgram;

/* using empty String*/
public class UpperToLower {
	public static void main(String[] args) {
		String s = "an@Bc";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char ch = s.charAt(i);
				ch = (char) (ch - 32);
				str += ch;
			} else {
				str += s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
