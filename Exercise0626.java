/*(Reversing Digits) Write a method that takes an integer value and returns the number with its digits reversed. 
For example, given the number 7631, the method should return 1367. 
Incorporate the method into an application that reads a value from the user and displays the result.*/
package Chapter06;

import java.util.Scanner;

public class Exercise0626 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter number to reverse: ");
		int number = input.nextInt();
		System.out.println("Reversed number is: " + Revers(number));
		input.close();
	}
	public static int Revers(int num){
		int reversed = 0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		return reversed;
	}
}
