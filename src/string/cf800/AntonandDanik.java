package string.cf800;

//question : Anton and Danik
import java.util.*;

public class AntonandDanik {
	
	//check method 
	private static void check(String s) {
		//create array
		char[] ch = new char[2];
		//update index for counting the char
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				ch[s.charAt(i)-65] = ++ch[s.charAt(i)-65];
			}
			else {
				ch[s.charAt(i)-67] = ++ch[s.charAt(i)-67];
			}
		}
		if(ch[0]>ch[1]) {
			System.out.println("Anton");
		}
		else if(ch[0]==ch[1]) {
			System.out.println("Friendship");
		}
		else {
			System.out.println("Danik");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//games input
		int input = sc.nextInt();
		char[] ch = new char[input];
		//taking input in side char array from user 
		ch = sc.next().toCharArray();
		String s = new String(ch);
		ch=null;
		check(s);
	}
}
	