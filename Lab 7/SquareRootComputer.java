/**
 * @author Derek Campbell
 * @version 10/17/2020
 */
import java.util.Scanner;

/**
 * Greek's method to approximate the square root of a given number.
 */
public class SquareRootComputer {
	public static void main(String[] args) {
		// this is your tester
		// read a value from the user and print the results 
		// along with expected value
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a value whose square root you would like determined: ");
		double x = in.nextDouble();	//makes user input the value for x to determine it's square root.	USE 27.
		System.out.println("The square root of " + x + " is: " + squareRoot(x));
		System.out.println("Expected square root value of 27 is: 5.19615.");
		
		in.close();	//closes the scanner to prevent any unintended errors.
	}

	public static double squareRoot(double x) {
		// from this method come up with a guess
		// and then make the call to the recursive method
		// squareRootGuesser()

		return squareRootGuess(x, x-1);	//fills in the guess g value with x-1 and calls the recursive squareRootGuess().
	}

	private static double squareRootGuess(double x, double g) {
		// recursive method to compute the square root of x
		// you will need to have a base case and a recursive case
		// in this method
		if(Math.abs(Math.pow(g, 2) - x) <= 0.001){	//need Math.abs incase the difference returns a negative value.
			return g;	//base case. If the g^2 is approximately equal to x, then return g.
		}else{
			double betterGuess = ((g + (x/g)) / 2);	//formula for finding the better guess. need the inner parentheses or doesn't work!
			return squareRootGuess(x, betterGuess);	//otherwise we need to return a better guess and try the method again.
		}
		//return 0;
	}

}
