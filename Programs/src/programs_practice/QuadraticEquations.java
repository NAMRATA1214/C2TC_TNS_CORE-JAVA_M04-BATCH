package programs_practice;
import java.util.Scanner;
 
public class QuadraticEquations{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input a:");
		double a=input.nextDouble();
		
		System.out.println("Input b:");
		double b=input.nextDouble();
		
		System.out.println("Input c:");
		double c=input.nextDouble();
		
		double d=(b*b)-(4*a*c);
		
		if(d>0) {
			double x=(-b+ Math.pow(d, 0.5))/(2*a);
			System.out.println(x);
			double x1= (-b -Math.pow(d, 0.5))/(2*a);
			System.out.println(x1);
		}
		else if(d==0) {
			double x= -b/(2*a);
			System.out.println(x);
			double x1= -b/(2*a);
			System.out.println(x1);
		}
		else {
			double s= -b/(2*a);
			double r= Math.pow(-d, 0.5)/(2*a);
			System.out.format("%.2f + %.2fi",s,r);
			System.out.format("\n%.2f - %.2fi",s,r);
		}
		input.close();
		
		
		
		
	}
}

