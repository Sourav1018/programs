package string.wordCapitalization;

//using StringBuilder
import java.util.Scanner;
public class WordCapitalization {

	//method for capital 
	private static void convert(StringBuilder a) {
		int l = a.length();
		//char array
		char[] ch = new char[l];
		//store in to ch array
		a.getChars(0, l, ch, 0);
		//change 1st index of latter 
		for(int i=0;i<ch.length;i++) {
			if(!(ch[0] < 'a')) {
				a.setCharAt(0, (char)(ch[0]-32));
			}
			else {
				a.setCharAt(i, (char)(ch[i]));
			}
		}
		System.out.println(a.toString());
	}
	//main method
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
		convert(sb);
	}
	//print array method
	static void print(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}	
}
