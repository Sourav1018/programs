package string.cf800;

import java.util.*;
public class Lexo {
	
	//check method
	private static int check(String a, String b) {
		
		//convert into char array
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		//empty string 
		String str1 = "";
		String str2 = "";
		//convert into small 1st string
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] < 'a') {
				str1+=(char)(arr1[i]+32);	
			}else {
			str1+=(char)(arr1[i]);
			}
		}
		//convert into small 2nd string
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] < 'a') {
				str2+=(char)(arr2[i]+32);
				continue;
			}
			str2+=(char)(arr2[i]);
		}
		//compare string 1 and string 2
		int i=0,j=0;
		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i) < str2.charAt(j)) {
				return -1;
			}
			else if(str1.charAt(i) > str2.charAt(j)) {
				return 1;
			}
			i++;j++;
		}
		return 0;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int i=check(a,b);
		System.out.println(i);	
		sc.close();
	}

}
