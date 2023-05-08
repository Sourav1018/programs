package string.findTheMaxIndexChar;

public class MinIndex {
	
	//size of hash array
	private static final int size = 26;
	//method of return index 
	private static int index(String a, String b) {
		
		//hash array 
		int[] arr = new int[size];
		
		//update the String 1
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i) - 'a'] = 1;
		}
		//update the String 2
		for(int j=0;j<b.length();j++) {
			arr[b.charAt(j) - 'a'] = ++arr[b.charAt(j) - 'a'];
		}
		//finding index
		for(int j=0;j<a.length();j++) {
			if(arr[a.charAt(j) - 'a'] > 1) {
				return j;
			}
		}		
		return -1;
	}
	public static void main(String[] args) {
		
		String a = "adcffaet";
		String b = "onkl";
		
		int index = index(a,b);
		System.out.println(index);

	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return;
	}

}
