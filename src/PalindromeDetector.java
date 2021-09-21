import java.util.Stack;

/**
 * Palindrome detector using a stack.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class PalindromeDetector {
	
	// Regex that includes everything but alphanumeric characters
	private final String REGEX = "[^a-zA-Z0-9]";
	
	/**
	 * Tests whether the input string is a palindrome.
	 * @param inputString the string to test
	 * @return whether the string is a palindrome
	 */
	public boolean isPalindrome(String inputString) {
		String outputString;
		char[] inputCharArray;
		char[] outputCharArray;
		int charCounter; // iterator used in for loops
		Stack<Character> charStack = new Stack<Character>();
		
		// Remove all non-alphanumeric characters from string and store it as a character array
		inputString = inputString.replaceAll(REGEX, "");
		inputCharArray = inputString.toCharArray();
		outputCharArray = new char[inputCharArray.length];
		
		// Add characters to stack
		for (charCounter = 0; charCounter < inputCharArray.length; charCounter++) {
			charStack.push(inputCharArray[charCounter]);
		}
		
		// Remove characters from stack and add them to output character array 
		for (charCounter = 0; charCounter < inputCharArray.length; charCounter++) {
			outputCharArray[charCounter] = charStack.pop();
		}
		
		outputString = String.valueOf(outputCharArray);
		return inputString.equals(outputString);
	}
	
}
