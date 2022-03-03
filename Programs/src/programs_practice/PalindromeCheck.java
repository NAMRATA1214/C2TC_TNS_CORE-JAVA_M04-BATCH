package programs_practice;
import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a = input.nextInt();
		int rev=0;
		int temp=a;
		int rem;
		
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(a==rev) {
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is Not is a Palindrome");
		}
		
		input.close();

	}

}
