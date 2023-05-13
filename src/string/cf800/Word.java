package string.cf800;

//question : word 
import java.util.*;

public class Word {

	// check method
	private static void check(String a) {
		//counting caps and small
		int caps = 0, small = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)<'a') {
				caps++;
			}
			else {
				small++;
			}
		}
		//char array
		char[] ch = a.toCharArray();
		char[] temp = new char[a.length()];
		//Changing the lower to upper case 
		if(caps>small) {
			for(int i=0;i<ch.length;i++) {
				if(ch[i]>='a') {
					temp[i] = (char)(ch[i]-32);
				}
				else {
					temp[i] = ch[i];
				}
			}
		}
		//changing the upper to lower case 
		if(caps<=small) {
			for(int i=0;i<ch.length;i++) {
				if(ch[i] < 'a') {
					temp[i] = (char)(ch[i]+32);
				}
				else {
					temp[i] = ch[i];
				}
			}
		}
		a = new String(temp);
		System.out.println(a);
	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		check(s);
	}
}
