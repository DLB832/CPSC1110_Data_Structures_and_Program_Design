/**
 * @author Derek Campbell
 * @version 10/03/2020
 */

 import java.util.Scanner;  //imports the Scanner class to use user input.
 import java.io.File;   //imports the File class which lets us use .txt files within a package for input and output.
 import java.io.FileNotFoundException;  //imports the FileNotFound class for throwing and catching unchecked arguements.
 import java.io.PrintWriter; //imports an extension to the Print class for having desired output printed to a .txt file.

 /**
  * CapacitorVoltage class used to parctice I/O from files utilizing the equation for voltage across capacitors over time.
  */
 public class CapacitorVoltage {
     
    public static void main(String[] args) throws FileNotFoundException {

        boolean fileFound = false;  //sets the initial state of the fileFound to false.
        while (!fileFound){ //loops until an appropriate input file is found.
            try {
                Scanner console = new Scanner(System.in);   //creates a new scanner named "console"
                System.out.println("Input file: "); //prompts the user to input the name for the input file to be used.
                String inputFileName = console.next();  // calls the console for input. use params.txt
                System.out.println("Output file: ");    //prompts the user to input the name for the output file to be used. rc.txt
                String outputFileName = console.next(); //calls the console for input. use rc.txt

                File inputFile = new File(inputFileName);   //turns the user inputed file name into a useable file the Scanner can read.
                Scanner in = new Scanner(inputFile);    //creates a new scanner which will scan the inputFile for the input to be used.
                PrintWriter out = new PrintWriter(outputFileName);  //an extension of the print class. will print output to desired file.
                fileFound = true;   // if no exception is thrown, then fileFound is set to true to prevent the while loop from repeating.

                //v(t) = B(1-e^(-t/RC)) : equation for the voltage across capacitors over t seconds. 
                //"e" is a mathematical constant. use the Math.E representation.
                double b = 0;
                double r = 0;
                double c = 0;
                double t = 0;
                double until = 0;
                double voltage;

                while (in.hasNextDouble()) {    //as long as there is another double value in the input file, the loop runs.
                    b = in.nextDouble();    //first double in the input file represents B.
                    r = in.nextDouble();    //next double in the input file represents R.
                    c = in.nextDouble();    //next double in the input file represents C.
                    t = in.nextDouble();    //next double in the input file represents t.
                    until = in.nextDouble();    //final double in the input file represents the end point for time measurements.
                }

                while(t <= until){  //runs the loop until reaching the designated time value marked "until".
                    voltage = b*(1-Math.pow((Math.E),(-t/(r*c)))); //java representation of the above equation.
                    out.printf("%15.2f", t);    //prints the time value.
                    out.printf("%15.5f\n", voltage);   //prints the appropriate voltage at the corresponding time value.
                    t = t + 10; //incriments by 10 seconds each time.
                }

                in.close(); //need to make sure to manually close the input files and scanners.
                out.close();    // need to make sure to manually close the output files and scanners to prevent data corruption.
                console.close();    //need to make sure to manually close the input scanners.
            }   
            
            catch (FileNotFoundException exception) {
                System.out.println("Input file not found. Please input a different file.");
                System.out.println();
                //since the exception was thrown, the fileFound is still false and will re-run the loop.
            }
        }
    }
 }

 