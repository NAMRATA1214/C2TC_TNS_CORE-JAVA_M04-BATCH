package programs_practice;

import java.util.Scanner;

public class ArmStrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		int temp=n,length=0;
		while(temp!=0) {
			length=length+1;
			temp=temp/10;
		}
		int temp2=n,arm=0;
		while(temp2!=0) {
			int mult=1;
			int rem=temp2%10;
			for(int i=1;i<=length;i++) {
				mult=mult*rem;
			}
			temp2=temp2/10;
			arm=arm+mult;			}
		if(arm==n) {
			System.out.println("Number is a Armstrong Number");
		}
		else {
			System.out.println("Number is not a Armstrong Number");
		}
		
		sc.close();
	}

}
