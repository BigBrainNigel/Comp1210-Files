import java.util.Scanner;
import java.text.DecimalFormat;
/**
   Program that take an x value, calculates the result, outputs the number
   of digits to the left and right of the decimal, and outputs the formatted
   number.
   
   @author Gregory Walker - Comp 1210
   @version 9/7/22
*/
public class RadicalFormula {
   /**
      Takes input x value, calculates the result, and spits out number of
      digits left and right of decimal. Also outputs formatted number.
      
      @param args - not used
   */
   public static void main(String[] args) {
      
      //Setting up objects and variables
      Scanner userInput = new Scanner(System.in);
      DecimalFormat numFormat = new DecimalFormat("#,##0.0##");
      double x, result;
      int decimalIndex, resultLength, numRightDecimal;
      String resultString = ("");
      
      //Prompts user for x input
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
      
      //Calculates result using x input and prints it
      result = Math.sqrt(((Math.pow(((3 * Math.pow(x, 8)) 
         - (2 * Math.pow(x, 3))), 2)) + (Math.abs(((3 * Math.pow(x, 5)) 
           - (2 * Math.pow(x, 3)))))));
      System.out.println("Result: " + result);
      
      //Finds & prints num right and left of decimal and prints formatted result
      resultString = Double.toString(result);
      decimalIndex = resultString.indexOf(".");
      resultLength = resultString.length();
      numRightDecimal = (resultLength - (decimalIndex + 1));
      System.out.println("# digits to left of decimal point: " + decimalIndex);
      System.out.println("# digits to right of decimal point: " 
         + numRightDecimal);
      System.out.println("Formatted Result: " + numFormat.format(result));
      
      
   
   }

}