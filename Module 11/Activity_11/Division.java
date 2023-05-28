/**
   Public class that has two static methods. On to divide two integers and
   return the result as an integer, and one to divide two integers as
   doubles and return the result as a double.
   
   Activity 11
   @author Gregory Walker - Comp 1210
   @version 11/14/22
*/
public class Division {
   
   
   /**
      Public method that takes input for a numerator and denominator and
      uses them to perform integer division. Will catch an 
      ArithmeticException and return zero if the denominator is zero.
      
      @param numeratorIn - Accepts integer input for a value to serve as
      the numerator for divison.
      @param denominatorIn - Accepts integer input for a value to serve as
      the denominator for division.
      @return int - Returns an integer value for the result of dividing
      two numbers.
   */
   public static int intDivide(int numeratorIn, int denominatorIn) {
   
      try {
      
         return (numeratorIn / denominatorIn);
      
      }
      catch (ArithmeticException e) {
      
         return 0;
      
      }
   
   }
   
   /**
      Public method that takes input for a numerator and denominator and
      uses them to perform floating point division.
      
      @param numeratorIn - Accepts integer input for a value to serve as
      the numerator for divison.
      @param denominatorIn - Accepts integer input for a value to serve as
      the denominator for division.
      @return double - Returns a double value for the result of dividing
      two numbers.
      @throws IllegalArgumentException - Checks to see if the denominator
      is zero, and if it is, throws an exception.
   */
   public static double decimalDivide(int numeratorIn, int denominatorIn) {
      
      if (denominatorIn == 0) {
      
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      
      }
      
      return (((double) numeratorIn) / ((double) denominatorIn));
   
   }

}