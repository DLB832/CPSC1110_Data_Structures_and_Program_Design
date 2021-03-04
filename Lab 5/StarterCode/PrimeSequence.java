/**
 * @author Derek Campbell
 * @version 9/28/2020
 */
import java.util.ArrayList;

public class PrimeSequence implements Sequence {
    private int n = 2;
    private ArrayList<Integer> primes = new ArrayList<>();

    
    /**
     * a method to find the next prime number and add it to an ArrayList for finding more prime numbers in a sequence.
     * @return returns the next found prime number.
     */
    public int next() {
        
        boolean isPrime = false;
      
        if(n == 2 || n ==3)	{
            primes.add(n);
            isPrime = true;
          	n++;//needs to incriment to change n
            return n-1; //returns the actual prime number found 2 or 3 in this case not the n used in the next loop.
        }
        else {
          	//continues the loop until a new prime is found.
            while(isPrime == false) {
              	//if n is even, keeps going.
                if(n % 2 == 0) {
                    n++;
                
                }
                else  {
                  	isPrime = true;		// First assume that no prime divides n.
                  
                    for(int i = 0; i < primes.size(); i++) {
                    	if(n % primes.get(i) == 0){
                          	// if a prime is found that divides n, set isPrime back to false. 
                            isPrime = false;
                        	n++;	
                        	break; 	//this breaks us out of the if{}else{} loop back into the while loop to continue looking for a prime.
                    	}
    
                    }
                }
              
                // Now, the while loop will only repeat if isPrime is still false. 
            }
          
          	//finishes the next() mehtod by adding the newly found prime to the ArrayList and returning the found value.
          	primes.add(n);
          	return n;
            
        }
    }


}
