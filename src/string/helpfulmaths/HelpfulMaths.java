package string.helpfulmaths;

import java.util.Scanner;

public class HelpfulMaths {
	
	//short the String method
	private static void check(String a) {
		
		//create hash array
		int[] arr = new int[4];
		
		//update the array
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!='+') {
				arr[a.charAt(i)-49] = ++arr[a.charAt(i)-49];
			}
			else {
				arr[a.charAt(i)-40] = ++arr[a.charAt(i)-40];
			}
		}	
		//method for sort the String 
		//take new empty String
		String str = "";
		for(int j=0;j<arr.length;j++) {
			while (arr[j]>0 && arr[arr.length-1]>0) {
				str+=(char)(j + 49)+""+(char)( arr.length-1 + 40);
				arr[j]--; arr[arr.length-1]--;
			}
			while(arr[j]>0) {
				str+=(char)(j + 49);
				arr[j]--;
			}
		}
		System.out.println(str);
		
	}
	//main method
	public static void main(String[] args) {
		//input 1+3+2 , 2 
		//output 1+2+3 , 2
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		check(s);
	}
	//print array function
	static void printArr(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
