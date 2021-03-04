/** 
 * a child class of the Circuit class.
 * @author Derek Campbell
 * @version 09/11/2020
 */

 import java.util.ArrayList;

 //"extends" denotes that Serial is a sublass of Circuit.
 public class Serial extends Circuit
 {
     //instance variable of the circuit held as an ArrayList.
     //ArrayLists change size as needed, so there's no excess.
     private ArrayList<Circuit> circuits;
     
     public Serial()
     {
         circuits = new ArrayList<Circuit>();

     }

     /**
      * Adds a new resistor to the "circuit" ArrayList.
      * @param circuit the circuit to be added.
      */
     public void add(Circuit circuit) //Serial or Circuit class?
     {
         circuits.add(circuit);
     }

     //overrides the getResistance() from the Circuit superclass.
     //Ohm's Law: R equivalent = R1 + R2 + R3 + ... 
     public double getResistance()
     {
         double resistance = 0;
         //goes through the ArrayList circuits for each value.
         for(int i = 0; i < circuits.size(); i++)
         {
             //TODO: undefined operator "+"?
             //needs to have recursion in the method otherwise won't work.
             //is getting the resistance for the resistor in position i and adding it to the currently stored value for total resistance.
            resistance = resistance + circuits.get(i).getResistance();
         }
         return resistance;
     }
 }