package search;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 1, 3, 6, 7, 10, 20 };
		System.out.println("enter element to seach index ");
		int n = s.nextInt();
		int result = findIndex(a, n);
		System.out.println("the index of " + n + " is " + result);
		s.close();
	}

	private static int findIndex(int[] a, int key) {
		int start = 0, end = a.length-1;
		int mid = start + (end-start)/2;
		while (start <= end) {
			if (a[mid]==key) {
				return mid;
			}
			else if (mid<key) {
				start = mid+1;
			}
			else if (mid>key) {
				end = mid-1;
			}
			mid = start + (end-start)/2;
		}
		return -1;
	}

}
