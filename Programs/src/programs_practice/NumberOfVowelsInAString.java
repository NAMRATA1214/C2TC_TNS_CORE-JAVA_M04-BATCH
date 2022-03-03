package programs_practice;

import java.util.Scanner;

public class NumberOfVowelsInAString {

	public static void main(String[] args) {
		
		//Program to find the number of vowels in a string.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
				}
			}
		System.out.println("The number of vowels in a String is"+count);
		
		sc.close();
		}

}
