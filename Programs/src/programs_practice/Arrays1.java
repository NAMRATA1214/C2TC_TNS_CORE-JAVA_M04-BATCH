package programs_practice;
import java.util.Scanner;

class Arrays1{

	public static void main(String[] args){

		Scanner table =new Scanner(System.in); //reading input from user

//welcome Greets for users:-
		System.out.println("");//space for looks
		System.out.println("");
		System.out.println("");

	System.out.println("        * Welcome to my console applicaton of Magical table");

	System.out.println("        * Please enter only Integer *");

	System.out.print("            Kindly Enter the number for which you want table : ");

		int x = table.nextInt();
    System.out.println("");
	System.out.print("          you have entered :- "+x);
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};

//table logic
System.out.println("");
System.out.println("");

		for (int i=0;i<arr.length;i++){
			System.out.println("            "+(x*arr[i]));
		}


	}
}