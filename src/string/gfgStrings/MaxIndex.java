package string.gfgStrings;

/*maximum occurrence of that character*/

public class MaxIndex {	
	
	//size array 
	static final int size = 26;
	
	//checking maxIndex 
	private static String maxIndex(String a,String b) {
		//hashing array 
		int[] arr = new int[size];
		
		//update the index for String a
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i) - 'a'] = ++arr[a.charAt(i) - 'a'];
		}
		
		//update the index for String b
		for(int j=0;j<b.length();j++) {
			arr[b.charAt(j) - 'a'] = ++arr[b.charAt(j) - 'a'];
		}
		
		//find the max occurrence 
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		//returning the max value 
		String s="";
		
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				s+=(char)(i+'a');
			}
		}
		return s;
	}
	
	//main function
	public static void main(String[] args) {
		
		String a = "adcffaet";
		String b = "onkl";
		String ch = maxIndex(a,b);
		if(ch == "") {
			System.out.println("-1");
		}else {
			System.out.println(ch);
		}
	}
}
