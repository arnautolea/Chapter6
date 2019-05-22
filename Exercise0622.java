/*(Temperature Conversions) Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;

c) Use the methods from parts (a) and (b) to write an application that enables the user ei-
ther to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
Celsius temperature and display the Fahrenheit equivalent.*/
package Chapter06;

import java.util.Scanner;

public class Exercise0622 {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter 1 to convert Farenheit to Celsius or 2 to convert Celsius to Farenheit  : ");
		int temp = input.nextInt();
		
		switch (temp){
		case 1:
			System.out.print("Enter Fahrenheit value: ");
			int fahrenheit = input.nextInt();
			System.out.println("Equivalent Celsius : " + Celsius(fahrenheit));
			break;
		case 2:
			System.out.print("Enter Celsius value: ");
			int celsius = input.nextInt();
			System.out.println("Equivalent Fahrenheit : " + Fahrenheit(celsius));
			break;
		default:
			System.out.println("No such option");
			break;
		}
		input.close();
	}
	
	public static int Celsius (int fahrenheit){
		int celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));
		return celsius;
	}
	public static int Fahrenheit (int celsius){
		int fahrenheit = (int) (9.0 / 5.0 * celsius + 32);
		return fahrenheit;
	}

}
