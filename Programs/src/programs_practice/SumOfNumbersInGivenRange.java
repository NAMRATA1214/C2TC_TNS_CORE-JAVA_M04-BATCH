package programs_practice;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {
	
	static int getSum(int n) {
		if(n==1)
			return n;
		else
			return n+getSum(n-1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(getSum(n));
		
		sc.close();
	}

}
