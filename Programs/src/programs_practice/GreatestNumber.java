package programs_practice;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the 1st Number:");
		int a=input.nextInt();
		
		System.out.println("Input the 2nd Number:");
		int b=input.nextInt();

		System.out.println("Input the 3rd Number:");
		int c=input.nextInt();
		
		if(a>b && a>c) {
			System.out.println("\nGreatest Number:"+a);
		}
		else if(b>c) {
			System.out.println("\nGreatest Number:"+b);
		}
		else {
			System.out.println("\nGreatest Number:"+c);
		}
		
		input.close();
		

	}

}
