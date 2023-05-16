package array.twoDarray;

/*
 * question : Java code to read  square Matrix with 
 * characters as element count number of vowels and
 * consonants present in primary and secondary diagonal elements,
 * if both counts are equal 
 * then interchange primary diagonal with last row and secondary diagonal elements with last column
 * if count are not equal interchange primary diagonal elements with secondary 
 * display the final output Matrix
 */
public class Signi2 {
	public static void printArr(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// check vowel method
	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	// copy element to new array
	public static void copy(char[][] arr, char[][] temp) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp[i][j] = arr[i][j];
			}
		}
	}

	// main block
	public static void main(String[] args) {
		char[][] m = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		System.out.println("Original matrix:");
		printArr(m);

		// check prime count
		int pVowel = 0, pCons = 0;
		int sVowel = 0, sCons = 0;
		// checking vowels and cons
		for (int i = 0; i < m.length; i++) {
			char current = m[i][i];
			if (isVowel(current)) {
				pVowel++;
			} else {
				pCons++;
			}
			current = m[i][2 - i];
			if (isVowel(current)) {
				sVowel++;
			} else {
				sCons++;
			}
		}
		// create temp array
		char[][] temp = new char[m.length][m.length];
		// checking pVowel == sVowel
		if (pVowel == sVowel) {
			// copy element
			copy(m, temp);
			// swap condition
			for (int i = 0; i < m.length; i++) {
				temp[i][i] = m[2][i];
				temp[i][2 - i] = m[i][2];
			}
		} else {
			// copy element
			copy(m, temp);
			// swap condition
			for (int i = 0; i < m.length; i++) {
				temp[i][i] = m[i][2 - i];
				temp[i][2 - i] = m[i][i];
			}
		}
		System.out.println("New Matrix:");
		printArr(temp);
	}
}
