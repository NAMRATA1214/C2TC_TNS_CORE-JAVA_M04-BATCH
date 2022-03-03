package programs_practice;
import java.util.Scanner;

public class NumberOfDaysInMonth{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input a Month Number:");
		int m =input.nextInt();
		System.out.println("Input a year:");
		int y=input.nextInt();
		
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("31 Days");
		}

		else if(m==2) {
			if((y%400==0) || ((y%100!=0) && (y%4==0))) {
				System.out.println("February has 29 Days"+y);
			}
			else {
				System.out.println("February has 28 Days"+y);
			}
		}
		else {
			System.out.println("30 Days");
		}
		input.close();
	}
	
}