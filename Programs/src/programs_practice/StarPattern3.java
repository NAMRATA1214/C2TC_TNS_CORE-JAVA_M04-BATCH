package programs_practice;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of rows upto which you want the Star Pattern of:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
