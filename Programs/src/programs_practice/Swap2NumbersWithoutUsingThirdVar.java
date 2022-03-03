package programs_practice;
import java.util.Scanner;

public class Swap2NumbersWithoutUsingThirdVar {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a = input.nextInt();  // a=10
		int b = input.nextInt();  //b=20
		System.out.println("Before swap a="+ a +" "+"b="+b);
		
		a= a+b; // 10+20 =30
		b= a-b; // 20-10=10
		a= a-b; // 30-10=20
		
		System.out.println("After swap a="+ a +" "+"b="+b);
		input.close();
		}

}
