package array.twoDarray;

/*
 * question : wap to read 3 by 3 matrix with digits inputs numeric values as input 
 * count no. of prime and non-prime digits in primary and secondary
 * diagonal elements. if both counts are equal then move all 1st row 
 * elements to last column, last column elements to last row, last row 
 * elements to 1st column, 1st column elements to 1st row, if counts are 
 * not equal then interchange primary diagonal elements with secondary 
 * diagonal elements. display the final matrix.
 */
public class Signi {
		// print 2d array
		static void print(int[][] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		// check isPrime method
		public static boolean isPrime(int n) {
			if (n == 1 || n == 0) {
				return false;
			}
			int half = n / 2;
			for (int i = 2; i <= half; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		//copy element to new array
		public static void copy(int[][] arr,int[][] temp) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					temp[i][j] = arr[i][j];
				}
			}
		}
		
		// main method
		public static void main(String[] args) {
			int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 7 } };
			System.out.println("the 3x3 matrix is :");
			print(arr);// printing the initial array

			// take variable for prime count and non prime count for primary diagonal
			int pCount = 0, npCount = 0;
			// take variable for prime count and non prime count for secondary diagonal
			int spCount = 0, snpCount = 0;

			// passing number to isPrime method and count
			for (int i = 0; i < arr.length; i++) {

				// checking primary diagonal
				if (isPrime(arr[i][i])) {
					pCount++;
				} else {
					npCount++;
				}

				// checking secondary diagonal
				if (isPrime(arr[i][2 - i])) {
					spCount++;
				} else {
					snpCount++;
				}
			}
			System.out.println("Primary Prime count= " + pCount + ", Primary Non-Prime count= " + npCount);
			System.out.println("Secondary Prime count= " + spCount + ", Secondary Non-Prime count= " + snpCount);

			//create new temporary array
			int[][] temp = new int[arr.length][arr.length];

			// checking Primary diagonal prime and Secondary diagonal prime
			if (pCount == spCount) {
				copy(arr,temp);
				//swap condition in new array
				for (int i = 0; i < arr.length; i++) {
					temp[i][2] = arr[0][i];//1st row elements to last column
					temp[2][i] = arr[i][2];//last column elements to last row,
					temp[i][1] = arr[2][i];//last row elements to 1st column, 
					temp[0][i] = arr[i][1];//1st column elements to 1st row, 
				}
				System.out.println("\nAfter swap new array:");
				print(temp);
			}
			else {
				copy(arr,temp);
				//swap diagonal condition
				for(int i=0;i<arr.length;i++) {
					temp[2-i][i] = arr[i][i];
					temp[i][i] = arr[2-i][i];
				}
				System.out.println("\nAfter diagonal swap new array:");
				print(temp);
			}
		}
}
