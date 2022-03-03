package programs_practice;
import java.util.Scanner;
public class StarPattern5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows upto which you want the Star Patter");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}