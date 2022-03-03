package programs_practice;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number you want Reverse Of:");
		int n=sc.nextInt();
		int rem,rev = 0;
		while(n!=0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println("The Reverse Of the Number is"+rev);
		
		sc.close();

	}

}
