package programs_practice;
import java.util.Scanner;

public class FloatingPointNumbers {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Input Floating Point Number:");
		float f1=input.nextFloat();
		System.out.println("Input Another Floating Point Number:");
		float f2=input.nextFloat();
		
		f1=Math.round(f1*1000);
		f1=f1/1000;
		
		f2=Math.round(f2*1000);
		f2=f2/1000;
		
		if(f1==f2) {
			System.out.println("They are same upto three decimal places");
		}
		else {
			System.out.println("They are different");
		}
		input.close();

	}

}