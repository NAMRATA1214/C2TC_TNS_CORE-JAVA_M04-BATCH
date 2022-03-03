package programs_practice;

import java.util.Scanner;

public class NumericPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of Rows:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				count=count+1;
				System.out.print(" "+count);
			}
			System.out.println();
		}
		sc.close();
	}

}
