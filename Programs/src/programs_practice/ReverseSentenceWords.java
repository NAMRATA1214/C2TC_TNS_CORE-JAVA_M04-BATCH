package programs_practice;

import java.util.Scanner;

public class ReverseSentenceWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String result="";
		for(int i=arr.length-1;i>=0;i--) {
			result=result+arr[i]+" ";
		}
		System.out.println(result);
	}

}
