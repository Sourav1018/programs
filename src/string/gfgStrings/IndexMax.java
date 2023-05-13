package string.gfgStrings;

/* 
 * Minimum indexed character
 * which is present in both String
 */

public class IndexMax {

	private static final int size = 26;
	//finding method of maxCharCount
	private static String maxCharCount(String a, String b) {
		
		//hash array
		int[] arr = new int[size];
		
		//update the String 1
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i) - 'a'] = ++arr[a.charAt(i) - 'a'];
		}
		
		//update the String 2
		for(int j=0;j<b.length();j++) {
			arr[b.charAt(j) - 'a'] = ++arr[b.charAt(j) - 'a'];
		}
		
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int max = 0;
		if(a.length() > b.length()) {
			for(int i=0;i<a.length();i++) {
				for(int j=0;j<b.length();j++) {
					if(a.charAt(i) == b.charAt(j)) {
						if(max < arr[a.charAt(i) - 'a']) {
							max = arr[a.charAt(i) - 'a'];
						}
					}
				}
			}
		}
		else {
			for(int i=0;i<b.length();i++) {
				for(int j=0;j<a.length();j++) {
					if(b.charAt(i) == a.charAt(j)) {
						if(max < arr[b.charAt(i) - 'a']) {
							max = arr[b.charAt(i) - 'a'];
						}
					}
				}
			}
		}
		//returning max value char
		String s="";
		if(max>0) {
			for(int i=0;i<arr.length;i++) {
				if(max == arr[i]) {
					s+=(char)(i+'a');
					return s;
				}
			}
		}
		return s;
	}
	
	//main method
	public static void main(String[] args) {
	
		String a = "adcffaet";
		String b = "onkll";
		String s = maxCharCount(a,b);
		if(s == "") {
			System.out.println("-1");
		}else {
			System.out.println(s);
		}
	}

}
