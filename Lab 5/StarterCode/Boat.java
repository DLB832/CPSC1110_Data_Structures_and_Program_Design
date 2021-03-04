/**
 * @author Derek Campbell
 * @verison 9/28/2020
 */

public class Boat extends Vehicle {
    public String className = "Boat";  //needed for the inherited getName() method from Vehicle superclass.

    /**
     * Constructor method for the Boat subclass.
     * @param efficiency - the boat's efficiency. Calls the super class constructor.
     */
    Boat(double efficiency){
        super(efficiency);
    }

    public void printMessage(){
        System.out.println("I am a Boat, VROOM!!!");
    }

}
