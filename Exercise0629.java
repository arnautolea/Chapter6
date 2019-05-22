/*(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]*/
package Chapter06;

import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Exercise0629  {

	public static void main(String[] args) throws Exception {
		
		int toss = 0;
		int heads = 0;
		int tails = 0;
			// Create label next
			next: while(true){
				// Create JDialog
				JDialog.setDefaultLookAndFeelDecorated(true);
					// Ask for toss
					int response = JOptionPane.showConfirmDialog(null, "Toss Coin?", "Tossing", 
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					// Block executed if user click "Yes"
					if (response == JOptionPane.YES_OPTION) {
						System.out.println("\"Yes\" button clicked");
						toss = toss + 1;
						// Random enum switch case
						switch (Coin.Flip()){
							case HEADS:
								heads = heads + 1;
								System.out.println("Head");
								JOptionPane.showMessageDialog(null, "Head");
								break;
							case TAILS:
								tails = tails + 1;
								System.out.println("Tail");
								JOptionPane.showMessageDialog(null, "Tail");
								break;
						}
			// Continue label
			continue next;
					// Block executed if user click "No"
					} else if (response == JOptionPane.NO_OPTION) {
						System.out.println("\"No\" button clicked");
						System.out.println("Number of toss: " + toss + "\nTotal heads: " + heads + "\nTotal tails: " + tails);
						JOptionPane.showMessageDialog(null, "Number of toss: " + toss + "\nTotal heads: " + heads + "\nTotal tails: " + tails);
						break next;
					}
			}
		// Successful termination
		System.exit(0);
	}
	// Random return enum value 
	public enum Coin{HEADS, TAILS;
		public static Coin Flip(){
	            Random random = new Random();
	            return values()[random.nextInt(values().length)];
		}//coin
	}//enum
}//class