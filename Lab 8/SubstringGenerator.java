/**
 * @author Derek Campbell
 * @version 10/26/2020
 */

import java.util.ArrayList;

/**
 * This class generates substrings of a string.
 */
public class SubstringGenerator {
	public static ArrayList<String> getSubstrings(String word) {
		//this is the value you will return
		ArrayList<String> result = new ArrayList<String>();
		//need to use ArrayList adding methods.

		//come up with a base case first
		//since we are removing the first character of each substring, once the length of the word reaches 0 we want to stop.
		if (word.length() == 0){
			result.add("");	//an empty string is a substring of a word. We only want it added once though so add it with base case. 
			return result;	//the array list which stores each substring. 
		}




		// Below here is the recursive case
		// Form a simpler word by removing the first character
		String smallerWord = word.substring(1);	//the substring method creates a substring of a word starting at the indicated index value. 
		//in this case, we want the index value 1 so the first character is removed each time.
		




		// Generate all substrings of the simpler word
		// This is where you will make a recursive call
		// You can store the result from this temporary call in 
		// your results ArrayList
		result = getSubstrings(smallerWord);	//this is the recursive method. It calls itself on each smaller substring we create by removing the first character.

		
		// Add all strings that start with word.charAt(0)
		// You will need a loop here
		for (int i = 1; i <= word.length(); i++){ // if i = 0, will return the empty substring every time. Make i = 1 to avoid this.
			result.add(word.substring(0,i));	//loop has to be <= the length of the word, otherwise it won't return the last character of the word.
		}
		
		
		// Return all substrings
		return result;	//returns array list with all of the substring values on it. 
	}
}
