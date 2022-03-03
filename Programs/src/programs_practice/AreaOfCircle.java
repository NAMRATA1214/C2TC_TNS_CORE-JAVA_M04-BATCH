package programs_practice;
import java.util.Scanner;

public class AreaOfCircle {
	
	public void areaOfCircle() {
		
		Scanner input=new Scanner(System.in);
		
		double pi=3.14;
		System.out.println("Enter the radius of the circle:");
		double r=input.nextDouble();
		double area = pi*r*r;
		System.out.println(area);
		input.close();
	}
	
	public void volumeOfCuboid() {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the length of the cuboid:");
		double l=input.nextDouble();
		
		System.out.println("Enter the breadth of the cuboid:");
		double b=input.nextDouble();
		
		System.out.println("Enter the height of the cuboid:");
		double h=input.nextDouble();
		
		double volume=l*b*h;
		System.out.println(volume);
		
		input.close();
	}

	public static void main(String[] args) {
		
		AreaOfCircle obj=new AreaOfCircle();
		//obj.volumeOfCuboid();
		obj.areaOfCircle();
	}
	

}
