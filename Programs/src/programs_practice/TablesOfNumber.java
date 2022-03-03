package programs_practice;
import java.util.Scanner;

public class TablesOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number Which you want multiplication Table of:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		
		sc.close();

	}

}
