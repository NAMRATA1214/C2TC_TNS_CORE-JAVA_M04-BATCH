package programs_practice;
import java.util.Scanner;

public class ZeroPositiveNegative {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Input a number:");
		float f=input.nextFloat();
		
		if(f>0) {
			
			if(f<1) {
				System.out.println("Positive Small Number");
				}
			else if(f>1000000){
				System.out.println("Positive Large Number");
				}
			else {
				System.out.println("Positive");
				}
		}
		
		else if(f<0) {
			
			if(f<1) {
				System.out.println("Negative Small Number");
			}
			else if(f>1000000) {
				System.out.println("Negative Large Number");
			}
			else {
				System.out.println("Negative");
			}
		}
		
		else {
			System.out.println("Zero");
		}
		input.close();

	}

}
