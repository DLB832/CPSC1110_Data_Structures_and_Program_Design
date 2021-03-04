/**
 * @author Derek Campbell
 * @version 9/28/2020
 */

import java.util.Random; //need to be able to assign random values.

 /**
  * the tester class for the Vehicle superclass, Efficiency interface, and Car and Boat subclasses.
  */
public class Tester {

    //These values need to be initialized outside of the main method in order to be used in both static methods main and getFirstThreshold.
    final static int NUM_VEHICLES = 10; // constant value.
    static double[] initialVehicle = new double[NUM_VEHICLES];  //creates a new Array with a number of elements equal to the NUM_VEHICLES constant value. Used for randomizing.
    static Vehicle[] Vehicle = new Vehicle[NUM_VEHICLES];  //creates an array to store the type of vehicle with a number of elements equal to NUM_VEHICLES.

    public static void main(String[] args) {
        
        //fills in array with a random number corresponding to the type of vehicle, and give the vehicles a random efficiency.
        Random generator = new Random();    //new random generator to fill the array with random vehicles
        for( int i = 0; i < NUM_VEHICLES; i++){
            initialVehicle[i] = generator.nextInt(3);      //generates random values between 0 and 2 inclusive for the array Vehicle[].
            System.out.println(initialVehicle[i]);
        }
        
        //used to switch the random values on the initialVehicle[] with the appropriate object type in Vehicle[].  
        for(int i = 0; i < NUM_VEHICLES; i++){
            double efficiency;
            Random efficiencyGenerator = new Random();
            efficiency = efficiencyGenerator.nextDouble() * 100;
            if(initialVehicle[i] == 0){
                //add vehicle
                Vehicle[i] = new Vehicle(efficiency);
                
            }else if(initialVehicle[i] == 1){
                //add car
                Vehicle[i] = new Car(efficiency); 
            }else{
                //add boat.
                Vehicle[i] = new Boat(efficiency);
            }
        }
        
        /**
         * loop that prints out the information for each vehicle in the array.
         */
        for(int i = 0; i < NUM_VEHICLES; i++){
            System.out.println();
            Vehicle[i].printMessage();
            System.out.print(Vehicle[i].getName() + ": " + Vehicle[i].getEfficiency());   
            System.out.println();

        }
        System.out.println();
        /**
         * runs getFirstBelow method on the Tester class.
         * uses 20 as the threshold.
         */
        Tester.getFirstBelow(20.0);


       
        

    }
     
    /**
     * an accessor method to find the first vehicle in the array with an efficiency less than the desired threshold.
     * @param threshold - the desired value of efficiency to be compared to.
     * @return - returns the first vehicle in the array with an efficiency lower than the threshold (if there is one).
     */
    private static Vehicle getFirstBelow(double threshold) {
        for(int i = 0; i < NUM_VEHICLES; i++){
            if(Vehicle[i].getEfficiency() < threshold){
                System.out.println("The first object with efficiency less than 20 was " + Vehicle[i].getClass() + " with efficiency " + Vehicle[i].getEfficiency());
                return Vehicle[i];
            }else{
                
            }

        }
        System.out.println("There was no vehicle in the list with an efficiency less than " + threshold);
        return null;
    }


}
