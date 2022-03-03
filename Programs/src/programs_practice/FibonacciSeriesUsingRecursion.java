package programs_practice;
import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	
	public static int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int d= input.nextInt();
		System.out.println("Fibonacci Series is");
		for(int i=0;i<d;i++) {
			System.out.println(Fibonacci(i)+" ");
		}
		
		input.close();
	}

}
