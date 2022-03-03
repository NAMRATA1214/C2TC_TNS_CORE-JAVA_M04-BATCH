package programs_practice;
import java.util.Scanner;

public class FactorialOfNumberUsingLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number you want Factorial Of :");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("The Factorial Of the Given Number is: "+fact);
		
		sc.close();
		

	}

}
