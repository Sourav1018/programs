package string.classProgram;

import java.util.Scanner;

public class UtoLArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		s.close();
		//create char[] array 
		char[] ch=str.toCharArray();
		//looping through array
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
			}
		}
		//printing Upper case String
		System.out.println("after converting: ");
		str=new String(ch);
		System.out.println(ch);
	}
}
