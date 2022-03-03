package programs_practice;
import java.util.Scanner;

public class PrimeNumberOrNot{
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		int temp=0;
		
		if(a==0|| a== 1) {
			System.out.println("Not a Prime Number.");
		}
		else if(a==2) {
			System.out.println("Prime Number.");
		}
		else {
			for(int i=2;i<=a-1;i++) {
				if(a%i==0) {
					temp=temp+1;
				}
			}
			if(temp>0) {
				System.out.println("Number is a Prime Number");
			}
			else {
				System.out.println("Number is Not a Prime Number");
			}
		}
		input.close();
		
	}
}