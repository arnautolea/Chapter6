/*6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]

6.31 (Guess the Number Modification) Modify the program of Exercise 6.30 to count the number of guesses 
the player makes. If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on.*/
package Chapter06;

import java.security.SecureRandom;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercise063031 {
	public static void main(String[] args) {
		String input = "";
		SecureRandom number = new SecureRandom();
		int low = 1;
		int high = 1000;
		// num is a random number between 1 and 1000
		int num = number.nextInt(high-low) + low; 
//		System.out.println(num); //show searching number		
		// Count number of guesses
		int count = 1; // 
		// Create frame
		JFrame frame = new JFrame();
		// Create label next 
		next : while(true){
		// input is a string received from user
	    input = JOptionPane.showInputDialog(frame, "Number is between 1 and 1000", "Guess the Number!", JOptionPane.QUESTION_MESSAGE);
	    try{
	    	// Make sure user entered a value
	    	if(input != null){	
	    		// Try transform String to int, if input is not a number, go to catch block
	    		int numguess = Integer.parseInt(input);
	    		// Compare input number with random number
	    		// If input number is higher
	    		if (numguess > num){
	    			System.out.printf("%d number is '%s', Too high. Try again\n", count++, numguess);
	    			JOptionPane.showMessageDialog(null, "Too high. Try again.");
	    			continue next;
	    		}
	    		// If input number is lower
	    		else if(numguess < num){
	    			System.out.printf("%d number is '%s', Too low. Try again\n", count++, numguess);
	    			JOptionPane.showMessageDialog(null, "Too low. Try again.");
	    			continue next;
	    		}
	    		// If equal
	    		else if(numguess == num){
	    			System.out.println("Congratulations! Number is " + numguess);
	    			count++;
	    		  		if(count <= 10){
	    		  			JOptionPane.showMessageDialog(null, "Congratulations! Number is " + numguess + "\nEither you know the secret or you got lucky!");
	    		  		}
	    		  		else if(count == 10){
	    		  			JOptionPane.showMessageDialog(null, "Congratulations! Number is " + numguess + "\nAha! You know the secret!");
	    		  		}
	    		  		else if(count >= 10){
	    		  			JOptionPane.showMessageDialog(null, "Congratulations! Number is " + numguess + "\nYou should be able to do better!");
	    		  		}
	    		  	// Stop executing program
	    		  	break next;
	    		}
	    	}
	    	// Execute program termination if cancel/close performed
	    	else frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	// Successful termination
	    	System.exit(0);
	    // Executed if user send unexpected input or did not enter value
	    }catch (NumberFormatException e) {
	    	System.out.println("not a number!"); 
	    	JOptionPane.showMessageDialog(null, "not a number! Try again");
	    	continue next;
	      }
		}//label next
	}//main
}//class
