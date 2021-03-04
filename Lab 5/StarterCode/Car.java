/**
 * @author Derek Campbell
 * @version 9/28/2020
 */

public class Car extends Vehicle {
    public String className = "Car";   //needed for the inherited getName() method from Vehicle superclass.

    /**
     * Constructor method for the Car subclass.
     * @param efficiency - the efficiency of the car. calls the super class constructor.
     */
    Car(double efficiency){
        super(efficiency);
    }

    public void printMessage(){
        System.out.println("I am a Car, VROOM!!!");
    }

}
