/**
   Public class that creates a score array and can find the evens, odds, the
   average, convert it to a string, and convert it to a string backwards.
   
   @author Gregory Walker - Comp 1210
   @version 10/25/22
*/
public class Scores {
   
   private int[] numbers;
   
   /**
      Constructor that creates an array of integers.
      
      @param numbersIn - Takes integer array input 
   */
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   
   }
   
   /**
      Public method that finds all of the even numbers in a given array.
      
      @return int[] - Returns an array of the even numbers in the given array.
   */
   public int[] findEvens() {
   
      int numberEvens = 0, count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 0) {
         
            numberEvens++;
         
         }

      }
      
      int[] evens = new int[numberEvens];
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 0) {
         
            evens[count] = numbers[i];
            count++;
         
         }
      
      }
      
      return evens;
      
   }
   
   /**
      Public method that finds all of the odd numbers in a given array.
      
      @return int[] - Returns an array of the odd numbers in the given array.
   */
   public int[] findOdds() {
   
      int numberOdds = 0, count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 1) {
         
            numberOdds++;
         
         }

      }
      
      int[] odds = new int[numberOdds];
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 1) {
         
            odds[count] = numbers[i];
            count++;
         
         }
      
      }
      
      return odds;
   
   }
   
   /**
      Public method that finds the average of all of the numbers in a given
      array.
      
      @return double - Returns a double value for the average of the numbers
      in the given array.
   */
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         sum += numbers[i];
      
      }
      
      return ((double) sum / numbers.length);
   
   }
   
   /**
      Public method that returns the numbers in the given array as a string.
      
      @return String - Returns the numbers in the given array as a string.
   */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
      
         result += (numbers[i] + "\t");
      
      }
      
      return result;
   
   }
   
   /**
      Public method that returns the numbers in the given array as a reversed
      string.
      
      @return String - Returns the numbers in the given array reversed as a
      string.
   */
   public String toStringInReverse() {
      
      String result = "";
      
      for (int i = (numbers.length - 1); i >= 0; i--) {
      
         result += (numbers[i] + "\t");
      
      }
      
      return result;
   
   }
   
}