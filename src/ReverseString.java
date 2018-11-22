/**
 * Student Name: Levidu Bandara Alahakoon
 * Class: 9294 
 * Lab: 9296 (8:15am-9:10am)
 * Module 1 Programming Assignment
 */

//importing scanner package
import java.util.Scanner;


public class ReverseString {

	/*
	 * The recursion action occurs here. A string that is entered from the scanner object
	 * is passed to this method. This method recursively reverse the word and shows the output.
	 * @param The string that is passed by the user
	 * @return The converted/reversed string
	 */
	public String reverseAction(String theString) {

		if(theString.length()==0) {
			return theString;
		}
		else {
			return reverseAction(theString.substring(1))+theString.charAt(0);
		}
	}
	/*
	 * This is where the main action occurs. The user is asked to enter the text. Afterwards,
	 * the program checks if the word/s are/is (an)example of (a) palindrone(s)
	 * @return The results are from the comparison is printed in the console
	 */
	public void bootstrap() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Type to enter text or type \"done\": ");
		
		String userEntered = input.nextLine();
		
		//User may end this program by typing "done". Else, this program will continue to run.
		while (!userEntered.equals("done")) {
			
			//This section of the code runs when the text entered is an example of a palindrone

			if  (userEntered.equals(reverseAction(userEntered))) {

				System.out.println("User's input: " + userEntered);

				System.out.println("Reversed: " + reverseAction(userEntered));

				System.out.println("This is an example of a palindrone\n");
				//After the results are shown, the user is immediately prompted with another input
				
				System.out.println("Type to enter text or type \"done\": ");
				userEntered = input.nextLine();
			}

				//This section of the code runs when the text entered is not an example of a palindrone
				else {

					System.out.println("User's input: " + userEntered);

					System.out.println("Reversed: " + reverseAction(userEntered));

					System.out.println("This is not an example of a palindrone\n");
					
					//After the results are shown, the user is immediately prompted with another input
					
					System.out.println("Type to enter text or type \"done\": ");
					userEntered = input.nextLine();
				}
		}
		//Exit message when the user types "done"
		System.out.println("The program ended:");
		input.close();
	}
}

				
		
				
				
			
	

	

				


				
				
			
			
		




	
