package programs_practice;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Input Number:");
		double n=input.nextDouble();
		
		if(n>0) {
			System.out.println("Number Is Positive");
		}
		else {
			System.out.println("Number Is Negative");
		}
		input.close();

	}

}
