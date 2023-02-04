/*
pick six numbers between 1 and 49
after drawing a number,check if it is repeated in drawn numbers
if repeated, loop the draw until it is not repeated
sort the numbers using arrays.sort method
*/

import java.util.Random;

public class Main{
  public static void main (String args[]){
    Random rand = new Random(); // Random object has reference variable rand
    int min=1 , max=49 , slots=6;
    
    int[] lottery= new int[slots];  // Array is declared, memory is allocated and all three elements are initialized to zero(default value)
    boolean isRepeated;
    int randomNumber = 0;
    
    for (int indexDrawn = 0; indexDrawn< slots; indexDrawn++){
      do{
        isRepeated=false;
        randomNumber = rand.nextInt(max-min +1) +min;  /*To generate a random number between 1 and 49*/
        
        for(int i=0; i=< indexDrawn; i++){
          if(lottery[i] == randomNumber){
            isRepeated = true;
            break;
          }
        }
      }
    }
  }
}
