/**
 * @author Derek Campbell
 * @version 9/28/2020
 */

public class Vehicle implements Efficiency {
    
    double efficiency;    //instance variable for the vehicles efficiency. Inheritied by the subclasses.
    private String className = "Vehicle";

    /**
     * Constructor method for the vehicle class.
     */
    Vehicle(double efficiency){
        this.efficiency = efficiency;
    }

    public void printMessage(){
        System.out.println("I am a Vehicle, VROOM!!!");
    }

    public String getName(){
        return this.getClass().getSimpleName(); //I have no idea why this works, but thank you tutorer for the fix.
    }

    /**
     * has to impliment the abstract getEfficiency() method from the interface type (in this case Efficiency).
     * NOTE: This gives this method to the subclasses also; due to inheritance.
     * @return returns the efficiency value for the vehicle.
     */
    @Override   //indicates that the method overrides another method from the implemented interface class.
    public double getEfficiency() {
        return efficiency;
    }

}
