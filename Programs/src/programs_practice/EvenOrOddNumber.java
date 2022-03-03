package programs_practice;
import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n =sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
		sc.close();
		

	}

}
