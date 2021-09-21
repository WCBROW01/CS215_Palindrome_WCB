
/**
 * Test application for PalindromeDetector.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Application {
	
	/**
	 * Tests a valid palindrome and an invalid palindrome.
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeDetector pd = new PalindromeDetector();
		
		System.out.print("Checking if \"race car\" is a palindrome (it should be): ");
		System.out.println(pd.isPalindrome("race car") ? "OK" : "ERROR");
		
		System.out.print("Checking if \"not a palindrome\" is a palindrome (it should not be): ");
		System.out.println(!pd.isPalindrome("not a palindrome") ? "OK" : "ERROR");
	}

}
