import java.util.Scanner;
/**
   Program that takes the input of x, y, and z and returns the result 
   of the equation using those variables.
   
   @author Gregory Walker - Comp 1210
   @version 8/30/22
*/
public class MySolver {
   /**
      Prints used equation, asks user for x, y, and z variables, and then 
      calculates and prints the result. If z == 0, the answer returns as 
      undefined.
      
      @param args - not used
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0.0;
      double y = 0.0;
      double z = 0.0;
      double result = 0.0;
      
      //Prints used equation
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
     
     //Prompts user for x value
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      //Prompts user for y value
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      //Prompts user for z value
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      //Uses user inputs to calculate the result
      result = (8.5 * x + 6.1) * (10 * y + 7.9) / z;
      
      //Decides what to output. if z == 0, outputs
      //undefined, else, outputs the result.
      if (z == 0) {
         
         System.out.println("result is undefined");
      
      }
      else {
      
         System.out.println("result = " + result);
      
      }
   }

}