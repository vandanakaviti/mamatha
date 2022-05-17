package assignment;

import java.util.Scanner;

public class MilitaryIDNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tests : ");
		int s = sc.nextInt();
		
		System.out.print("Enter the number of closed down MRO points : ");
		int z = sc.nextInt();
		
		sc.nextLine();
		
		for (int i=0; i<z; i++) {
			System.out.print("Enter the old code and new code : ");
			String str[] = sc.nextLine().split(" ");
			String old_code = str[0];
			String new_code = str[1];
		}
		
		System.out.print("Enter the number of boys at conscription age : ");
		int p = sc.nextInt();

	}

}
