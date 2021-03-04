/** 
 * a child class of the Circuit class.
 * @author Derek Campbell
 * @version 09/11/2020
 */

 //extends denotes that Resister is a sublass of Circuit.
 //Resisters should be stored as type double.
 public class Resistor extends Circuit
 {
     //instace variable to hold the value of the resistor.
     private double resistance;

     /** constructor method that makes the resister with it's resist value.
      * @param resist the value for the resistor measured in Ohms. 
      */
     public Resistor(double resist)
     {
         resistance = resist;
     }

     //overrides the getResister() from the Circuit superclass.
     //return resistance value.
     public double getResistance() 
     {
         return resistance;
     }


 }