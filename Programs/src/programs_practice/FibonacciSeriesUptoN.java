package programs_practice;

import java.util.Scanner;

public class FibonacciSeriesUptoN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which you want Fibonacci Series:");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		sc.close();
	}

}
