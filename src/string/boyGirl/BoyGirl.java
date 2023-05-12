package string.boyGirl;

import java.util.Arrays;

public class BoyGirl {
	//hash size
	private static final int size = 26;
	//check method
	private static void check(String a) {
		//create hash array
		int[] arr = new int[size];
		
		//updating array
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i)-97] = ++arr[a.charAt(i)-97];
		}
		//checking occurrence 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=2) {
				if(arr[i]%2==0) {
					return ;
				}
			}
		}
	}
	
	//main method
	public static void main(String[] args) {
		String s = "wjmzbmr";
		check(s);
	}
}
