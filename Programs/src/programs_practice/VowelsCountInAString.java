package programs_practice;
import java.util.Scanner;

public class VowelsCountInAString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s =input.next().toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels in a string :"+s+" "+"is"+" "+count);
		input.close();
		
	}

}
