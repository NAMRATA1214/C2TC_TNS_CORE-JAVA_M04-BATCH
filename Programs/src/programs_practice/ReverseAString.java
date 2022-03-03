package programs_practice;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s = input.next(); 
		String rev="";
		
		for(int i = s.length() - 1; i>=0; i--) {
			rev=rev+ s.charAt(i);
		}
		System.out.println("Reverse of a String is :"+rev);
		input.close();
		
		
	}

}
