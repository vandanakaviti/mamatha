package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of queries : ");
		int q = s.nextInt();
		
		for (int i=0; i<q; i++) {
			System.out.print("Enter a number : ");
			int n = s.nextInt();
			List<Integer> arr = new ArrayList<Integer>();
			arr.add(2);
			if (n == 1) {
				System.out.println(2);
				break;
			}
			
			int j = 3;
			while (arr.size() < n) {
				int k = 2;
				boolean flag = true;
				while (k < j) {
					if (j % k == 0) {
						flag = false;
						break;
					}
					k++;
				}
				if (flag == true) {
					arr.add(j);
				}
				j++;
			}
			
			System.out.println(arr.get(n-1));
		}
		

	}

}
