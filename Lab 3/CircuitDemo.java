/**
 * A class to run tests on the Circuit class and subclasses
 * @author Horstman
 * @version 02/06/2014
 *  
 */

public class CircuitDemo
{	/**
	method that implements tests for Circuit class and sublclasses
	@param args - Not Used.
 	*/
	
   public static void main(String[] args)
   {
      Parallel circuit1 = new Parallel();
      circuit1.add(new Resistor(100));
      Serial circuit2 = new Serial();
      circuit2.add(new Resistor(100));
      circuit2.add(new Resistor(200));
      circuit1.add(circuit2);
      System.out.println("Combined resistance: " + circuit1.getResistance());
      System.out.println("Expected: 75.0");
      System.out.println();

      Parallel circuit3 = new Parallel();
      circuit3.add(new Resistor(200));
      circuit3.add(new Resistor(100));
      circuit3.add(new Resistor(50));
      System.out.println("Combined resistance: " + circuit3.getResistance());
      System.out.println("Expected: 28.57142857");
      System.out.println();

      Serial circuit4 = new Serial();
      circuit4.add(new Resistor(45));
      circuit4.add(new Resistor(126));
      circuit4.add(new Resistor(50));
      System.out.println("Combined resistance: " + circuit4.getResistance());
      System.out.println("Expected: 221.0");
      System.out.println();

      Serial circuit5 = new Serial();
      circuit5.add(circuit4);
      circuit5.add(circuit3);
      System.out.println("Combined resistance: " + circuit5.getResistance());
      System.out.println("Expected: 249.57142857");
      System.out.println();

      Parallel circuit6 = new Parallel();
      circuit6.add(circuit3);
      circuit6.add(circuit1);
      circuit6.add(new Resistor(100));
      System.out.println("Combined resistance: " + circuit6.getResistance());
      System.out.println("Expected: 17.142857");
      System.out.println();
   }
}

