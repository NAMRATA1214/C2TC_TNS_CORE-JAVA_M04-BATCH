package programs_practice;
import java.util.Scanner;
public class SwapTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number Before Swapping:");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd Number Before Swapping:");
		int b= sc.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("The 1st Number after swapping"+a);
		System.out.println("The 2nd Number after swapping"+b);
		
		
		sc.close();

	}

}
