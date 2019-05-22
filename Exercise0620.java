/*(Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.*/

package Chapter06;

import java.util.Scanner;

public class Exercise0620 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the radius of circle: ");
		double radius = input.nextDouble(); 
		System.out.println("Area of circle is: " + circleArea(radius));
		input.close();	
	}
	static double circleArea(double r){
	double area = Math.PI * r * r;
	return area;
	}
}
