package programs_practice;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		if( year%400==0   ||  (year%4==0 && year%100!=0)  ) {
			System.out.println("Entered year is a Leap Year.");
		}
		else {
			System.out.println("Entered Number is not a Leap Year.");
		}
		
		sc.close();
	}

}
