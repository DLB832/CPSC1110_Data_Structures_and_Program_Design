import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Derek Campbell
 * @version 11/05/2020
 */

/**
 * a class used for testing the experimental run time of different array sorting
 * methods.
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {   //needs to throw a file not found exception if output.txt is not present. 

        /**
         * TODO: STEPS
         * 1) Create several random valued arrays of appropriate size
         * 2) start the stop watch
         * 3) sort the array
         * 4) stop the stop watch
         * 5) print (or write to a file) the size of the array and the time it took to sort.
         * 6) make the excel graphs?
         */


        StopWatch timer = new StopWatch();  //creates a new StopWatch object called timer.
        PrintWriter out = new PrintWriter("output.txt");    //writes all of the output to the specified .txt file.
        PrintWriter csvOut = new PrintWriter("CSV output.txt"); //writes all of the output as Comma Seperated Values for importing int Excel. 
        
        //NOTE: Re-randomize between sorting the array or create duplicate arrays that are not sorted for accurate sorting times.
        int[] array1 = ArrayUtil.randomIntArray(100, 100);  //an array of size 100.
        int[] array11 = array1; // a duplicate array so that I am not sorting an already sorted array.
        int[] array111 = array1; // a duplicate array so that I am not sorting an already sorted array.
        timer.start();
        SelectionSorter.sort(array1);
        timer.stop();
        out.println("Elapsed Selection Sorting time for array sized 100: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf("100, " + timer.getElapsedTime() + ", " );
        timer.reset();  //don't forget to reset the timer before starting the next sort for accurate timing. 

        timer.start();
        MergeSorter.sort(array11);
        timer.stop();
        out.println("Elapsed Merge Sorting time for array sized 100: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + ", " );
        timer.reset();

        timer.start();
        Arrays.sort(array111);
        timer.stop();
        out.println("Elapsed Array Sorting time for array sized 100: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + "\n");
        timer.reset();

        int[] array2 = ArrayUtil.randomIntArray(1000, 100);  //an array of size 1,000.
        int[] array22 = array2;
        int[] array222 = array2;
        timer.start();
        SelectionSorter.sort(array2);
        timer.stop();
        out.println("Elapsed Selection Sorting time for array sized 1000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf("1000, " + timer.getElapsedTime() + ", " );
        timer.reset();   

        timer.start();
        MergeSorter.sort(array22);
        timer.stop();
        out.println("Elapsed Merge Sorting time for array sized 1000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + ", " );
        timer.reset();

        timer.start();
        Arrays.sort(array222);
        timer.stop();
        out.println("Elapsed Array Sorting time for array sized 1000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + "\n");
        timer.reset();

        int[] array3 = ArrayUtil.randomIntArray(10000, 100);  //an array of size 10,000.
        int[] array33 = array3;
        int[] array333 = array3;
        timer.start();
        SelectionSorter.sort(array3);
        timer.stop();
        out.println("Elapsed Selection Sorting time for array sized 10,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf("10,000, " + timer.getElapsedTime() + ", " );
        timer.reset();  

        timer.start();
        MergeSorter.sort(array33);
        timer.stop();
        out.println("Elapsed Merge Sorting time for array sized 10,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + ", " );
        timer.reset();

        timer.start();
        Arrays.sort(array333);
        timer.stop();
        out.println("Elapsed Array Sorting time for array sized 10,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + "\n");
        timer.reset();

        int[] array4 = ArrayUtil.randomIntArray(100000, 100);  //an array of size 100,000.
        int[] array44 = array4;
        int[] array444 = array4;
        timer.start();
        SelectionSorter.sort(array4);
        timer.stop();
        out.println("Elapsed Selection Sorting time for array sized 100,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf("100,000, " + timer.getElapsedTime() + ", " );
        timer.reset();   

        timer.start();
        MergeSorter.sort(array44);
        timer.stop();
        out.println("Elapsed Merge Sorting time for array sized 100,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + ", " );
        timer.reset();

        timer.start();
        Arrays.sort(array444);
        timer.stop();
        out.println("Elapsed Array Sorting time for array sized 100,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + "\n");
        timer.reset();

        int[] array5 = ArrayUtil.randomIntArray(1000000, 100);  //an array of size 1,000,000.
        int[] array55 = array5;
        int[] array555 = array5;
        timer.start();
        SelectionSorter.sort(array5);
        timer.stop();
        out.println("Elapsed Selection Sorting time for array sized 1,000,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf("1,000,000, " + timer.getElapsedTime() + ", " );
        timer.reset();   

        timer.start();
        MergeSorter.sort(array55);
        timer.stop();
        out.println("Elapsed Merge Sorting time for array sized 1,000,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + ", " );
        timer.reset();

        timer.start();
        Arrays.sort(array555);
        timer.stop();
        out.println("Elapsed Array Sorting time for array sized 1,000,000: " + timer.getElapsedTime() + " milliseconds");
        csvOut.printf(timer.getElapsedTime() + "\n");
        timer.reset();

        out.close();    // needs to close the output file at the end of running.
        csvOut.close(); //needs to clse the output file at the end of running. 
    }
}
