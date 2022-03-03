package programs_practice;

import java.util.Scanner;
public class FactorialOfNumberUsingRecursion{
	static int fact=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Of which you want Factorial Of:");
		int n=sc.nextInt();
		FactorialOfNumberUsingRecursion obj=new FactorialOfNumberUsingRecursion();
		int res=obj.getFact(n);
		System.out.println(res);
		
		sc.close();
		}
	
	int getFact(int a) {
		if(a>=1) {
			fact=fact*a;
			getFact(a-1);
		}
		return fact;

	}
}