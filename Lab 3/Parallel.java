/** 
 * a child class of the Circuit class.
 * @author Derek Campbell
 * @version 09/11/2020
 */

import java.util.ArrayList;

//"extends" denotes that Serial is a sublass of Circuit.
public class Parallel extends Circuit
{
    //instance variable of the circuit held as an ArrayList.
    //ArrayLists change size as needed, so there's no excess.
    private ArrayList<Circuit> circuits;
    
    public Parallel()
    {
        circuits = new ArrayList<Circuit>();

    }

    /**
      * Adds a new resistor to the "circuit" ArrayList.
      * @param circuit
      */
    public void add(Circuit circuit) 
    {
        circuits.add(circuit);
    }

    //overrides the getResistance() from the Circuit superclass.
    //Ohm's Law: (1/R equivalent) = (1/R1) + (1/R2) + (1/R3) + ... 
    public double getResistance()
    {
        double resistance = 0;
        //goes through the ArrayList circuits for each value.
        for(int i = 0; i < circuits.size(); i++)
        {
           resistance = resistance + 1/circuits.get(i).getResistance();
        }
        return 1/resistance;
    }
}