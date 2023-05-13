package string.cf800;

import java.util.Scanner;

public class Abbreviation {

	private static void check(String a) {
		//checking length
		int length = a.length();
		//take new one empty String
		String str = "";
		if(length > 10) {
			char[] arr1 = a.toCharArray();
			str+=arr1[0]+""+(length-2)+""+arr1[a.length()-1];
			System.out.println(str);
			return;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			String s = sc.next();
			check(s);
		}
	}

}
