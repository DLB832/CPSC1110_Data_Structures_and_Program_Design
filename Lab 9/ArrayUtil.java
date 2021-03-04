/**
 * @author Derek Campbell
 * @version 11/05/2020
 * NOTE: Taken from Big Java 6th ed.
 */

import java.util.Random;

/**
 * this class contains utility methods for array manipulation.
 */
public class ArrayUtil {

    private static Random generator = new Random();

    /**
     * creates an array filled with random values.
     * @param length the length of the array.
     * @param n the number of possible random values. the bound.
     * @return an array filled with length numbers between 0 and n-1.
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }
        
    /**
     * swaps two entries of an array.
     * @param a the array.
     * @param i the first position to swap.
     * @param j the second position to swap.
     */
	public static void swap(int[] a, int i, int j) {
        int temp = a[i];    //a temporary holding space for the value of element i in the array a.
        a[i] = a[j];
        a[j] = temp;
    }
    
   
    
}
