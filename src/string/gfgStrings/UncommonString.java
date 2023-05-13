package string.gfgStrings;

public class UncommonString {
	//main method
	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		String s= dupElement(asscString(uncommonChar(a,b)));
		boolean rs=lengCheck(s);
		if(rs==true) {
			System.out.println(s);
		}
		else {
			System.out.println(-1);
		}
	}
	
	/*checking length*/
	static boolean lengCheck(String s) {
		if(s.length()>0) {
			return true;
		}
		return false;
	}
	
	/*checking duplicates*/
	static String dupElement(String s) {
		String str = "";
		boolean[] b=new boolean[s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					b[j]=true;
				}
			}
		}
		//checking array create new string
		for(int i=0;i<b.length;i++) {
			if(b[i]==true) {
				continue;
			}
			else {
				str+=s.charAt(i);
			}
		}
		
		return str;
	}
	
	/*Ascending order*/
	static String asscString(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[i]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return new String(ch);
	}
	
	/*check uncommon*/
	static String uncommonChar(String a,String b) {
		String c=asscString(convSmall(a));
		String d=asscString(convSmall(b));

		String s="";
		boolean[] cb = new boolean[c.length()];
		boolean[] db = new boolean[d.length()];
		
		for(int i=0;i<c.length();i++) {
			for(int j=0;j<d.length();j++) {
				if(c.charAt(i)==d.charAt(j)) {
					cb[i]=true;
					db[j]=true;
				}
			}
		}
		
		int i=0,j=0;
		while(i<cb.length&&j<db.length) {
			if(cb[i]==false) {
				s+=c.charAt(i);
			}
			if(db[j]==false) {
				s+=d.charAt(j);
			}
			i++;j++;
		}
		while(i<cb.length) {
			if(cb[i]==false) {
				s+=c.charAt(i);
			}
			i++;
		}
		while(j<db.length) {
			if(db[j]==false) {
				s+=d.charAt(j);
			}
			j++;
		}		
		return s;
	}
	
	/*converting to small*/
	static String convSmall(String a) {
		String s="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				char ch=(char)(a.charAt(i)+32);
				s+=ch;
			}
			else {
				s+=a.charAt(i);
			}
		}
		return s;
	}
}
