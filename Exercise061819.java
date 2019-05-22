/*18.(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid 
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side. 
*19.(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive 
a second parameter of type char called fillCharacter. Form the square using the char provided as an argument.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise061819 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of asterisks: ");
		int aster = input.nextInt();
		System.out.print("Enter fillCharacter: ");
		char fill = input.next().charAt(0);
		squareOfAsterisks(aster, fill);
		input.close();
	}//main
		static void squareOfAsterisks (int number, char character){
			for (int i = 0; i < number; i++){
				for (int k = 0; k < number; k++){
					System.out.print(character);
				}
			System.out.println();
			}
		}
}//class
