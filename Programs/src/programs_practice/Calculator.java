package programs_practice;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Press 1 for Addition:");
		System.out.println("Press 2 for Subtraction:");
		System.out.println("Press 3 for Multiplication:");
		System.out.println("Press 4 for Division:");
		System.out.println("Enter your Choice :");
		int choice=input.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter 1st Number:");
			int x=input.nextInt();
			System.out.println("Enter 2nd Number:");
			int y=input.nextInt();
			int sum=x+y;
			System.out.println("Sum is:"+sum);
			break;
			
		case 2:
			System.out.println("Enter 1st Number:");
			int x1=input.nextInt();
			System.out.println("Enter 2nd Number:");
			int y1=input.nextInt();
			int diff=x1-y1;
			System.out.println("Difference is:"+diff);
			break;
		case 3:
			System.out.println("Enter 1st Number:");
			int x2=input.nextInt();
			System.out.println("Enter 2nd Number:");
			int y2=input.nextInt();
			int mul=x2*y2;
			System.out.println("Multiplication is:"+mul);
			break;
			
		case 4:
			System.out.println("Enter 1st Number:");
			int x3=input.nextInt();
			System.out.println("Enter 2nd Number:");
			int y3=input.nextInt();
			int div=x3/y3;
			System.out.println("Division is:"+div);
			break;
			
		default:
			System.out.println("You have entered an invalid number of choice,Please enter between 1 to 4.");
			break;
			
		}
		
		input.close();
		
		
	}

}
