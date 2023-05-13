package string.gfgStrings;

/*using hashing finding the uncommon character*/
public class Huncommon {
	public static void main(String[] args) {
		String a="characters";
		String b="alphabets";
		String s = chkUncomn(a,b);
		System.out.println(s);
	}
	//checking the string
	private static String chkUncomn(String a, String b) {
		//hash array
		int[] arr = new int[26];
		
		//Traverse string 1
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i)-97]=1;
		}
		
		//traverse String 2
		for(int j=0;j<b.length();j++) {
			if(arr[b.charAt(j)-97]==1||arr[b.charAt(j)-97]==-1) {
				arr[b.charAt(j)-97]=-1;
			}
			else {
				arr[b.charAt(j)-97]=2;
			}
		}
		//fetching value from hash array and add it to extra String
		String s = "";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1||arr[i]==2) {
				char ch = (char)(i+97);
				s+=ch;
			}
		}
		//checking length of the String
		if(s.length()==0)
			return "-1";
		else
			return s;
	}	
}
