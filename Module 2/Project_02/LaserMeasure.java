import java.util.Scanner;
/**
   Program that takes an inpuut number of inches and figures out how
   many miles, yards, feet, and/or inches the inputed amount makes up.
   
   @author Gregory Walker - Comp 1210
   @version 8/31/22
*/
public class LaserMeasure {
/**
   Method that takes an input of inches and converts the input to
   the amount of miles, yards, feet, and inches the inputted number
   of inches makes up.
   
   @param args - not used
*/
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int distanceInInches = 0;
      int miles = 0;
      int yards = 0;
      int feet = 0;
      int inches = 0;
      int tempRemainder = 0;
      
      //Prompts user for distance in inches
      System.out.print("Enter the raw distance measurement in inches: ");
      distanceInInches = userInput.nextInt();
      
      //Checks if input is less than 0
      if (distanceInInches < 0) {
      
         System.out.println("Measurement must be non-negative!");
      
      }
      else {
         
         //Calculates miles from input inches, and finds remainder
         miles = (distanceInInches / 63360);
         tempRemainder = (distanceInInches % 63360);
         
         //Calculates yards from previous remainder, and finds a new remainder
         yards = (tempRemainder / 36);
         tempRemainder = (tempRemainder % 36);
         
         //Calculates feet from previous remainder, and finds a new remainder
         feet = (tempRemainder / 12);
         tempRemainder = (tempRemainder % 12);
         
         //Calculates inches from previous remainder
         inches = tempRemainder;
         
         //Prints all measurements including input inches, miles, yards, feet,
         //and remaining inches
         System.out.println("");
         System.out.println("Measurement by combined miles,"
            +  " yards, feet, inches: ");
         System.out.println("\tmiles: " + miles + "\n\tyards: " + yards 
            + "\n\tfeet: " + feet + "\n\tinches: " + inches + "\n");
         System.out.println(distanceInInches + " in = " + miles + " mi, " 
            + yards + " yd, " + feet + " ft, " + inches + " in");
         
         
      
      }
   
   }

}