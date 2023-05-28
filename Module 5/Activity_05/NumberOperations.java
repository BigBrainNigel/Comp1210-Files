/**
   Takes input for a number and can get the value of it, find the number of
   odd numbers beneath it, find the number of even numbers beneath it, and
   can check if the first input number is greater than a comparison number.
   
   @author Gregory Walker - Comp 1210
   @version 9/19/22
*/
public class NumberOperations {
   
   private int number;
   /**
      Constructor that takes and integer input and sets it equal to the
      variable number.
      
      @param numberIn - Integer input for a number.
   */
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   /**
      Public method that returns that value of the variable number.
      
      @return int - Return type for the variable number.
   */
   public int getValue() {
   
      return number;
   
   }
   /**
      Public method that finds and returns the amount of odd numbers under
      the input number.
      
      @return String - Return type for the output variable.
   */
   public String oddsUnder() {
      
      String output = "";
      int i = 0;
      
      while (i < number) {
      
         if (i % 2 != 0) {
         
            output += i + "\t";
         
         }
         
         i++;
      
      }
      
      return output;
   
   }
   /**
      Public method that returns the numbers that are to the power of 2
      underneath the input number.
      
      @return String - Return type for output variable.
   */
   public String powersTwoUnder() {
      
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         
         output += powers + "\t";
         powers = powers * 2;
         
      }
      
      return output;
   
   }
   /**
      Public method that returns an integer depending on if the input number
      is greater than, less than, or equal to the input number.
      
      @param compareNumber - Integer input for checking if a number is greater
      than the input number.
      @return int - Return type that returns an int depending on if value is 
      greater than, less than, or equal to the input number.
   */
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
      
         return 1;
      
      }
      else if (number < compareNumber) {
      
         return -1;
      
      }
      else {
      
         return 0;
      
      }
   
   }
   /**
      Public method that number input as returns a string.
      
      @return String - Return type for number variable as a string.
   */
   public String toString() {
   
      return number + "";
   
   }

}