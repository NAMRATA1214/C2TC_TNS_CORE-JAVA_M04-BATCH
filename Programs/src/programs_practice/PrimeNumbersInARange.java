package programs_practice;

import java.util.Scanner;

public class PrimeNumbersInARange{
	static int temp=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number upto which you want the prime numbers: ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
			else {
				temp=0;
			}
		}
		sc.close();
		
	}
		
}