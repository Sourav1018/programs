package string.gfgStrings;

/*check 1st repeat char in String*/
public class Repeat {
	//char variable
	final static  int MAX_CHAR=26;
	//check repMethod
	private static char rep(String s) {		
		//hash array
		int[] arr = new int[MAX_CHAR];
		
		//String update hash array
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a'] = ++arr[s.charAt(i)-'a'];
			if(arr[s.charAt(i)-'a']>= 2) {
				return s.charAt(i);
			}
		}
		return ' ';
	}
	
	
	//main function
	public static void main(String[] args) {
		String s = "hellogeeks";
		char ch = rep(s);
		if(ch == ' ') {
			System.out.println("-1");
		}else {
			System.out.println(ch);
		}
	}
}
