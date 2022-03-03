package programs_practice;
import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of rows upto which you want the Star Pattern:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
