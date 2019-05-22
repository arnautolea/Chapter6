/*
 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of a right triangle
when the lengths of the other two sides are given. The method should take two arguments of 
type double and return the hypotenuse as a double. Incorporate this method into an application 
that reads values for side1 and side2 and performs the calculation with the hypotenuse method. 
Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]

 */
package Chapter06;

import java.util.Scanner;

public class Exercise0615 {
	
	public static void main(String[] args) {
		
		double side1, side2;
		double hypo;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for side 1(or -1 to stop): ");
			side1 = input.nextDouble();
		while (side1 != -1) {
		System.out.print("Enter value for side 2: ");
			side2 = input.nextDouble();
				if (side1 > 0 && side2 > 0) {
				hypo = hypotenuse(side1, side2);
		//		hypo = Math.hypot(side1, side2);
				System.out.printf("%nHypotenuse for right triangle with sides (%.2f ; %.2f): %.2f", side1, side2, hypo);
				}
				else {
					System.out.println("\nvalues must be greater than 0");
				}
				System.out.print("\n\nEnter value for side 1(or -1 to stop): ");
				side1 = input.nextDouble();
		}
		input.close();	
		System.out.println("See you next time)");
			}

		public static double hypotenuse(double side1, double side2) {
			double hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
			return hypo;
		}
}