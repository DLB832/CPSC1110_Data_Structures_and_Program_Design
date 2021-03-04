//DEREK CAMPBELL
//DLB832
import java.util.Arrays;
/**
   A class to simulate a combination lock.
*/
public class ComboLock
{
   
	//********* you will need to create appropriate instance variables here
   private int currentNumber = 0; //current value lock dial is set to
   //more variables here ....
   private int temp = 0;
   //turn shows which turn number it is for purposes of storing values in combinationAttemot[].
   private int turn = 0;
   //an array for holding the values landed on by the lock. 
   private int[] combinationAttempt = { 0, 0, 0};
   //the original combination for comparing.
   private int[] combination = { 0, 0, 0};
   
   /**
      Initializes the combination of the lock.
      
   */
   //**** COMPLETE THIS CONSTRUCTOR - input should be 3 number combination
   //**** You may need to set other instance variables other than the 
   //**** arguments here
   //You should verify that the secret number are in the range 0-39 (inclusive)
   //if the values given are not in that range, clamp them.
   //i.e. the call new ComboLock(0, -20, 45) would create a combination of
   // 0, 0, 39  (the -20 gets clamped to 0 because it was less than 0)
   // (the 45 gets clamped to 39 because it was > 39).
   public ComboLock(int secret1, int secret2, int secret3)
   {
      //TODO: clamps work, but can I make it more efficient or elegent? Loop?
      if(secret1 < 0){
         secret1 = 0;//clamp value
      }else if( secret1 > 39){
         secret1 = 39;//clamp value
      }
      if(secret2 < 0){
         secret2 = 0;//clamp value
      }else if( secret2 > 39){
         secret2 = 39;//clamp value
      }
      if(secret3 < 0){
         secret3 = 0;//clamp value
      }else if( secret3 > 39){
         secret3 = 39;//clamp value
      }
      //makes the combination values into the appropriate array for comparing.
      combination[0] = secret1;
      combination[1] = secret2;
      combination[2] = secret3;
   }
   /**
      Resets the state of the lock so that it can be opened again.
   */
   public void reset()
   {
      //Used when running the simulation a second time to reset the combination[].
      if(turn != 0){
         turn = 0;
         combination[0] = 0;
         combination[1] = 0;
         combination[2] = 0;
         combinationAttempt[0] = 0;
         combinationAttempt[1] = 0;
         combinationAttempt[2] = 0;
      }else{
         //Used the first time so as to not reset the combination[].
         turn = 0;
         combinationAttempt[0] = 0;
         combinationAttempt[1] = 0;
         combinationAttempt[2] = 0;
      }
      
      
   }

   /**
      Turns lock left given number of ticks.
      @param ticks number of ticks to turn left
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnLeft(int ticks)
   {
      //turning to the left increases the numbers.
      if (ticks > 0 && ticks <= 40){
         temp = currentNumber + ticks;
         //the number cannot be bigger than 40, so anything above 40 would be the difference around again.
         if (temp > 40){
            temp = temp - 40;
         }
         if (temp < 0){
            temp = temp + 40;
         }
         currentNumber = temp;

         //since turnLeft is the 2nd turn used, stores the attempted value appropriately in combinationAttempt[].
         if (turn == 1){
            combinationAttempt[1] = currentNumber;
         }
         
         turn++;//incriments turn counter to store next attempt value.
      }
   }

   /**
      Turns lock right given number of ticks
      @param ticks number of ticks to turn right
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnRight(int ticks)
   {
      //turning to the right decreases a number. 
	   if (ticks > 0 && ticks <= 40){
         temp = currentNumber - ticks;
         //the number cannot be bigger than 40, so anything above 40 would be the difference around again.
         if (temp > 40){
            temp = temp - 40;
            //currentNumber = temp;
         }
         if (temp < 0){
            temp = temp + 40;
         }
         currentNumber = temp;

         //since turnRight is the 1st and 3nd turns, this adjusts the value stored in the combinationAttempt appropriately.
         if(turn == 0){
            combinationAttempt[0] = currentNumber;
         } else if (turn == 2) {
            combinationAttempt[2] = currentNumber;
         }
         
         turn++;//incriments turn counter to store next attempt value.
      }
   }

   /**
      Returns true if the lock can be opened now
      @return true if lock is in open state
   */
   //**** COMPLETE THIS METHOD
   public boolean open()
   {
      //checks if combinationAttempt[] is equal to combination[] in both length, and content.
      //Arrays.equals returns true value. If it returns true, then open the lock.
      if (Arrays.equals(combinationAttempt, combination) == true){
         return true;
      }else{
         return false;
      }
   }
   /**
   Returns current value dial is pointing at
   @return value dial is pointing at currently
    */
   public int getCurrentNumber() {
	   return currentNumber;
   }
   
}
