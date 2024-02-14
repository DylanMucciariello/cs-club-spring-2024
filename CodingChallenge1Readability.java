import java.util.Scanner;

public class CodingChallenge1Readability {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Text Here: ");
		String text = userInput.nextLine();
		// Initialize variables to count letters, words, and sentences
		int letters = 0;
		int words = 1; 
		int sentences = 0;
		// Iterate through each character in the input text
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
            // If the character is a letter, increment the letter counter
			if (Character.isLetter(c)) {
				letters++;
			}
            // If the character is a space, increment the word counter
			else if (c == ' ') { 
				words++;
			}
            // If the character is a period, question mark, or exclamation mark, increment the sentence counter
			else if (c == '.' || c == '?' || c == '!') {
				sentences++;
			}
		}
		
        //Cast to double then Calculate the average number of letters and sentences per 100 words
		double L = ((double) letters / (double) words) * 100;
		double S = ((double) sentences / (double) words) * 100;

        // Calculate the Automated Readability Index (ARI) score
		int index = (int) Math.round((0.0588 * L) - (0.296 * S) - 15.8);

        // Determine the readability grade based on the ARI score and print the result
		if (index < 1) {
			System.out.println("Before Grade 1");
		} 
		else if (index > 16) {
			System.out.println("Grade 16+");
		} 
		else {
			System.out.println("Grade " + index);
		}
		userInput.close();
	}

}
// Enter Text Here:
// Congratulations! Today is your day. You're off to Great Places! You're off and away!
// Grade 3
