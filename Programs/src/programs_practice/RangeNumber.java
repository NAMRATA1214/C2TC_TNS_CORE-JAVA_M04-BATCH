package programs_practice;
import java.util.Scanner;

public class RangeNumber {
	
	public static int getNumber(int sum,int i,int j) {
		if(i>j)
			return sum;
		
		return i +getNumber(sum,i+1,j);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range 1");
		int a=sc.nextInt();
		System.out.println("Enter Range 2");
		int b=sc.nextInt();
		int sum=getNumber(0,a,b);
		System.out.println("The Sum is:"+sum);
		
		sc.close();


	}

}
